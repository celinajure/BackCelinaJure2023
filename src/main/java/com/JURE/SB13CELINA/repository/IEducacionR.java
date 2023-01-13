
package com.JURE.SB13CELINA.repository;

import com.JURE.SB13CELINA.entity.EducacionE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionR extends JpaRepository<EducacionE, Long>{

    
   
}
