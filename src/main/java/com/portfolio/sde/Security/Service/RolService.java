/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.sde.Security.Service;

import com.portfolio.sde.Security.Entity.Rol;
import com.portfolio.sde.Security.Enums.RolNombe;
import com.portfolio.sde.Security.Repository.RolRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    RolRepository rolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombe rolnombre){
            return rolRepository.findByRolNombre(rolnombre);
    }
    
    public void save(Rol rol){
        rolRepository.save(rol);
    }
}
