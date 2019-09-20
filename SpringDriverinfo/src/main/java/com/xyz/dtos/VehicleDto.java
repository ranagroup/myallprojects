package com.xyz.dtos;

public class VehicleDto {
	private String make;
	private String model;
	private int year;
	private String VIN;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getVIN() {
		return VIN;
	}

	public void setVIN(String vIN) {
		VIN = vIN;
	}

	@Override
	public String toString() {
		return "VehicleDto [make=" + make + ", model=" + model + ", year=" + year + ", VIN=" + VIN + "]";
	}

}
