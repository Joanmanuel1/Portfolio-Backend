/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.model.HardSkills;
import com.example.demo.repository.HardSkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author usuario
 */

@Service
public class HardSkillsService implements IHardSkillsService{
        
 @Autowired
 private HardSkillsRepository hardRepository;

    @Override
    public List<HardSkills> getHardSkills() {
        List<HardSkills> listaHardSkills = hardRepository.findAll();
        return listaHardSkills;
    }

    @Override
    public void saveHardSkills(HardSkills hard) {
        hardRepository.save(hard);
    }

    @Override
    public void deleteHardSkills(Long id) {
        hardRepository.deleteById(id);
    }

    @Override
    public HardSkills findHardSkills(Long id) {
        HardSkills hard = hardRepository.findById(id).orElse(null);
                return hard;
    }
}
