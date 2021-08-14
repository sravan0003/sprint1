package com.project.spring.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String city;
	private Integer pincode;
	
	
	public Address() {
		super();
	}


	public Address(String city, Integer pincode) {
		super();
		this.city = city;
		this.pincode = pincode;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public Integer getPincode() {
		return pincode;
	}


	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((pincode == null) ? 0 : pincode.hashCode());
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
		Address other = (Address) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (pincode == null) {
			if (other.pincode != null)
				return false;
		} else if (!pincode.equals(other.pincode))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + "]";
	}
	
	
	
}
