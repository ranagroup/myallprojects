package com.xyz.dtos;

public class DriverDto {
	private String Name;
	private String ID;
	private String address;
	private String Phone;
	private String Email;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "DriverDto [Name=" + Name + ", ID=" + ID + ", address=" + address + ", Phone=" + Phone + ", Email="
				+ Email + "]";
	}

}
