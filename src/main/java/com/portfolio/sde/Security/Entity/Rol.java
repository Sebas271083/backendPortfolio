/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.sde.Security.Entity;

import com.portfolio.sde.Security.Enums.RolNombe;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private RolNombe rolNombre;
    
    //Constructor

    public Rol() {
        
    }

    public Rol(RolNombe rolNombre) {
        this.rolNombre = rolNombre;
    }
    
    //getter setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RolNombe getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(RolNombe rolNombre) {
        this.rolNombre = rolNombre;
    }
}
