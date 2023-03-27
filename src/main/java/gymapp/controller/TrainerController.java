/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gymapp.controller;

import gymapp.model.Trainer;
import gymapp.utility.GymAppException;
import gymapp.utility.OibValidation;
import java.util.List;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

/**
 *
 */
public class TrainerController extends Controller<Trainer> {

    @Override
    public List<Trainer> read() {
        return session.createQuery("from Trainer").list();
    }

    @Override
    protected void controlCreate() throws GymAppException {
        controlName();
        controlSurname();
        controlEmail();
        controlOib();
        controlPhoneNumber();
    }

    @Override
    protected void controlUpdate() throws GymAppException {
        controlName();
        controlSurname();
        controlEmailUpdate();
        controlOibUpdate();
        controlPhoneNumber();
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
    }

    private void controlEmail() throws GymAppException {
        if (entity.getEmail() == null || entity.getEmail().trim().isEmpty()) {
            throw new GymAppException("Invalid email.");
        }

        List<Trainer> trainers = session.createQuery("from Trainer t "
                + "where t.email=:email")
                .setParameter("email", entity.getEmail()).list();

        if (trainers != null && trainers.size() > 0) {
            throw new GymAppException("This email is already in use.");
        }

        try {
            InternetAddress emailAddr = new InternetAddress(entity.getEmail());
            emailAddr.validate();
        } catch (AddressException ex) {
            throw new GymAppException("Invalid email.");
        }
    }

    private void controlOib() throws GymAppException {

        if (entity.getOib() == null || entity.getOib().trim().isEmpty()) {
            throw new GymAppException("OIB is invalid.");
        }
        if (!OibValidation.checkOIB(entity.getOib())) {
            throw new GymAppException("OIB is invalid.");
        }

        List<Trainer> trainers = session.createQuery("from Trainer t "
                + "where t.oib=:oib")
                .setParameter("oib", entity.getOib()).list();

        if (trainers != null && trainers.size() > 0) {
            throw new GymAppException("The OIB you entered is already in use");
        }
    }

    private void controlPhoneNumber() throws GymAppException {
        if (entity.getPhoneNumber() == null || entity.getPhoneNumber().trim().isEmpty()) {
            throw new GymAppException("Invalid phone number");
        }
        if (!entity.getPhoneNumber().startsWith("09") && !entity.getPhoneNumber().startsWith("+385")) {
            throw new GymAppException("Invalid phone number format.");
        }
        if (entity.getPhoneNumber().trim().length() > 13 || entity.getPhoneNumber().trim().length() < 9) {
            throw new GymAppException("Invalid phone number length.");
        }
        if (entity.getPhoneNumber().trim().length() < 9 || entity.getPhoneNumber().trim().length() > 13) {
            throw new GymAppException("Invalid phone number.");
        }

    }

    private void controlEmailUpdate() throws GymAppException {
        if (entity.getEmail() == null || entity.getEmail().trim().isEmpty()) {
            throw new GymAppException("Invalid email.");
        }

        List<Trainer> trainers = session.createQuery("from Trainer t "
                + "where t.email=:email and t.id !=:id")
                .setParameter("email", entity.getEmail())
                .setParameter("id", entity.getId())
                .list();

        if (trainers != null && trainers.size() > 0) {
            throw new GymAppException("This email is already in use.");
        }

        try {
            InternetAddress emailAddr = new InternetAddress(entity.getEmail());
            emailAddr.validate();
        } catch (AddressException ex) {
            throw new GymAppException("Invalid email.");
        }
    }

    private void controlOibUpdate() throws GymAppException {
        if (entity.getOib() == null || entity.getOib().trim().isEmpty()) {
            throw new GymAppException("OIB is invalid.");
        }
        if (!OibValidation.checkOIB(entity.getOib())) {
            throw new GymAppException("OIB is invalid.");
        }

        List<Trainer> trainers = session.createQuery("from Trainer t "
                + "where t.oib=:oib and t.id !=:id")
                .setParameter("oib", entity.getOib()).list();

        if (trainers != null && trainers.size() > 0) {
            throw new GymAppException("The OIB you entered is already in use");
        }
    }

}
