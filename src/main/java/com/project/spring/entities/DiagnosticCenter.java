package com.project.spring.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Diag_Center")
public class DiagnosticCenter {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="Id_number")
	private Long id;
	
	private String name;
	private String contactNo;
	private Address address;
	private String contactEmail;
	
	@Enumerated(EnumType.STRING)
	private ServicesOffered ServicesOffered;
	
	@Embedded
	private DiagnosticTest diagTest;
	
	@ManyToOne
	@JoinColumn(name ="diagCenter_details")
	private Admin1 admin;
	

	@ManyToMany(cascade = CascadeType.ALL)
	List<Patient1> patient;
	
	@ManyToMany(mappedBy = "diagCenter")
	List<Appointment> appointment;

	public DiagnosticCenter(Long id, String name, String contactNo, Address address, String contactEmail,
			com.project.spring.entities.ServicesOffered servicesOffered, DiagnosticTest diagTest, Admin1 admin,
			List<Patient1> patient, List<Appointment> appointment) {
		super();
		this.id = id;
		this.name = name;
		this.contactNo = contactNo;
		this.address = address;
		this.contactEmail = contactEmail;
		ServicesOffered = servicesOffered;
		this.diagTest = diagTest;
		this.admin = admin;
		this.patient = patient;
		this.appointment = appointment;
	}

	public DiagnosticCenter() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public ServicesOffered getServicesOffered() {
		return ServicesOffered;
	}

	public void setServicesOffered(ServicesOffered servicesOffered) {
		ServicesOffered = servicesOffered;
	}

	public DiagnosticTest getDiagTest() {
		return diagTest;
	}

	public void setDiagTest(DiagnosticTest diagTest) {
		this.diagTest = diagTest;
	}

	public Admin1 getAdmin() {
		return admin;
	}

	public void setAdmin(Admin1 admin) {
		this.admin = admin;
	}

	public List<Patient1> getPatient() {
		return patient;
	}

	public void setPatient(List<Patient1> patient) {
		this.patient = patient;
	}

	public List<Appointment> getAppointment() {
		return appointment;
	}

	public void setAppointment(List<Appointment> appointment) {
		this.appointment = appointment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ServicesOffered == null) ? 0 : ServicesOffered.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((admin == null) ? 0 : admin.hashCode());
		result = prime * result + ((appointment == null) ? 0 : appointment.hashCode());
		result = prime * result + ((contactEmail == null) ? 0 : contactEmail.hashCode());
		result = prime * result + ((contactNo == null) ? 0 : contactNo.hashCode());
		result = prime * result + ((diagTest == null) ? 0 : diagTest.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((patient == null) ? 0 : patient.hashCode());
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
		DiagnosticCenter other = (DiagnosticCenter) obj;
		if (ServicesOffered != other.ServicesOffered)
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (admin == null) {
			if (other.admin != null)
				return false;
		} else if (!admin.equals(other.admin))
			return false;
		if (appointment == null) {
			if (other.appointment != null)
				return false;
		} else if (!appointment.equals(other.appointment))
			return false;
		if (contactEmail == null) {
			if (other.contactEmail != null)
				return false;
		} else if (!contactEmail.equals(other.contactEmail))
			return false;
		if (contactNo == null) {
			if (other.contactNo != null)
				return false;
		} else if (!contactNo.equals(other.contactNo))
			return false;
		if (diagTest == null) {
			if (other.diagTest != null)
				return false;
		} else if (!diagTest.equals(other.diagTest))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (patient == null) {
			if (other.patient != null)
				return false;
		} else if (!patient.equals(other.patient))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DiagnosticCenter [id=" + id + ", name=" + name + ", contactNo=" + contactNo + ", address=" + address
				+ ", contactEmail=" + contactEmail + ", ServicesOffered=" + ServicesOffered + ", diagTest=" + diagTest
				+ ", admin=" + admin + ", patient=" + patient + ", appointment=" + appointment + "]";
	}
	
	
}
