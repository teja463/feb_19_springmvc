package st.com.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JobsController  {
	@Autowired
	JobService service;
	
	@RequestMapping(value = "/jobs", method = RequestMethod.GET)
	public String listOracleJobs(Model model) {
		model.addAttribute("jobs", service.getJobs() );
		return "listJobs";
	}

	@RequestMapping(value = "/employeesByJob/{id}")
	public String listEmployeesByJobs(@PathVariable("id") String id, Model model) {
		model.addAttribute("employees", service.getEmployees(id));
		return "employees";
	}

	
	
	
}
