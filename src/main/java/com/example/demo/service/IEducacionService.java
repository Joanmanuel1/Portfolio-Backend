/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Educacion;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author usuario
 */
@Service

public interface IEducacionService {
    
    public List<Educacion> getEducacion ();
    
    public void saveEducacion (Educacion expe);
    
    public void deleteEducacion (Long id);
    
    public Educacion findEducacion (Long id);
}
