/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gymapp.main;

import gymapp.utility.FakerInput;
import gymapp.utility.HibernateUtility;
import gymapp.view.SplashScreen;

/**
 *
 */
public class Start {
    public static void main(String[] args) {
        
        //HibernateUtility.getSession();
        //FakerInput.executeFakerInserts();
        new SplashScreen().setVisible(true);
    }
}
