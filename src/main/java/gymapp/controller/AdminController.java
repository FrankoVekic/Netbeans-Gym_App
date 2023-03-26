/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gymapp.controller;

import gymapp.model.Admin;
import gymapp.utility.GymAppException;
import java.util.List;
import java.util.regex.Pattern;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

/**
 *
 */
public class AdminController extends Controller<Admin> {

    @Override
    public List<Admin> read() {
        return session.createQuery("from Admin").list();
    }

    @Override
    protected void controlCreate() throws GymAppException {
        controlName();
        controlSurname();
        controlUsername();
        controlPassword();
        controlEmail();
    }

    @Override
    protected void controlUpdate() throws GymAppException {

    }

    @Override
    protected void controlDelete() throws GymAppException {

    }

    @Override
    protected void saveAfter() throws GymAppException {

    }

    private void controlName() throws GymAppException {
        if (entity.getName() == null || entity.getName().trim().isEmpty()) {
            throw new GymAppException("Invalid name.");
        }
        if (entity.getName().trim().length() > 255) {
            throw new GymAppException("Your name has to many characters.");
        }
        if (entity.getName().trim().length() < 2) {
            throw new GymAppException("Name has to have atleast 2 characters.");
        }
        if (!Pattern.matches("[a-zA-Z]+", entity.getName())) {
            throw new GymAppException("Name can cointain only letters.");
        }
    }

    private void controlSurname() throws GymAppException {
        if (entity.getSurname() == null || entity.getSurname().trim().isEmpty()) {
            throw new GymAppException("Invalid surname.");
        }
        if (entity.getSurname().trim().length() > 255) {
            throw new GymAppException("Your surname has to many characters.");
        }
        if (entity.getSurname().trim().length() < 2) {
            throw new GymAppException("Surname has to have atleast 2 characters.");
        }
        if (!Pattern.matches("[a-zA-Z]+", entity.getSurname())) {
            throw new GymAppException("Surname can cointain only letters.");
        }
    }

    private void controlUsername() throws GymAppException {
        if (entity.getUsername() == null || entity.getUsername().trim().isEmpty()) {
            throw new GymAppException("Invalid username.");
        }
        if (entity.getUsername().trim().length() > 255) {
            throw new GymAppException("Your username has to many characters.");
        }
        if (entity.getUsername().trim().length() < 3) {
            throw new GymAppException("Username has to have atleast 3 characters.");
        }
    }

    private void controlPassword() throws GymAppException {
        if (entity.getPassword() == null || entity.getPassword().trim().isEmpty()) {
            throw new GymAppException("Invalid password.");
        }
        if (entity.getPassword().trim().length() < 8) {
            throw new GymAppException("Password too short. (Min: 8 characters.");
        }
        if (entity.getPassword().trim().length() > 60) {
            throw new GymAppException("Password too long. (Max: 60 characters.");
        }
    }

    private void controlEmail() throws GymAppException {
        if (entity.getEmail() == null || entity.getEmail().trim().isEmpty()) {
            throw new GymAppException("Invalid email.");
        }

        try {
            InternetAddress emailAddr = new InternetAddress(entity.getEmail());
            emailAddr.validate();
        } catch (AddressException ex) {
            throw new GymAppException("Invalid email.");
        }
    }

}
