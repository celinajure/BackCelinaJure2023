
package com.JURE.SB13CELINA.repository;

import com.JURE.SB13CELINA.entity.ExperienciaE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaR extends JpaRepository<ExperienciaE, Long>{
   
}