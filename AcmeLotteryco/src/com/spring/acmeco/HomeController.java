package com.spring.acmeco;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("type")
public class HomeController {
	loterynumber lotnum= new loterynumber();
	Customermap customermap = new Customermap();
	 Customer customer = customermap.getCustomer();
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView loterrys() {
	      return new ModelAndView("Home","command", new loterry());
	   }

	// directed to lottery button
	@RequestMapping(value = "/Home", method = RequestMethod.GET)
	public String Displaybuttons(){
       
		return "loterry";
	}
	
	//pick 3 lotterysales
	@RequestMapping(value = "/pick3sales", method = RequestMethod.POST)
	public String pick3sales(ModelMap model, @RequestParam("lotterytype") String typelottery){
		//types = type;
		//lotery.setLotterytype(type);
		model.addAttribute("type", typelottery);
		if(lotnum.checkpickNotavailable(typelottery) == true){
			model.addAttribute("message", "The PICK3 Lotery Tickets are Sold Out");
			return "loterry";}
		else{
			
		return "sales";}
		
	}
	
	//pick 3 lotterysales
		@RequestMapping(value = "/pick4sales", method = RequestMethod.POST)
		public String pick4sales(ModelMap model, @RequestParam("lotterytype") String typelottery){
			//types = type;
			//lotery.setLotterytype(type);
			model.addAttribute("type", typelottery);
			if(lotnum.checkpickNotavailable(typelottery) == true){
				model.addAttribute("message2", "The PICK4 Lotery Tickets are Sold Out");
				return "loterry";}
			else{
				
			return "sales";}
			
		}
		
	//pick 5 lotterysales
	@RequestMapping(value = "/pick5sales", method = RequestMethod.POST)
	public String pick5sales(ModelMap model, @RequestParam("lotterytype") String typelottery){
		//types = type;
		//lotery.setLotterytype(type);
		model.addAttribute("type", typelottery);
       //System.out.println(lotery.toString());
		if(lotnum.checkpickNotavailable(typelottery) == true){
			model.addAttribute("message1", "The PICK5 Lotery Tickets are Sold Out");
			return "loterry";
		}
		else{
		return "sales";}
		
	}
	
		
		//pick 5 lotterysales
	@RequestMapping(value = "/salecount", method = RequestMethod.POST)
	public String salecount(ModelMap model,@RequestParam("quantity") String quantity, @ModelAttribute("type") String types){
     
		
		if((quantity.equals("1") || quantity.equals("2") || quantity.equals("3") || 
				quantity.equals("4") || quantity.equals("5")) 
				&& (lotnum.checkpickavailability(Integer.parseInt(quantity), types) == true))
		{
			loterry lot = new loterry();
			
			lot.setLotterytype(types);
			lot.setQuantity(Integer.parseInt(quantity));
			System.out.println(quantity);
			model.addAttribute("count",lot.getQuantity());
			model.addAttribute("typeloterry", lot.getLotterytype());
			model.addAttribute("loterynumberlist", lotnum.selectloterytype(types,Integer.parseInt(quantity)));
			model.addAttribute("customerid", customer.getCustomerID());
			System.out.println(lot.toString());
			
		       return "ordersummary";
		       }
		else{
			    if(quantity.equals("0")){
			     model.addAttribute("message2", "Please select a valid quantity");
			     return "sales";
			     }
		      else{
		           model.addAttribute("message3", "Requested Quantity not available; please select a lesser qunatity and try");
		            return "sales";
		     }}
	}
	
	@RequestMapping(value = "/close", method = RequestMethod.POST)
	public String backToHome(){
       
		return "Home";
	}
		
		
}
