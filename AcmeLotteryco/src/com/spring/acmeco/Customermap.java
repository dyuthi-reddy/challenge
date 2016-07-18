package com.spring.acmeco;

import java.util.HashMap;
import java.util.List;

public class Customermap {
     
	public static Customer customer = new Customer();
	public static HashMap<Integer, List<String>> customerloterymaptemp = customer.getCustomerloterymap();
	public static HashMap<Integer, String> customerloterytypetemp = customer.getCustomertypemap();
	
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		Customermap.customer = customer;
	}

	public void storecustomerlotery(List<String> loterylist, String loterrytypecust){
		
		
		customer.setLoterynumbers(loterylist);
		customerloterymaptemp.put(customer.getCustomerID()+1, loterylist);
		customer.setCustomerID(customer.getCustomerID()+1);
		customer.setCustomerloterymap(customerloterymaptemp);
		customerloterytypetemp.put(customer.getCustomerID(), loterrytypecust);
		customer.setCustomertypemap(customerloterytypetemp);
		System.out.println(customerloterymaptemp);
	}
}
