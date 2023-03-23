/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gymapp.utility;

/**
 *
 */
public class GymAppException extends Exception {
    
    private String message;
    
    public GymAppException(String message){
        super();
        this.message = message;
    }
    
    public String getMessage(){
        return message;
    }

}
