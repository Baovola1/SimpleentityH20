package org.formation.hibernate.entity;

import javax.persistence.Embeddable;

@Embeddable
public class address {
	private String street;
	private String city;
	private Long zipcode;
	
	
	public address() {
		
	}
	
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Long getZipcode() {
		return zipcode;
	}
	public void setZipcode(Long zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "address [street=" + street + ", city=" + city + ", zipcode=" + zipcode + "]";
	}
	
	

	
	
	
}


