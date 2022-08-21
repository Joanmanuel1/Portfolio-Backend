package com.example.demo.service;
import com.example.demo.model.Persona;
import com.example.demo.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
 
    @Autowired
 private PersonaRepository persoRepository;

    @Override
    public List<Persona> getPersonas() {
        List<Persona> listaPersonas = persoRepository.findAll();
        return listaPersonas;
    }

    @Override
    public void savePersona(Persona perso) {
        persoRepository.save(perso);
    }

    @Override
    public void deletePersona(Long id) {
        persoRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona perso = persoRepository.findById(id).orElse(null);
                return perso;
    }

    @Override
    public boolean existsByEmail(String email) {
       return persoRepository.existsByEmail(email);
    }
    
    @Override
    public boolean existsByPassword(String password) {
       return persoRepository.existsByPassword(password);
    }
    

}
