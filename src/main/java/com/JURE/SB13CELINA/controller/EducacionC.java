
package com.JURE.SB13CELINA.controller;

import com.JURE.SB13CELINA.entity.EducacionE;
import com.JURE.SB13CELINA.service.EducacionS;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("educacion")//localhost:8080/educacion/
@CrossOrigin(origins="http://portfoliocelinajure.web.app")
//@CrossOrigin(origins="http://localhost:4200")
@RestController
public class EducacionC {  
    @Autowired
    EducacionS educacionS;
    
    @GetMapping("/ver")
    @ResponseBody
    public List<EducacionE> verEducaciones() {
        return educacionS.getEducaciones();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public EducacionE verEducacion(@PathVariable Long id) {
        return educacionS.findEducacion( id);
    }
    
    @PostMapping("/new")
    @ResponseBody
    public ResponseEntity agregarEducacion(@RequestBody EducacionE edu) {
       educacionS.saveEducacion(edu);      
        return ResponseEntity.ok().body(edu);
    }
    
    @DeleteMapping("/delete/{id}")
      //@ResponseBody
    public ResponseEntity eliminarEducacion(@PathVariable Long id) {
        educacionS.deleteEducacion(id);
        return new ResponseEntity(HttpStatus.OK);
    } 
    
   //esta es una prueba de editar
    @PutMapping("/editar/{id}")
      //@ResponseBody
    public ResponseEntity editarEducacion(@RequestBody EducacionE edu){
        educacionS.editEducacion(edu);
        return  new ResponseEntity(HttpStatus.OK);
    } 
}