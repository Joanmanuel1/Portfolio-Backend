package com.example.demo.service;
import com.example.demo.model.Idioma;
import com.example.demo.repository.IdiomaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class IdiomaService implements IIdiomaService{
     @Autowired
 private IdiomaRepository idioRepository;

    @Override
    public List<Idioma> getIdiomas() {
        List<Idioma> listaIdiomas = idioRepository.findAll();
        return listaIdiomas;
    }

    @Override
    public void saveIdiomas(Idioma idio) {
        idioRepository.save(idio);
    }

    @Override
    public void deleteIdiomas(Long id) {
        idioRepository.deleteById(id);
    }

    @Override
    public Idioma findIdiomas(Long id) {
        Idioma idio = idioRepository.findById(id).orElse(null);
                return idio;
    }
}
