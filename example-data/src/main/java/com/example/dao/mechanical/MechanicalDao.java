package com.example.dao.mechanical;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.mechanical.Mechanical;
import com.example.entities.mechanical.MechanicalId;

@Repository(value = "BillingDao")
public interface MechanicalDao extends JpaRepository<Mechanical, MechanicalId> {

}
