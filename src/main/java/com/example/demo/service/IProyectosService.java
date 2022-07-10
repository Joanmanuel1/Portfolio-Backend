/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Proyectos;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author usuario
 */


@Service
public interface IProyectosService {
    
    public List<Proyectos> getProyectos ();
    
    public void saveProyectos (Proyectos pro);
    
    public void deleteProyectos (Long id);
    
    public Proyectos findProyectos (Long id);
}
