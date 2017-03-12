package st.com.mvc;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CourseController {

	@RequestMapping(value = "/courses", method = RequestMethod.GET)
	public String list(Model model) {
		ArrayList<Course> cl = new ArrayList<>();
		cl.add( new Course("Java SE",3500));
		cl.add( new Course("Java EE",4000));
		cl.add( new Course("Microsoft.Net",5500));
		
		model.addAttribute("courses",cl);
		return "courses"; // view name
	}
	
	@RequestMapping(value = "/filterCourses/{fee}", method = RequestMethod.GET)
	public String filterCourses(Model model, @PathVariable("fee") int fee)
	{
		System.out.println(fee);
		
		ArrayList<Course> cl = new ArrayList<>();
		cl.add( new Course("Java SE",3500));
		cl.add( new Course("Java EE",4000));
		cl.add( new Course("Microsoft.Net",5500));
		
		Iterator<Course> selectedCourses = cl.stream().filter( c -> c.getFee() <= fee).iterator();
		
		model.addAttribute("courses",selectedCourses);
		return "courses"; // view name
	}
	
}
