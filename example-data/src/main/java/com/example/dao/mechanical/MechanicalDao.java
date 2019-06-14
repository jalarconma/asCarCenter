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
	
	@Query(value = "SELECT * from mecanicos m where ( m.documento, m.tipo_documento) IN (\r\n" + 
			"\r\n" + 
			"    SELECT documento, tipo_documento FROM (    \r\n" + 
			"        SELECT mec.documento, mec.tipo_documento, SUM(sxm.tiempo_estimado) as suma_tiempos FROM mecanicos mec \r\n" + 
			"        LEFT JOIN mantenimientos mn ON mn.mec_documento = mec.documento AND mn.mec_tipo_documento = mec.tipo_documento\r\n" + 
			"        LEFT JOIN SERVICIOS_X_MANTENIMIENTOS sxm ON (sxm.cod_mantenimiento = mn.codigo)\r\n" + 
			"        WHERE mec.estado = 1\r\n" + 
			"        GROUP BY mec.documento, mec.tipo_documento ORDER BY SUM(sxm.tiempo_estimado) ASC\r\n" + 
			"    ) sd\r\n" + 
			") AND ROWNUM <= 10", nativeQuery = true)
	List<Mechanical> findByPriorityAssign(@Param("year") Integer year, @Param("month") Integer mont);

}
