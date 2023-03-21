/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gymapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 */
@Entity
public class Admin extends gymapp.model.Entity  {

    @Column(columnDefinition = "varchar(255)", nullable = false)
    private String username;
    @Column(columnDefinition = "varchar(255)", nullable = false)
    private String name;
    @Column(columnDefinition = "varchar(255)", nullable = false)
    private String surname;
    @Column(columnDefinition = "varchar(255)", nullable = false)
    private String email;
    @Column(columnDefinition = "char(60)", nullable = false)
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }   
}
