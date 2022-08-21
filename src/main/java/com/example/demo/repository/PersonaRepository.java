package com.example.demo.repository;
import com.example.demo.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository <Persona, Long>{
    public boolean existsByEmail(String email);
    public boolean existsByPassword(String password);
}
