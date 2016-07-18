package com.spring.acmelotery.finaldraw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.spring.acmeco.Customer;
import com.spring.acmeco.Customermap;
import com.spring.acmeco.loterry;
import com.spring.acmeco.loterynumber;

public class DrawLottery {
   Draw draw = new Draw();
   loterynumber lotnumbers = new loterynumber();
	List<String> pick3Listdraw = lotnumbers.getPick3inventory();
	List<String> pick4Listdraw = lotnumbers.getPick4inventory();
	List<String> pick5Listdraw = lotnumbers.getPick5inventory();
	Customermap customermap = new Customermap();
	Customer customer = customermap.getCustomer();
	HashMap<Integer, List<String>> custlotmap =  customer.getCustomerloterymap();
	Boolean soldout = lotnumbers.getInventory().isBuySoldout();
	List<List<String>> loterrytypelist = new ArrayList<List<String>>();
	List<String> getwinningtickets = new ArrayList<>();
	HashMap<Integer, String> custlottypemap = customer.getCustomertypemap();
	
	public List<String> drawLoterry(){
		List<String> winnerList = new ArrayList<>();
		if(pick3Listdraw.size() == 50 && pick5Listdraw.size() == 60 && pick4Listdraw.size() == 40){
		int winnercount = draw.getLotteryCount();
		loterrytypelist.add(pick3Listdraw);
		loterrytypelist.add(pick5Listdraw);
		loterrytypelist.add(pick4Listdraw);
		System.out.println(pick3Listdraw);
		System.out.println(lotnumbers.getPick3inventory());
		for(int i = 0;i<winnercount;i++){
			Random rand = new Random();
			int tempindex = loterrytypelist.get(i).size();
			System.out.println(tempindex);
			if(tempindex > 0){
			int temp = rand.nextInt(tempindex);
			String winner = loterrytypelist.get(i).get(temp);
			winnerList.add(winner);
			getwinningtickets.add(winner);
			}
		}
		}
		
		return winnerList;
	}

	public HashMap<Integer, String> findwinner() {
		int winningcustomer = 0;
		HashMap<Integer,String> lotterytypemap = new HashMap<>();
		for(String winnerstring:getwinningtickets){
		for(Map.Entry<Integer, List<String>> map : custlotmap.entrySet()){
			if(map.getValue().contains(winnerstring)){
				winningcustomer = map.getKey();
				lotterytypemap.put(winningcustomer,custlottypemap.get(winningcustomer));
				System.out.println("I won"+winningcustomer);
			   break;
			}
		}
	
		}

		return lotterytypemap;
	}

	public void clearStatics(){
		if(pick3Listdraw.size() == 50 && pick5Listdraw.size() == 60 && pick4Listdraw.size() == 40){
		pick3Listdraw.clear();
		pick4Listdraw.clear();
		pick5Listdraw.clear();
		lotnumbers.getInventory().setBuySoldout(false);
		getwinningtickets.clear();
		
	
		
		}
	}
}
