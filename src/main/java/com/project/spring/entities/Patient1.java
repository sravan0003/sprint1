package com.project.spring.entities;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Patient1 extends User {
	private User user;
	private String name;
	private Long PhoneNumber;
	private int age;
	@Embedded
	private Address Address;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	
	@ManyToOne
	@JoinColumn(name ="patient_details")
	private Admin1 admin;
	
	@OneToMany(mappedBy = "Patient1")
	List<Appointment> appointment;
	
	@ManyToMany(mappedBy = "Patient1")
	List<DiagnosticCenter> diagCenter;

	
	
	public Patient1(Long id, @Size(min = 2, message = "user name should have atleast two characters") String userName,
			@Size(min = 8, message = "password should have atleast eight characters") String password, Role role) {
		super(id, userName, password, role);
	}



	public Patient1(Long id, @Size(min = 2, message = "user name should have atleast two characters") String userName,
			@Size(min = 8, message = "password should have atleast eight characters") String password, Role role,
			String name, Long phoneNumber, int age, com.project.spring.entities.Address address, Gender gender,
			Admin1 admin) {
		super(id, userName, password, role);
		this.name = name;
		PhoneNumber = phoneNumber;
		this.age = age;
		Address = address;
		this.gender = gender;
		this.admin = admin;
	}



	public Patient1(Long id, @Size(min = 2, message = "user name should have atleast two characters") String userName,
			@Size(min = 8, message = "password should have atleast eight characters") String password, Role role,
			User user, String name, Long phoneNumber, int age, com.project.spring.entities.Address address,
			Gender gender, Admin1 admin, List<Appointment> appointment, List<DiagnosticCenter> diagCenter) {
		super(id, userName, password, role);
		this.user = user;
		this.name = name;
		PhoneNumber = phoneNumber;
		this.age = age;
		Address = address;
		this.gender = gender;
		this.admin = admin;
		this.appointment = appointment;
		this.diagCenter = diagCenter;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Long getPhoneNumber() {
		return PhoneNumber;
	}



	public void setPhoneNumber(Long phoneNumber) {
		PhoneNumber = phoneNumber;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public Address getAddress() {
		return Address;
	}



	public void setAddress(Address address) {
		Address = address;
	}



	public Gender getGender() {
		return gender;
	}



	public void setGender(Gender gender) {
		this.gender = gender;
	}



	public Admin1 getAdmin() {
		return admin;
	}



	public void setAdmin(Admin1 admin) {
		this.admin = admin;
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
		int result = super.hashCode();
		result = prime * result + ((Address == null) ? 0 : Address.hashCode());
		result = prime * result + ((PhoneNumber == null) ? 0 : PhoneNumber.hashCode());
		result = prime * result + ((admin == null) ? 0 : admin.hashCode());
		result = prime * result + age;
		result = prime * result + ((appointment == null) ? 0 : appointment.hashCode());
		result = prime * result + ((diagCenter == null) ? 0 : diagCenter.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient1 other = (Patient1) obj;
		if (Address == null) {
			if (other.Address != null)
				return false;
		} else if (!Address.equals(other.Address))
			return false;
		if (PhoneNumber == null) {
			if (other.PhoneNumber != null)
				return false;
		} else if (!PhoneNumber.equals(other.PhoneNumber))
			return false;
		if (admin == null) {
			if (other.admin != null)
				return false;
		} else if (!admin.equals(other.admin))
			return false;
		if (age != other.age)
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
		if (gender != other.gender)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Patient1 [user=" + user + ", name=" + name + ", PhoneNumber=" + PhoneNumber + ", age=" + age
				+ ", Address=" + Address + ", gender=" + gender + ", admin=" + admin + ", appointment=" + appointment
				+ ", diagCenter=" + diagCenter + "]";
	}
	
	
}
