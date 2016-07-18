package com.spring.acmelotery.finaldraw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.acmeco.Customer;
import com.spring.acmeco.Customermap;
import com.spring.acmeco.Inventory;
import com.spring.acmeco.loterynumber;

@Controller
public class FinalDraw {
	loterynumber lotnumber = new loterynumber();
	Customermap customermap = new Customermap();
    DrawLottery drawlottery = new DrawLottery();
    Customer customer = customermap.getCustomer();
    Inventory inventoryfordraw = lotnumber.getInventory();
	List<String> pick3Listdraw = lotnumber.getPick3inventory();
	List<String> pick5Listdraw = lotnumber.getPick5inventory();
	List<String> pick4Listdraw = lotnumber.getPick5inventory();
	List<String> winnerslist = new ArrayList<>();
	HashMap<Integer,String> lotterytypemaps = new HashMap<Integer,String>();

	
	@RequestMapping(value = "/draw", method = RequestMethod.GET)
	public ModelAndView loterrys() {
		winnerslist = drawlottery.drawLoterry();
		lotterytypemaps = drawlottery.findwinner();
	      ModelAndView mav = new ModelAndView("draw");
	      if((pick3Listdraw.size() < 50) && (pick5Listdraw.size() < 60) && (pick4Listdraw.size() < 40)){
	  		mav.addObject("message", "Not Ready for draw");
	  		System.out.println("Not Ready for draw"+pick3Listdraw.size());
	  	}
	  	else{mav.addObject("message", "Ready for draw");
	  	System.out.println("Ready for draw"+pick3Listdraw.size());
	  	System.out.println(inventoryfordraw.toString());}
		return mav;
	   }
	@RequestMapping("/drawResults")
	public String readyfordraw(ModelMap model){
		
		if(winnerslist.size() != 0){
		model.addAttribute("winnerlist", winnerslist);
		}
		else{model.addAttribute("message", "Comming Soon");}
		return "drawresults";
	}
	
	@RequestMapping("/drawsummary")
	public String displaydrawreport(ModelMap model){
		if(winnerslist.size() != 0){
		model.addAttribute("winnerlist1",winnerslist );
		if(lotnumber.getInventory().isBuySoldout() == true){
		model.addAttribute("attemptsoldout", "Customers attempted to purchase sold out ticket types");}
		else{model.addAttribute("attemptsoldout", "Customers did not attempt to purchase sold out ticket types");}
		model.addAttribute("custlotmapsize", customer.getCustomerloterymap().size());
		model.addAttribute("custlotmaptypelist", customer.getCustomertypemap());
		model.addAttribute("winnerids", lotterytypemaps);
		}
		
		else{model.addAttribute("messageinfo", "Report under construction");}
	
		return "DrawSummary";
	}
	
	@RequestMapping("/drawclose")
	public String redirecttodraw(){
		drawlottery.clearStatics();
		return "Home";
	}
}
