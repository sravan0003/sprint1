package com.project.spring.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class TestResults {

	@Column(name = "result_id")
	private Long id;
	@Enumerated(EnumType.STRING)
	private Condition condition;
	private String actualValue;
	private String description;
	
	
	
	public TestResults() {
		super();
	}



	public TestResults(Long id, Condition condition, String actualValue, String description) {
		super();
		this.id = id;
		this.condition = condition;
		this.actualValue = actualValue;
		this.description = description;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Condition getCondition() {
		return condition;
	}



	public void setCondition(Condition condition) {
		this.condition = condition;
	}



	public String getActualValue() {
		return actualValue;
	}



	public void setActualValue(String actualValue) {
		this.actualValue = actualValue;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actualValue == null) ? 0 : actualValue.hashCode());
		result = prime * result + ((condition == null) ? 0 : condition.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		TestResults other = (TestResults) obj;
		if (actualValue == null) {
			if (other.actualValue != null)
				return false;
		} else if (!actualValue.equals(other.actualValue))
			return false;
		if (condition != other.condition)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "TestResults [id=" + id + ", condition=" + condition + ", actualValue=" + actualValue + ", description="
				+ description + "]";
	}
	
	
	
	
}
