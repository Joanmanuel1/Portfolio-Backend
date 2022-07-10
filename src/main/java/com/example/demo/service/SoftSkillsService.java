/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.SoftSkills;
import com.example.demo.repository.SoftSkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author usuario
 */

@Service

public class SoftSkillsService implements ISoftSkillsService{
    
     @Autowired
 private SoftSkillsRepository softRepository;

    @Override
    public List<SoftSkills> getSoftSkills() {
        List<SoftSkills> listaSoftSkills = softRepository.findAll();
        return listaSoftSkills;
    }

    @Override
    public void saveSoftSkills(SoftSkills soft) {
        softRepository.save(soft);
    }

    @Override
    public void deleteSoftSkills(Long id) {
        softRepository.deleteById(id);
    }

    @Override
    public SoftSkills findSoftSkills(Long id) {
        SoftSkills soft = softRepository.findById(id).orElse(null);
                return soft;
    }
    
    
}
