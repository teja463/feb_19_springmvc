package st.com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DiscountController {
	
	@RequestMapping(  value="/discount", method= RequestMethod.GET)
	public String  displayForm(Model model)
	{
		System.out.println("displayForm");
		return "discount";
	}
	
	@RequestMapping(  value="/discount", method= RequestMethod.POST)
	public String  processForm(Model model,
			 @RequestParam("amount") double amount,
			 @RequestParam("rate") double rate)
	{
		System.out.println("processForm");
		
		double discount = amount * rate / 100; 
		model.addAttribute("discount", discount);
		return "discount";
	}

}
