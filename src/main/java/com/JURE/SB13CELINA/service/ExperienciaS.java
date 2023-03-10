
package com.JURE.SB13CELINA.service;

import com.JURE.SB13CELINA.entity.ExperienciaE;
import com.JURE.SB13CELINA.repository.IExperienciaR;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienciaS {
 @Autowired
   
      IExperienciaR iexperienciaR;

    
    public List<ExperienciaE> getExperiencias() {
        List<ExperienciaE>  listaExperiencias = iexperienciaR.findAll();
        return listaExperiencias;
    }

   
    public void saveExperiencia(ExperienciaE expe) {
        iexperienciaR.save(expe);
   }

    
    public void deleteExperiencia(Long id) {
        iexperienciaR.deleteById(id);
  }

  
    public ExperienciaE findExperiencia(Long id) {
         ExperienciaE  expe = iexperienciaR.findById(id).orElse(null);
          return expe;
   }
     public void editExperiencia(ExperienciaE expe) {
        iexperienciaR.save(expe);
   }
}
