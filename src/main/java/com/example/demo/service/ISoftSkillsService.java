/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.SoftSkills;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author usuario
 */

@Service
public interface ISoftSkillsService {
    
    public List<SoftSkills> getSoftSkills ();
    
    public void saveSoftSkills (SoftSkills hard);
    
    public void deleteSoftSkills (Long id);
    
    public SoftSkills findSoftSkills(Long id); 
}
