package com.student.info.dtos;

public class StudentDto {
	private String name;
	private int roll;
	private String department;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "StudentDto [name=" + name + ", roll=" + roll + ", department=" + department + ", address=" + address
				+ "]";
	}

}
