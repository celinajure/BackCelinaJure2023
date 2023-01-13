
package com.JURE.SB13CELINA.service;

import com.JURE.SB13CELINA.entity.HabilidadE;
import com.JURE.SB13CELINA.repository.IHabilidadR;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HabilidadS {
    
    @Autowired
   
      IHabilidadR ihabilidadR;

    
    public List<HabilidadE> getHabilidades() {
        List<HabilidadE>  listaHabilidades = ihabilidadR.findAll();
        return listaHabilidades;
    }

   
    public void saveHabilidad(HabilidadE habi) {
        ihabilidadR.save(habi);
   }

    
    public void deleteHabilidad(Long id) {
        ihabilidadR.deleteById(id);
  }

  
    public HabilidadE findHabilidad(Long id) {
       HabilidadE  habi = ihabilidadR.findById(id).orElse(null);
          return habi;
   }
    public void editHabilidad(HabilidadE habi) {
        ihabilidadR.save(habi);
   }
    
}
