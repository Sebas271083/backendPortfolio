/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.sde.Interface;

import com.portfolio.sde.Entity.Persona;
import java.util.List;

/**
 *
 * @author sebde
 */
public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona>getPersona();
            
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un usuario
    public void deletePersona(Long  id);
    
    //Buscar una persona
    public Persona findPersona(Long id);
}
