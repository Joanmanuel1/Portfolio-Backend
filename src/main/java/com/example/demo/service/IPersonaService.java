/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Persona;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author usuario
 */
@Service
public interface IPersonaService {
    
    public List<Persona> getPersonas ();
    
    public void savePersona (Persona perso);
    
    public void deletePersona (Long id);
    
    public Persona findPersona (Long id);
    
}
