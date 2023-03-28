/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gymapp.controller;

import gymapp.model.ProgramMemberTrainer;
import gymapp.utility.GymAppException;
import java.util.List;

/**
 *
 */
public class TrainingSessionController extends Controller<ProgramMemberTrainer> {

    @Override
    public List<ProgramMemberTrainer> read() {
       return session.createQuery("from training_session").list();
    }

    @Override
    protected void controlCreate() throws GymAppException {
        controlDescription();
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

}
