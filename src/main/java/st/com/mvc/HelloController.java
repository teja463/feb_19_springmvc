package st.com.mvc;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(Model model,
			@RequestParam( name="name", required=false, defaultValue="Spring MVC") String name) {
		model.addAttribute("message","Hello " + name);
		return "hello"; // view name
	}
	
	@RequestMapping(value = "/now", method = RequestMethod.GET)
	public String now(Model model) {
		Date date = new Date();
		model.addAttribute("serverTime", date.toString());
		return "now"; // view name
	}
}
