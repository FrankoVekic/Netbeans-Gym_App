/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gymapp.model;


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
/**
 *
 */
@Entity
public class Package extends gymapp.model.Entity {

    @Column(columnDefinition = "varchar(255)", nullable = false)
    private String name; 
    @Column(nullable = false)
    private BigDecimal price;
    @Column(columnDefinition = "text", nullable = false)
    private String description;

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
}
