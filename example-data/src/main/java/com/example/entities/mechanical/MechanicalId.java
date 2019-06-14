package com.example.entities.mechanical;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class MechanicalId implements Serializable {

	private static final long serialVersionUID = 1569725134036697181L;
	
    @Column(name = "TIPO_DOCUMENTO")
    private String documentType;
 
    @Column(name = "DOCUMENTO")
    private Integer documentNumber;

	public MechanicalId() {
	}

	public MechanicalId(String documentType, Integer documentNumber) {
		this.documentType = documentType;
		this.documentNumber = documentNumber;
	}

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
	
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MechanicalId)) return false;
        MechanicalId that = (MechanicalId) o;
        return Objects.equals(getDocumentType(), that.getDocumentType()) &&
                Objects.equals(getDocumentNumber(), that.getDocumentNumber());
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(getDocumentType(), getDocumentNumber());
    }
    
    

}
