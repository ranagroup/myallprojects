package com.abc.services;

import com.abc.object.Address;

	public class AddressService {

		public void saveAddress(Address address) {
			System.out.println("*****************************");
			System.out.println("saving just the address");
			System.out.println(address.toString());
		}
	}


