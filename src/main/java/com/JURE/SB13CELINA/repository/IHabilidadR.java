
package com.JURE.SB13CELINA.repository;

import com.JURE.SB13CELINA.entity.HabilidadE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHabilidadR extends JpaRepository<HabilidadE, Long>{
   
    
}
