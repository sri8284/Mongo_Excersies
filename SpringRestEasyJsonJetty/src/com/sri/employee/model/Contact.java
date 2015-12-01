package com.sri.employee.model;

import java.util.Set;

public class Contact {

	private Address address;
	private Set<Phone> phone;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Set<Phone> getPhone() {
		return phone;
	}
	public void setPhone(Set<Phone> phone) {
		this.phone = phone;
	}
}
