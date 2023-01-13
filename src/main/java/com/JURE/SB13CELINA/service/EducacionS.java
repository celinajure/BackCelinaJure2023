
package com.JURE.SB13CELINA.service;

import com.JURE.SB13CELINA.entity.EducacionE;
import com.JURE.SB13CELINA.repository.IEducacionR;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

@Transactional
public class EducacionS {
    @Autowired
   
      IEducacionR ieducacionR;

    
    public List<EducacionE> getEducaciones() {
        List<EducacionE>  listaEducaciones = ieducacionR.findAll();
        return listaEducaciones;
    }
    
    
    public void saveEducacion(EducacionE edu) {
        ieducacionR.save(edu);
   }

   
    public void deleteEducacion(Long id) {
        ieducacionR.deleteById(id);
  }

  
     public EducacionE findEducacion(Long id) {
         EducacionE  edu = ieducacionR.findById(id).orElse(null);
         return edu;
   }

    public void editEducacion(EducacionE edu) {
        ieducacionR.save(edu);
   }

   
}