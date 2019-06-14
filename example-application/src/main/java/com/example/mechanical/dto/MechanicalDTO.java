package com.example.mechanical.dto;

public class MechanicalDTO {
	
    private String documentType;

    private Integer documentNumber;

	private String firstName;
    
	private String secondName;

	private String firstLastName;
    
	private String secondLastName;

	private String cellphone;
    
	private String address;

	private String email;
	
	private Boolean state;

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public Integer getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(Integer documentNumber) {
		this.documentNumber = documentNumber;
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
