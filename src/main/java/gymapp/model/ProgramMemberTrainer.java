/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gymapp.model;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
/**
 *
 */
@Entity(name = "training_session")
public class ProgramMemberTrainer extends gymapp.model.Entity {

    @ManyToOne
    private Program program;
    
    @ManyToOne
    private Member member;   
    
    @ManyToOne
    private Trainer trainer;
    
    private Date dateStart;
    private Integer duration;
    @Column(columnDefinition = "text", nullable = false)
    private String description;


    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }
    
    
}
