/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.HardSkills;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author usuario
 */

@Service
public interface IHardSkillsService {

    public List<HardSkills> getHardSkills ();
    
    public void saveHardSkills (HardSkills hard);
    
    public void deleteHardSkills (Long id);
    
    public HardSkills findHardSkills (Long id); 

    
}
