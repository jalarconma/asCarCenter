package com.example.dao.mechanical;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entities.mechanical.Mechanical;
import com.example.entities.mechanical.MechanicalId;

@Repository(value = "BillingDao")
public interface MechanicalDao extends JpaRepository<Mechanical, MechanicalId> {
	
	@Query(value = "SELECT * FROM MECANICOS WHERE ESTADO = 1 AND ROWNUM <= 10", nativeQuery = true)
	List<Mechanical> findByPriorityAssign(@Param("year") Integer year, @Param("month") Integer mont);

}
