package st.com.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*  Note: Need to use ModelAttribute with name for error messages
          to be displayed in .jsp */

@Controller
public class DiscountController2 {

	@RequestMapping(  value="/discount2",  method= RequestMethod.GET)
	public String  displayForm(Model model)
	{
		Discount d = new Discount();
        model.addAttribute("discount", d);
		return "discount2";
	}

	@RequestMapping(  value="/discount2", method= RequestMethod.POST)
	public String  processForm(Model model,@Valid @ModelAttribute("discount") Discount d,
			 BindingResult result)
	{
		if (!result.hasErrors())
		{
   	       d.setDiscount(d.getAmount() * d.getRate() / 100);
		}
		else
		{
			System.out.println("Error");
			System.out.println(result.getFieldError("amount").getDefaultMessage());

		}

		model.addAttribute("command", d);
		return "discount2";
	}

}
