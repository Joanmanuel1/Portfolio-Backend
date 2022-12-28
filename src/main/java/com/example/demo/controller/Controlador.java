package com.example.demo.controller;
import com.example.demo.model.Persona;
import com.example.demo.service.IPersonaService;
import com.example.demo.model.Educacion;
import com.example.demo.service.IEducacionService;
import com.example.demo.model.Experiencia;
import com.example.demo.service.IExperienciaService;
import com.example.demo.model.Proyectos;
import com.example.demo.service.IProyectosService;
import com.example.demo.model.HardSkills;
import com.example.demo.service.IHardSkillsService;
import com.example.demo.model.SoftSkills;
import com.example.demo.service.ISoftSkillsService;
import com.example.demo.model.Idioma;
import com.example.demo.service.IIdiomaService;
import java.time.Instant;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ResponseStatus;


@RestController

// ACCEDEN TODOS
@CrossOrigin  

//@CrossOrigin(origins = "https://portfolio-front-end-eef7f.web.app") ACCEDE UNO SOLO 

//@CrossOrigin(origins = {"http://localhost:4200", "https://portfolio-front-end-eef7f.web.app", "https://portfolio-arg-programa.herokuapp.com"}) // MULTIPLES CONEXIONES
                                                                                        
public class Controlador {
    @Autowired
    private IPersonaService interPersona;
    
    /* Trae todas las personas */
    @GetMapping("/personas/traer")
    public List<Persona> getPersonas() {
        return interPersona.getPersonas();
    }
    
    /* Trae una persona
       Parametro: ID */
    @GetMapping("/personas/traerUno/{id}")
    public Persona findPersona(@PathVariable Long id) {
        Persona perso = interPersona.findPersona(id);
        return perso;
    }
    
    /* Trae un email
       Parametro: Email */
    @GetMapping("/personas/traerEmail/{email}")
    public Boolean existsByEmail(@PathVariable String email) {
        return interPersona.existsByEmail(email) == true;
    }
    
