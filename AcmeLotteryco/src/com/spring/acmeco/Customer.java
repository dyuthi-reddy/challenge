package com.spring.acmeco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Customer {
   private int CustomerID = 99;
   private List<String> loterynumbers = new ArrayList<>();
   
   private HashMap<Integer, List<String>> customerloterymap = new HashMap<Integer, List<String>>() ;
   private HashMap<Integer, String> customertypemap = new HashMap<Integer, String>() ;
public HashMap<Integer, String> getCustomertypemap() {
	return customertypemap;
}

public void setCustomertypemap(HashMap<Integer, String> customertypemap) {
	this.customertypemap = customertypemap;
}

public int getCustomerID() {
	return CustomerID;
}

public void setCustomerID(int customerID) {
	CustomerID = customerID;
}

public List<String> getLoterynumbers() {
	return loterynumbers;
}

public void setLoterynumbers(List<String> loterynumbers) {
	this.loterynumbers = loterynumbers;
}

public HashMap<Integer, List<String>> getCustomerloterymap() {
	return customerloterymap;
}

public void setCustomerloterymap(HashMap<Integer, List<String>> customerloterymap) {
	this.customerloterymap = customerloterymap;
}
     
}
