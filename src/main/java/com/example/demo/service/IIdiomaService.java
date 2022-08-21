package com.example.demo.service;
import com.example.demo.model.Idioma;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IIdiomaService {
    public List<Idioma> getIdiomas ();
    public void saveIdiomas (Idioma idio);
    public void deleteIdiomas (Long id);
    public Idioma findIdiomas(Long id); 
}
