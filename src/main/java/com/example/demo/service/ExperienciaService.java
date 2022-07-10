/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Experiencia;
import com.example.demo.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author usuario
 */

@Service
public class ExperienciaService implements IExperienciaService{
    
 @Autowired
 private ExperienciaRepository expeRepository;

    @Override
    public List<Experiencia> getExperiencia() {
        List<Experiencia> listaExperiencia = expeRepository.findAll();
        return listaExperiencia;
    }

    @Override
    public void saveExperiencia(Experiencia expe) {
        expeRepository.save(expe);
    }

    @Override
    public void deleteExperiencia(Long id) {
        expeRepository.deleteById(id);
    }

    @Override
    public Experiencia findExperiencia(Long id) {
        Experiencia expe = expeRepository.findById(id).orElse(null);
                return expe;
    }
    
}
