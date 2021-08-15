package com.project.spring.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;


@Entity
public class Admin1 extends User{

	//private User user;
	private String mobileNumber;
	private String email;
	@Embedded
	private Address address;
	
	@OneToMany(cascade = CascadeType.ALL,
            mappedBy = "admin")
	List<Patient1> patientList;
	
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            mappedBy = "admin")
	List<Appointment> appointment;
	
	@OneToMany(cascade = CascadeType.ALL,
            mappedBy = "admin")
	List<DiagnosticCenter> diagCenter;

	
	
	
	public Admin1() {
		super();
	}




	public Admin1( String mobileNumber, String email, Address address, List<Patient1> patientList,
			List<Appointment> appointment, List<DiagnosticCenter> diagCenter) {
		super();
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.address = address;
		this.patientList = patientList;
		this.appointment = appointment;
		this.diagCenter = diagCenter;
	}




	

	public String getMobileNumber() {
		return mobileNumber;
	}




	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public Address getAddress() {
		return address;
	}




	public void setAddress(Address address) {
		this.address = address;
	}




	public List<Patient1> getPatientList() {
		return patientList;
	}




	public void setPatientList(List<Patient1> patientList) {
		this.patientList = patientList;
	}




	public List<Appointment> getAppointment() {
		return appointment;
	}




	public void setAppointment(List<Appointment> appointment) {
		this.appointment = appointment;
	}




	public List<DiagnosticCenter> getDiagCenter() {
		return diagCenter;
	}




	public void setDiagCenter(List<DiagnosticCenter> diagCenter) {
		this.diagCenter = diagCenter;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((appointment == null) ? 0 : appointment.hashCode());
		result = prime * result + ((diagCenter == null) ? 0 : diagCenter.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((mobileNumber == null) ? 0 : mobileNumber.hashCode());
		result = prime * result + ((patientList == null) ? 0 : patientList.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin1 other = (Admin1) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (appointment == null) {
			if (other.appointment != null)
				return false;
		} else if (!appointment.equals(other.appointment))
			return false;
		if (diagCenter == null) {
			if (other.diagCenter != null)
				return false;
		} else if (!diagCenter.equals(other.diagCenter))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (mobileNumber == null) {
			if (other.mobileNumber != null)
				return false;
		} else if (!mobileNumber.equals(other.mobileNumber))
			return false;
		if (patientList == null) {
			if (other.patientList != null)
				return false;
		} else if (!patientList.equals(other.patientList))
			return false;
		
		return true;
	}




	@Override
	public String toString() {
		return "Admin1 [ mobileNumber=" + mobileNumber + ", email=" + email + ", address=" + address
				+ ", patientList=" + patientList + ", appointment=" + appointment + ", diagCenter=" + diagCenter + "]";
	}
	
	
	
}
