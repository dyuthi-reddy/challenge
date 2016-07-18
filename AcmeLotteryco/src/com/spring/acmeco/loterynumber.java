package com.spring.acmeco;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class loterynumber {

	public static Inventory inventory = new Inventory();
	public Customermap customermap = new Customermap();

	
	
	static List<String> pick3inventory = inventory.getPick3List();
	static List<String> pick5inventory = inventory.getPick5List();
	static List<String> pick4inventory = inventory.getPick4List();
	static Boolean soldout = inventory.isBuySoldout();
	
	public List<String> getPick3inventory() {
		return pick3inventory;
	}

	public Boolean getSoldout() {
		return soldout;
	}

	public List<String> getPick4inventory() {
		return pick4inventory;
	}

	public void setPick4inventory(List<String> pick4inventory) {
		loterynumber.pick4inventory = pick4inventory;
	}

	public void setSoldout(Boolean soldout) {
		loterynumber.soldout = soldout;
	}

	@Override
	public String toString() {
		return "loterynumber [inventory=" + inventory + "]";
	}

	public List<String> getPick5inventory() {
		return pick5inventory;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public Customermap getCustomermap() {
		return customermap;
	}

	public void setCustomermap(Customermap customermap) {
		this.customermap = customermap;
	}
	
	public List<String> selectloterytype(String loterytype,int quantity){
		List<String> loterynumber = new ArrayList<>();
		if(loterytype.equals("PICK3")){
			loterynumber = generatepick3(quantity);
		}
		else if(loterytype.equals("PICK5")){
			loterynumber = generatepick5(quantity);
		}
		
		else if(loterytype.equals("PICK4")){
			loterynumber = generatepick4(quantity);
		}
		else{}
		return loterynumber;
	}

	public List<String> generatepick5(int quantity) {
		List<String> loterynumber5 = new ArrayList<>();
		Random rand = new Random();
		
		while(loterynumber5.size() < quantity){
			String randnumber = "";
			for(int i = 0;i<5;i++){
				int randomnumber = rand.nextInt(9);
				Integer randzero = randomnumber;
				String randstring = randzero.toString();
				randnumber = randnumber+randstring;
			}
			if((!loterynumber5.contains(randnumber)) && 
					(!pick5inventory.contains(randnumber))){
				loterynumber5.add(randnumber);
				pick5inventory.add(randnumber);
				inventory.setPick5List(pick5inventory);
				System.out.println("this is pick5inventory"+pick5inventory);
			}

		}
		customermap.storecustomerlotery(loterynumber5, "PICK5");
		return loterynumber5;
	}
	
	private List<String> generatepick4(int quantity) {
		List<String> loterynumber4 = new ArrayList<>();
		Random rand = new Random();
		while(loterynumber4.size() < quantity){
			String randnumber = "";
			for(int i = 0;i<4;i++){
				int randomnumber = rand.nextInt(9);
				Integer randzero = randomnumber;
				String randstring = randzero.toString();
				randnumber = randnumber+randstring;
			}
			if((!loterynumber4.contains(randnumber)) && 
					(!pick4inventory.contains(randnumber))){
				loterynumber4.add(randnumber);
				pick4inventory.add(randnumber);
				inventory.setPick4List(pick4inventory);
				System.out.println("this is pick4inventory"+pick4inventory);
			}
		}
		customermap.storecustomerlotery(loterynumber4,"PICK4");
		return loterynumber4;
	}


	public List<String> generatepick3(int quantity) {
		List<String> loterynumber3 = new ArrayList<>();
		Random rand = new Random();
		while(loterynumber3.size() < quantity){
			String randnumber = "";
			for(int i = 0;i<3;i++){
				int randomnumber = rand.nextInt(9);
				Integer randzero = randomnumber;
				String randstring = randzero.toString();
				randnumber = randnumber+randstring;
			}
			if((!loterynumber3.contains(randnumber)) && 
					(!pick3inventory.contains(randnumber))){
				loterynumber3.add(randnumber);
				pick3inventory.add(randnumber);
				inventory.setPick3List(pick3inventory);
				System.out.println("this is pick3inventory"+pick3inventory);
			}
		}
		customermap.storecustomerlotery(loterynumber3,"PICK3");
		return loterynumber3;
	}

	//quantity selection page validate and display message later
  public boolean checkpickavailability(int quantity, String loterytype){
	  boolean flag =  false;
	  if(loterytype.equals("PICK5")){
	  if(pick5inventory.size()+quantity <= 60){flag = true;}
	  else{
	  flag = false;}}
	  
	  else if(loterytype.equals("PICK4")){
			if(pick4inventory.size()+quantity <= 40)
			{flag = true;}
		    else
		    {flag = false;}
			  
		  }
	  
	  else if(loterytype.equals("PICK3")){
		if(pick3inventory.size()+quantity <= 50)
		{flag = true;}
	    else
	    {flag = false;}
		  
	  }
	  return flag;
	  
  }

  //buttons page validate and display error message latter
public boolean checkpickNotavailable(String loterytype){
	  boolean flag =  false;
	  if(loterytype.equals("PICK5")){
	  if(pick5inventory.size() == 60){
		  
		  flag = true;inventory.setBuySoldout(true);soldout = true;

	  System.out.println(inventory.toString());}
	  else{
	  flag = false;}}
	  
	  else if(loterytype.equals("PICK4")){
			if(pick4inventory.size() == 40)
			{flag = true;inventory.setBuySoldout(true);soldout = true;System.out.println(inventory.toString());}
		    else
		    {flag = false;}
			  
		  }
	  
	  else if(loterytype.equals("PICK3")){
		if(pick3inventory.size() == 50)
		{flag = true;inventory.setBuySoldout(true);soldout = true;System.out.println(inventory.toString());}
	    else
	    {flag = false;}
		  
	  }
	  return flag;
  }
}
