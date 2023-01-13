
package com.JURE.SB13CELINA.repository;

import com.JURE.SB13CELINA.entity.ProyectoE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectoR  extends JpaRepository<ProyectoE, Long>{
    
}
