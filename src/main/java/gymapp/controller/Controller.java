/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gymapp.controller;

import gymapp.utility.GymAppException;
import gymapp.utility.HibernateUtility;
import java.util.List;
import org.hibernate.Session;

/**
 *
 */
public abstract class Controller<Type> {

    protected Session session;
    protected Type entity;

    public abstract List<Type> read();

    protected abstract void controlCreate() throws GymAppException;

    protected abstract void controlUpdate() throws GymAppException;

    protected abstract void controlDelete() throws GymAppException;

    protected abstract void saveAfter() throws GymAppException;

    public Controller() {

        session = HibernateUtility.getSession();

    }

    public Type create() throws GymAppException {
        controlCreate();
        save();
        saveAfter();
        return entity;
    }

    public Type update() throws GymAppException {
        controlUpdate();
        save();
        saveAfter();
        return entity;
    }

    public void delete() throws GymAppException {
        controlDelete();
        session.beginTransaction();
        session.delete(entity);
        session.getTransaction().commit();
    }

    public Type getEntity() {
        return entity;
    }

    public void setEntity(Type entity) {
        this.entity = entity;
    }

    private void save() {
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
    }

}
