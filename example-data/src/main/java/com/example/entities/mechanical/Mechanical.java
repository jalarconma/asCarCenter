package com.example.entities.mechanical;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.example.entities.BaseEntity;

@Entity
@Table(name = "MECANICOS")
public class Mechanical extends BaseEntity {

	private static final long serialVersionUID = -5948756700390344976L;

	@EmbeddedId
	private MechanicalId id;
	
    @Column(name = "PRIMER_NOMBRE", nullable = false)
	private String firstName;
    
    @Column(name = "SEGUNDO_NOMBRE")
	private String secondName;
    
    @Column(name = "PRIMER_APELLIDO", nullable = false)
	private String firstLastName;
    
    @Column(name = "SEGUNDO_APELLIDO")
	private String secondLastName;
    
    @Column(name = "CELULAR", nullable = false)
	private String cellphone;
    
    @Column(name = "DIRECCION", nullable = false)
	private String address;
    
    @Column(name = "EMAIL", nullable = false)
	private String email;
    
    @Column(name = "ESTADO", nullable = false)
	private Boolean state = Boolean.TRUE;

	public MechanicalId getId() {
		return id;
	}

	public void setId(MechanicalId id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getFirstLastName() {
		return firstLastName;
	}

	public void setFirstLastName(String firstLastName) {
		this.firstLastName = firstLastName;
	}

	public String getSecondLastName() {
		return secondLastName;
	}

	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getState() {
		return state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

}
