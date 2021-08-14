package com.project.spring.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
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
@Table(name = "Appointment")
public class Appointment {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private LocalDate date;
	private int duration;
	@Enumerated(EnumType.STRING)
	private ApprovalStatus approvalStatus;
	
	@ManyToOne
	@JoinColumn(name ="Appointment_details")
	private Admin1 admin;
	
	@ManyToOne
	@JoinColumn(name = "Appointment_details")
	private Patient1 patient;
	
	@ManyToMany(cascade = CascadeType.ALL )
	private List<DiagnosticCenter> diagCenter;
	
	

	public Appointment() {
		super();
	}



	public Appointment(Long id, LocalDate date, int duration, ApprovalStatus approvalStatus, Admin1 admin,
			Patient1 patient, List<DiagnosticCenter> diagCenter) {
		super();
		this.id = id;
		this.date = date;
		this.duration = duration;
		this.approvalStatus = approvalStatus;
		this.admin = admin;
		this.patient = patient;
		this.diagCenter = diagCenter;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public LocalDate getDate() {
		return date;
	}



	public void setDate(LocalDate date) {
		this.date = date;
	}



	public int getDuration() {
		return duration;
	}



	public void setDuration(int duration) {
		this.duration = duration;
	}



	public ApprovalStatus getApprovalStatus() {
		return approvalStatus;
	}



	public void setApprovalStatus(ApprovalStatus approvalStatus) {
		this.approvalStatus = approvalStatus;
	}



	public Admin1 getAdmin() {
		return admin;
	}



	public void setAdmin(Admin1 admin) {
		this.admin = admin;
	}



	public Patient1 getPatient() {
		return patient;
	}



	public void setPatient(Patient1 patient) {
		this.patient = patient;
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
		result = prime * result + ((admin == null) ? 0 : admin.hashCode());
		result = prime * result + ((approvalStatus == null) ? 0 : approvalStatus.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((diagCenter == null) ? 0 : diagCenter.hashCode());
		result = prime * result + duration;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Appointment other = (Appointment) obj;
		if (admin == null) {
			if (other.admin != null)
				return false;
		} else if (!admin.equals(other.admin))
			return false;
		if (approvalStatus != other.approvalStatus)
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (diagCenter == null) {
			if (other.diagCenter != null)
				return false;
		} else if (!diagCenter.equals(other.diagCenter))
			return false;
		if (duration != other.duration)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
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
		return "Appointment [id=" + id + ", date=" + date + ", duration=" + duration + ", approvalStatus="
				+ approvalStatus + ", admin=" + admin + ", patient=" + patient + ", diagCenter=" + diagCenter + "]";
	}
	
	
	
}
