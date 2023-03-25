/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gymapp.utility;

import com.github.javafaker.Faker;
import gymapp.model.Admin;
import gymapp.model.Member;
import gymapp.model.Program;
import gymapp.model.ProgramMemberTrainer;
import gymapp.model.Trainer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;
import org.hibernate.Session;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 */
public class FakerInput {

    public static void executeFakerInserts() {
        Session session = HibernateUtility.getSession();
        session.beginTransaction();
        Faker faker = new Faker();

        List<Admin> admins = generateAdmins(faker, session);
        List<Trainer> trainers = generateTrainers(faker, session);
        List<Member> members = generateMembers(faker, session);
        List<Program> programs = generatePrograms(session);

        Member m;
        Trainer t;
        Program p;
        ProgramMemberTrainer pmt;

        try {
            for (int i = 0; i < (members.size()); i++) {
                m = members.get(i);
                pmt = new ProgramMemberTrainer();
                pmt.setDateStart(new Date());
                pmt.setDuration(30);
                pmt.setDescription("Random description " + i);
                pmt.setMember(m);
                Collections.shuffle(trainers);
                Collections.shuffle(programs);
                pmt.setTrainer(trainers.get((int) Math.random() * (0 - trainers.size())));
                pmt.setProgram(programs.get((int) Math.random() * (0 - programs.size())));
                session.save(pmt);
            }

        } catch (Exception e) {
        }

        session.getTransaction().commit();
    }

    private static List<Member> generateMembers(Faker faker, Session session) {

        List<Member> members = new ArrayList();

        Member m;

        for (int i = 0; i < 80; i++) {

            m = new Member();

            m.setName(faker.name().firstName());
            m.setSurname(faker.name().lastName());
            m.setEmail(faker.name().firstName().substring(0, 1).toLowerCase()
                    + "." + faker.name().lastName().toLowerCase().replace(" ", "") + "@gmail.com");
            m.setOib(Helper.generateOib());
            m.setPhoneNumber(faker.phoneNumber().cellPhone());
            m.setActive(faker.bool().bool());
            session.save(m);
            members.add(m);

        }

        return members;
    }

    private static List<Trainer> generateTrainers(Faker faker, Session session) {

        List<Trainer> trainers = new ArrayList();

        Trainer t;

        for (int i = 0; i < 5; i++) {
            t = new Trainer();

            t.setName(faker.name().firstName());
            t.setSurname(faker.name().lastName());
            t.setEmail(faker.name().firstName().substring(0, 1).toLowerCase() + "."
                    + faker.name().lastName().toLowerCase().replace(" ", "") + "@gmail.com");
            t.setOib(Helper.generateOib());
            t.setPhoneNumber(faker.phoneNumber().cellPhone());
            session.save(t);
            trainers.add(t);
        }
        return trainers;
    }

    private static List<Admin> generateAdmins(Faker faker, Session session) {

        List<Admin> admins = new ArrayList();

        Admin a;

        a = new Admin();
        a.setName("Franko");
        a.setSurname("Vekić");
        a.setUsername("fvekic");
        a.setEmail("franko.vekic@gmail.com");
        a.setPassword(BCrypt.hashpw("test", BCrypt.gensalt()));
        session.save(a);
        admins.add(a);

        return admins;
    }

    private static List<Program> generatePrograms(Session session) {

        List<Program> programs = new ArrayList();

        Program p;
        //Silver Program
        p = new Program();
        p.setName("Silver Program");
        p.setDescription("This program is intended for people who plan to train "
                + "recreationally in the gym, the training is held privately by a "
                + "trainer of their choice 2 times a week.");
        p.setPrice(BigDecimal.valueOf(150));
        session.save(p);
        programs.add(p);

        //Gold Program
        p = new Program();
        p.setName("Gold Program");
        p.setDescription("This program is intended for people who plan to train "
                + "more often. In addition to their training, a private trainer will "
                + "guide them as well as their nutrition plan. I can train 4 times a "
                + "week.");
        p.setPrice(BigDecimal.valueOf(300));
        session.save(p);
        programs.add(p);

        //Premium Program
        p = new Program();
        p.setName("Premium Program");
        p.setDescription("This program is the best we have to offer."
                + " You will have a personal trainer who is at your "
                + "disposal for any question at any time of the day, 7 "
                + "days a week. You can train with snow every day. The "
                + "trainer also guides you on a diet plan.");
        p.setPrice(BigDecimal.valueOf(500));
        session.save(p);
        programs.add(p);

        return programs;
    }
}
