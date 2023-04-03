/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gymapp.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.OneToMany;

/**
 *
 */
@Entity
public class Member extends gymapp.model.Entity {

    @Column(columnDefinition = "varchar(255)", nullable = false)
    private String name;
    @Column(columnDefinition = "varchar(255)", nullable = false)
    private String surname;
    @Column(columnDefinition = "varchar(255)", nullable = false)
    private String email;
    @Column(columnDefinition = "varchar(22)", nullable = false)
    private String phoneNumber;
    @Column(columnDefinition = "char(11)", nullable = false)
    private String oib;
    @Column(nullable = false)
    private Boolean active;

    @OneToMany(mappedBy = "member")
    private List<ProgramMemberTrainer> programMemberTrainer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public List<ProgramMemberTrainer> getProgramMemberTrainer() {
        return programMemberTrainer;
    }

    public void setProgramMemberTrainer(List<ProgramMemberTrainer> programMemberTrainer) {
        this.programMemberTrainer = programMemberTrainer;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
