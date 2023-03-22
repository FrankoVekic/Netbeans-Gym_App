/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gymapp.utility;

import com.github.javafaker.Faker;
import gymapp.model.Member;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.hibernate.Session;

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
            m.setOib(createOib());
            m.setPhoneNumber(faker.phoneNumber().cellPhone());
            m.setActive(faker.bool().bool());
            session.save(m);
            members.add(m);
            
        }
        
        return members;
    }

    private static String createOib() {
        int[] num = {0,1,2,3,4,5,6,7,8,9};
        String s = "";
        
          for(int i = 0; i < 11; i++){
            Random r = new Random();
            int a = r.nextInt(9);
            s = s+ num[a];         
        }
          return s;
    }
    
}
