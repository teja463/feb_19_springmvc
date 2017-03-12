package st.com.mvc;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {
	
	@Autowired
	JobService jobService;

	@RequestMapping("/ajaxnow")
	public @ResponseBody String getNow() {
		return LocalDateTime.now().toString(); // output to be sent directly to client
	}
	
	@RequestMapping("/ajaxjobs")
	public @ResponseBody List<Job> getJobs() {
		return  jobService.getJobs();
	}

}
