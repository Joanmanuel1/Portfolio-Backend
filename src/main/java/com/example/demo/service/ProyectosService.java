/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Proyectos;
import com.example.demo.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author usuario
 */

@Service
public class ProyectosService implements IProyectosService{
    
     @Autowired
 private ProyectosRepository proRepository;

    @Override
    public List<Proyectos> getProyectos() {
        List<Proyectos> listaProyectos = proRepository.findAll();
        return listaProyectos;
    }

    @Override
    public void saveProyectos(Proyectos pro) {
        proRepository.save(pro);
    }

    @Override
    public void deleteProyectos(Long id) {
        proRepository.deleteById(id);
    }

    @Override
    public Proyectos findProyectos(Long id) {
        Proyectos pro = proRepository.findById(id).orElse(null);
                return pro;
    }
}
