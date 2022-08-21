package com.example.demo.service;
import com.example.demo.model.Persona;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IPersonaService {    
    public List<Persona> getPersonas ();    
    public void savePersona (Persona perso);   
    public void deletePersona (Long id);   
    public Persona findPersona (Long id);   
    boolean existsByEmail(String email);
    public boolean existsByPassword(String password);

}
