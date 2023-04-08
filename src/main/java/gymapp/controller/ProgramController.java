/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gymapp.controller;

import gymapp.model.Program;
import gymapp.utility.GymAppException;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.NoResultException;

/**
 *
 */
public class ProgramController extends Controller<Program> {

    @Override
    public List<Program> read() {
        return session.createQuery("from Program").list();
    }

    public Program getSelectedProgram(String name) {
        Program program = null;

        try {
            program = (Program) session.createQuery("from Program where name=:name")
                    .setParameter("name", name).getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
        if (program == null) {
            return null;
        }
        return program;
    }

    @Override
    protected void controlCreate() throws GymAppException {
        controlName();
        controlDescription();
        controlPrice();
    }

    @Override
    protected void controlUpdate() throws GymAppException {
        controlNameUpdate();
        controlDescription();
        controlPrice();

    }

    @Override
    protected void controlDelete() throws GymAppException {

    }

    @Override
    protected void saveAfter() throws GymAppException {

    }

    private void controlName() throws GymAppException {
        if (entity.getName() == null || entity.getName().trim().isEmpty()) {
            throw new GymAppException("Name is required.");
        }
        if (entity.getName().trim().length() > 255) {
            throw new GymAppException("Your name has to many characters.");
        }
        if (entity.getName().trim().length() < 2) {
            throw new GymAppException("Name has to have atleast 2 characters.");
        }

        List<Program> programs = session.createQuery("from Program p"
                + " where p.name=:name ")
                .setParameter("name", entity.getName()).list();
        if (programs != null && programs.size() > 0) {
            throw new GymAppException("This Program name is already in use.");
        }
    }

    private void controlPrice() throws GymAppException {
        if (entity.getPrice() == null) {
            throw new GymAppException("Price is required.");
        }
        if (entity.getPrice().compareTo(BigDecimal.ZERO) < 0 || entity.getPrice().compareTo(BigDecimal.ZERO) == 0) {
            throw new GymAppException("Price must be a positive number.");

        }
        if (entity.getPrice().compareTo(new BigDecimal(5000)) > 0) {
            throw new GymAppException("Max price is 5000.");
        }
    }

    private void controlDescription() throws GymAppException {
        if (entity.getDescription() == null || entity.getDescription().trim().isEmpty()) {
            throw new GymAppException("Description is required");
        }
        if (entity.getDescription().trim().length() < 10) {
            throw new GymAppException("Description is too short.");
        }
        if (entity.getDescription().trim().length() > 15000) {
            throw new GymAppException("Description is too big.");
        }
    }

    private void controlNameUpdate() throws GymAppException {
        if (entity.getName() == null || entity.getName().trim().isEmpty()) {
            throw new GymAppException("Name is required.");
        }
        if (entity.getName().trim().length() > 255) {
            throw new GymAppException("Your name has to many characters.");
        }
        if (entity.getName().trim().length() < 2) {
            throw new GymAppException("Name has to have atleast 2 characters.");
        }   
    }

}
