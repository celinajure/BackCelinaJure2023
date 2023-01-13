
package com.JURE.SB13CELINA.repository;

import com.JURE.SB13CELINA.entity.RedE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRedR  extends JpaRepository<RedE, Long> {
}
