/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gymapp.model;

import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 */
@Entity
public class Program extends gymapp.model.Entity {

    @Column(columnDefinition = "varchar(255)", nullable = false)
    private String name;
    @Column(nullable = false)
    private BigDecimal price;
    @Column(columnDefinition = "text", nullable = false)
    private String description;

    @OneToMany(mappedBy = "program")
    private List<ProgramMemberTrainer> programMemberTrainer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ProgramMemberTrainer> getProgramMemberTrainer() {
        return programMemberTrainer;
    }

    public void setProgramMemberTrainer(List<ProgramMemberTrainer> programMemberTrainer) {
        this.programMemberTrainer = programMemberTrainer;
    }

}
