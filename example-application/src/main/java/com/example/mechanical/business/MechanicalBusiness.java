package com.example.mechanical.business;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.mechanical.MechanicalDao;
import com.example.entities.mechanical.Mechanical;
import com.example.entities.mechanical.MechanicalId;
import com.example.mechanical.dto.MechanicalDTO;
import com.example.mechanical.dto.MechanicalINDTO;

@Service
public class MechanicalBusiness {
	
	@Autowired
	private MechanicalDao mechanicalDao;
	
	@Autowired
	private ModelMapper modelMapper;
	
	private Type targetListType = new TypeToken<List<MechanicalDTO>>() {}.getType();
	
	public Integer create(MechanicalINDTO dto) {
		Mechanical mech = modelMapper.map(dto, Mechanical.class);
		mech.setId(new MechanicalId(dto.getDocumentType(), dto.getDocumentNumber()));
		Mechanical createdMech = mechanicalDao.save(mech);
		return createdMech.getId().getDocumentNumber();
	}
	
	public List<MechanicalDTO> findByPriorityAssign() {
		List<Mechanical> mechs = mechanicalDao.findByPriorityAssign(1, 1);
		List<MechanicalDTO> dtos = modelMapper.map(mechs, targetListType);
		return dtos;
	}

}
