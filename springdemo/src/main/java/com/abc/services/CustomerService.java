package com.abc.services;

import com.abc.object.Customer;

public class CustomerService {

	private AddressService addressService;

	public void saveCustomer(Customer cust) {
		System.out.println("saving customer in total");
		addressService.saveAddress(cust.getAddress());
		System.out.println("****************************");
		System.out.println("saving customer part only");
		System.out.println(cust.toString());
	}

	public AddressService getAddressService() {
		return addressService;
	}

	public void setAddressService(AddressService addressService) {
		this.addressService = addressService;
	}

}
