/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Experiencia;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author usuario
 */

@Service
public interface IExperienciaService {
    
    public List<Experiencia> getExperiencia ();
    
    public void saveExperiencia (Experiencia expe);
    
    public void deleteExperiencia (Long id);
    
    public Experiencia findExperiencia (Long id);
    
}
