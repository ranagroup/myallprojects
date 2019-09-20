package com.abc.dtos;

public class RegisterDto {
	private String first_name;
	private String last_name;
	private String email;
	private String contact_No;
	private String address;

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact_No() {
		return contact_No;
	}

	public void setContact_No(String contact_No) {
		this.contact_No = contact_No;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "RegisterDto [first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
				+ ", contact_No=" + contact_No + ", address=" + address + "]";
	}

}