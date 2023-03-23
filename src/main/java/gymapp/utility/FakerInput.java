/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gymapp.utility;

import com.github.javafaker.Faker;
import gymapp.model.Admin;
import gymapp.model.Member;
import gymapp.model.Trainer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.hibernate.Session;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 */
public class FakerInput {

    

    private static List<Member> generateMembers(Faker faker, Session session) throws Exception{
        
        
        List<Member> members = new ArrayList();
        
        Member m;

        for(int i = 0; i < 80; i++){
            
            m = new Member();
            
            m.setName(faker.name().firstName());
            m.setSurname(faker.name().lastName());
            m.setEmail(faker.name().firstName().substring(0,1).toLowerCase() 
                    + "." + faker.name().lastName().toLowerCase().replace(" ", "") + "@gmail.com");
            m.setOib(Helper.generateOib());
            m.setPhoneNumber(faker.phoneNumber().cellPhone());
            m.setActive(faker.bool().bool());
            session.save(m);
            members.add(m);
            
        }
        
        return members;
    }
    
    
    private static List<Trainer> generateTrainers (Faker faker, Session session){
        
        List<Trainer> trainers = new ArrayList();
        
        Trainer t;
        
        for(int i = 0; i < 5; i++){
            t = new Trainer();
            
            t.setName(faker.name().firstName());
            t.setSurname(faker.name().lastName());
            t.setEmail(faker.name().firstName().substring(0,1).toLowerCase() + "." 
            + faker.name().lastName().toLowerCase().replace(" ", "") + "@gmail.com");
            t.setOib(Helper.generateOib());
            t.setPhoneNumber(faker.phoneNumber().cellPhone());
            session.save(t);
            trainers.add(t);
        }
        return trainers;
    }
    
    private static List<Admin> generateAdmins(Faker faker, Session session){
        
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
/*
    private static String createOib() {
        int[] num = {0,1,2,3,4,5,6,7,8,9};
        String s = "";
        
          for(int i = 0; i < 11; i++){
            Random r = new Random();
            int a = r.nextInt(9);
            s = s+ num[a];         
        }
          return s;
    }*/
    
}