    @GetMapping("/personas/traerPassword/{password}")
    public Boolean existsByPassword(@PathVariable String password){
        return interPersona.existsByPassword(password) == true;
    }
    
    
    /* Crea una persona
       Parametro: Persona */
    @PostMapping("/personas/crear")
    public String createStudent(@RequestBody Persona perso) {
        interPersona.savePersona(perso);
        return "La persona fue creada correctamente";
    }

    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id) {
        interPersona.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }

    @PutMapping("personas/editar/{id}")
    public Persona editPersona(
            @PathVariable Long id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoApellido,
            @RequestParam("titulo") String nuevoTitulo,
            @RequestParam("descripcion") String nuevoDescripcion){
        Persona perso = interPersona.findPersona(id);
        perso.setApellido(nuevoApellido);
        perso.setNombre(nuevoNombre);
        perso.setTitulo(nuevoTitulo);
        perso.setDescripcion(nuevoDescripcion);
        interPersona.savePersona(perso);
        return perso;
    }
  
    @PutMapping("personas/editarLogueo/{id}")
    public Persona editPersonaLogueo(
            @PathVariable Long id,
            @RequestParam("logueado") int nuevoLogueado) {
        Persona perso = interPersona.findPersona(id);
        perso.setLogueado(nuevoLogueado);
        interPersona.savePersona(perso);
        return perso;
    }

    //Experiencia
    @Autowired
    private IExperienciaService interExperiencia;
    @GetMapping("/experiencia/traer")
    public List<Experiencia> getExperiencia() {
        return interExperiencia.getExperiencia();
    }

    @GetMapping("/experiencia/traerUno/{id}")
    public Experiencia findExperiencia(@PathVariable Long id) {
        Experiencia expe = interExperiencia.findExperiencia(id);
        return expe;
    }

    @PostMapping("/experiencia/crear")
    public String createExperiencia(@RequestBody Experiencia expe) {
        interExperiencia.saveExperiencia(expe);
        return "La Experiencia fue creada correctamente";
    }

    @DeleteMapping("/experiencia/borrar/{id}")
    public String deleteExperiencia(@PathVariable Long id) {
        interExperiencia.deleteExperiencia(id);
        return "La Experiencia fue eliminada correctamente";
    }

    @PutMapping("experiencia/editar/{id}")
    public Experiencia editExperiencia(
            @PathVariable Long id,
            @RequestParam("puesto") String puesto,
            @RequestParam("empresa") String empresa,
            @RequestParam("fechaDesde") String fechaDesde,
            @RequestParam("fechaHasta") String fechaHasta,
            @RequestParam("tareas") String tareas
    ) {
        Experiencia expe = interExperiencia.findExperiencia(id);
        expe.setPuesto(puesto);
        expe.setEmpresa(empresa);
        expe.setFechaDesde(fechaDesde);
        expe.setFechaHasta(fechaHasta);
        expe.setTareas(tareas);
        interExperiencia.saveExperiencia(expe);
        return expe;
    }

    //Educacion
    @Autowired
    private IEducacionService interEducacion;
    @GetMapping("/educacion/traer")
    public List<Educacion> getEducacion() {
        return interEducacion.getEducacion();
    }

    @GetMapping("/educacion/traerUno/{id}")
    public Educacion findEducacion(@PathVariable Long id) {
        Educacion edu = interEducacion.findEducacion(id);
        return edu;
    }

    @PostMapping("/educacion/crear")
    public String createEducacion(@RequestBody Educacion edu) {
        interEducacion.saveEducacion(edu);
        return "La Educacion fue creada correctamente";
    }

    @DeleteMapping("/educacion/borrar/{id}")
    public String deleteEducacion(@PathVariable Long id) {
        interEducacion.deleteEducacion(id);
        return "La Educacion fue eliminada correctamente";
    }

    @PutMapping("educacion/editar/{id}")
    public Educacion editEducacion(
            @PathVariable Long id,
            @RequestParam("titulo") String nuevoTitulo,
            @RequestParam("universidad") String nuevoUniversidad,
            @RequestParam("fechaDesde") String fechaDesde,
            @RequestParam("fechaHasta") String fechaHasta) {
        Educacion edu = interEducacion.findEducacion(id);
        edu.setTitulo(nuevoTitulo);
        edu.setUniversidad(nuevoUniversidad);
        edu.setFechaDesde(fechaDesde);
        edu.setFechaHasta(fechaHasta);
        interEducacion.saveEducacion(edu);
        return edu;
    }

    //Proyectos
    @Autowired
    private IProyectosService interProyectos;

    @GetMapping("/proyectos/traer")
    public List<Proyectos> getProyectos() {
        return interProyectos.getProyectos();
    }

    @GetMapping("/proyectos/traerUno/{id}")
    public Proyectos findProyectos(@PathVariable Long id) {
        Proyectos pro = interProyectos.findProyectos(id);
        return pro;
    }

    @PostMapping("/proyectos/crear")
    public String createProyectos(@RequestBody Proyectos pro) {
        interProyectos.saveProyectos(pro);
        return "El Proyecto fue creada correctamente";
    }

    @DeleteMapping("/proyectos/borrar/{id}")
    public String deleteProyectos(@PathVariable Long id) {
        interProyectos.deleteProyectos(id);
        return "El Proyecto fue eliminada correctamente";
    }

    @PutMapping("proyectos/editar/{id}")
    public Proyectos editProyectos(
            @PathVariable Long id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("descripcion") String nuevaDescripcion,
            @RequestParam("fechaRealizacion") String fechaRealizacion,
            @RequestParam("enlacePagina") String enlacePagina) {
        Proyectos pro = interProyectos.findProyectos(id);
        pro.setNombre(nuevoNombre);
        pro.setDescripcion(nuevaDescripcion);
        pro.setFechaRealizacion(fechaRealizacion);
        pro.setEnlacePagina(enlacePagina);

        interProyectos.saveProyectos(pro);
        return pro;
    }

    // Hard Skills
    @Autowired
    private IHardSkillsService interHardSkills;

    @GetMapping("/hardSkills/traer")
    public List<HardSkills> getHardSkills() {
        return interHardSkills.getHardSkills();
    }

    @GetMapping("/hardSkills/traerUno/{id}")
    public HardSkills findHardSkills(@PathVariable Long id) {
        HardSkills hard = interHardSkills.findHardSkills(id);
        return hard;
    }

    @PostMapping("/hardSkills/crear")
    public String createHardSkills(@RequestBody HardSkills hard) {
        interHardSkills.saveHardSkills(hard);
        return "El HardSkills fue creada correctamente";
    }

    @DeleteMapping("/hardSkills/borrar/{id}")
    public String deleteHardSkills(@PathVariable Long id) {
        interHardSkills.deleteHardSkills(id);
        return "El HardSkills fue eliminada correctamente";

    }

    @PutMapping("hardSkills/editar/{id}")
    public HardSkills editHardSkills(
            @PathVariable Long id,
            @RequestParam("habilidad") String nuevahabilidad,
            @RequestParam("porcentaje") String nuevoporcentaje) {
        HardSkills hard = interHardSkills.findHardSkills(id);
        hard.setHabilidad(nuevahabilidad);
        hard.setPorcentaje(nuevoporcentaje);

        interHardSkills.saveHardSkills(hard);
        return hard;
    }

    // Soft Skills
    @Autowired
    private ISoftSkillsService interSoftSkills;

    @GetMapping("/softSkills/traer")
    public List<SoftSkills> getSoftSkills() {
        return interSoftSkills.getSoftSkills();
    }

    @GetMapping("/softSkills/traerUno/{id}")
    public SoftSkills findSoftSkills(@PathVariable Long id) {
        SoftSkills soft = interSoftSkills.findSoftSkills(id);
        return soft;
    }

    @PostMapping("/softSkills/crear")
    public String createSoftSkills(@RequestBody SoftSkills soft) {
        interSoftSkills.saveSoftSkills(soft);
        return "El SoftSkills fue creada correctamente";
    }

    @DeleteMapping("/softSkills/borrar/{id}")
    public String deleteSoftSkills(@PathVariable Long id) {
        interSoftSkills.deleteSoftSkills(id);
        return "El SoftSkills fue eliminada correctamente";

    }

    @PutMapping("softSkills/editar/{id}")
    public SoftSkills editSoftSkills(
            @PathVariable Long id,
            @RequestParam("habilidad") String nuevahabilidad,
            @RequestParam("porcentaje") String nuevoporcentaje) {
        SoftSkills soft = interSoftSkills.findSoftSkills(id);
        soft.setHabilidad(nuevahabilidad);
        soft.setPorcentaje(nuevoporcentaje);

        interSoftSkills.saveSoftSkills(soft);
        return soft;
    }

    @GetMapping("/time")
    @ResponseStatus(HttpStatus.OK)
    public String getCurrentTime() {
        return Instant.now().toString();
    }

    //Idiomas
    @Autowired
    private IIdiomaService interIdiomas;

    @GetMapping("/idiomas/traer")
    public List<Idioma> getIdiomas() {
        return interIdiomas.getIdiomas();
    }

    @GetMapping("/idiomas/traerUno/{id}")
    public Idioma findIdiomas(@PathVariable Long id) {
        Idioma idio = interIdiomas.findIdiomas(id);
        return idio;
    }

    @PostMapping("/idiomas/crear")
    public String createIdiomas(@RequestBody Idioma idio) {
        interIdiomas.saveIdiomas(idio);
        return "El Idioma fue creado correctamente";
    }

    @DeleteMapping("/idiomas/borrar/{id}")
    public String deleteIdiomas(@PathVariable Long id) {
        interIdiomas.deleteIdiomas(id);
        return "El Idiomas fue eliminado correctamente";
    }

    @PutMapping("idiomas/editar/{id}")
    public Idioma editIdiomas(
            @PathVariable Long id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("habilidad") String nuevahabilidad,
            @RequestParam("porcentaje") String nuevoporcentaje) {
        Idioma idio = interIdiomas.findIdiomas(id);
        idio.setNombre(nuevoNombre);
        idio.setHabilidad(nuevahabilidad);
        idio.setPorcentaje(nuevoporcentaje);

        interIdiomas.saveIdiomas(idio);
        return idio;
    }
    
    
}
