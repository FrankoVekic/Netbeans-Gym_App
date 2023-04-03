/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gymapp.utility;

import gymapp.controller.AdminController;
import gymapp.controller.MemberController;
import gymapp.model.Admin;
import gymapp.model.Member;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 */
public class Testing {
    public static void main(String[] args) {
        Member m = new Member();
        MemberController mc = new MemberController();
        m.setName("Member1");
        m.setSurname("Member1");
     // m.setOib("");
        m.setEmail("new@gmail.com");
     // m.setActive(Boolean.TRUE);
        m.setPhoneNumber("+385919820403");
        
        mc.setEntity(m);
        
        try {
            mc.create();
        } catch (GymAppException ex) {
            System.out.println(ex.getMessage());
        }
        
        
   /*
        Admin a = new Admin();
        AdminController ac = new AdminController();
        a.setEmail("test@gmail.com");
        a.setName("Test");
        a.setSurname("Tester");
        a.setUsername("username");
        a.setPassword("testtest");
        
        ac.setEntity(a);
        try {
            ac.create();
        } catch (GymAppException ex) {
            System.out.println(ex.getMessage());
        }
        */
        
    }
}
