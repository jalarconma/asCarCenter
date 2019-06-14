package com.example.mechanical.business;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.mechanical.MechanicalDao;
import com.example.entities.mechanical.Mechanical;
import com.example.entities.mechanical.MechanicalId;
import com.example.mechanical.dto.MechanicalINDTO;

@Service
public class MechanicalBusiness {
	
	@Autowired
	private MechanicalDao mechanicalDao;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public Integer create(MechanicalINDTO dto) {
		Mechanical mech = modelMapper.map(dto, Mechanical.class);
		mech.setId(new MechanicalId(dto.getDocumentType(), dto.getDocumentNumber()));
		Mechanical createdMech = mechanicalDao.save(mech);
		return createdMech.getId().getDocumentNumber();
	}

}
