package com.example.mechanical.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mechanical.business.MechanicalBusiness;
import com.example.mechanical.dto.MechanicalDTO;
import com.example.mechanical.dto.MechanicalINDTO;

@RestController
@CrossOrigin
public class MechanicalRest {

	@Autowired
	private MechanicalBusiness mechanicalBusiness;

	@PostMapping("/mechanical")
	public Integer create(@Valid @RequestBody MechanicalINDTO dto) {
		return mechanicalBusiness.create(dto);
	}

	@GetMapping("/mechanical/by-priority")
	public List<MechanicalDTO> findClients() {
		return mechanicalBusiness.findByPriorityAssign();
	}

}
