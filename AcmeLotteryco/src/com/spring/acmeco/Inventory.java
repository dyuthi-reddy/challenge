package com.spring.acmeco;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	
	public List<String> pick3List = new ArrayList<>();
	public List<String> pick4List = new ArrayList<>();
	public List<String> pick5List = new ArrayList<>();
	public boolean buySoldout = false;
	
	public boolean isBuySoldout() {
		return buySoldout;
	}
	public void setBuySoldout(boolean buySoldout) {
		this.buySoldout = buySoldout;
	}
	public List<String> getPick3List() {
		return pick3List;
	}
	public void setPick3List(List<String> pick3List) {
		this.pick3List = pick3List;
	}
	public List<String> getPick5List() {
		return pick5List;
	}
	public void setPick5List(List<String> pick5List) {
		this.pick5List = pick5List;
	}
	public List<String> getPick4List() {
		return pick4List;
	}
	public void setPick4List(List<String> pick4List) {
		this.pick4List = pick4List;
	}
	@Override
	public String toString() {
		return "Inventory [pick3List=" + pick3List + ", pick4List=" + pick4List + ", pick5List=" + pick5List
				+ ", buySoldout=" + buySoldout + "]";
	}
	
	
	
}
