package org.formation.hibernate.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class person {
	
	

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	
	@Embedded
	address address;
	
	
	public person() {
		
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
	
	public address getAddress() {
		return address;
	}


	public void setAddress(address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	

}
