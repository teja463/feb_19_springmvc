package st.com.mvc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;

@Service
public class JobService extends JdbcDaoSupport {
	
	@Autowired
	public JobService(DataSource ds) {
		setDataSource(ds);
	}
	 
    public List<Job> getJobs() {
        List<Job> jobs = getJdbcTemplate().query("select * from jobs",  new JobRowMapper());
        return jobs;
    }
    
    public List<Employee> getEmployees(String id) {

        List<Employee> jobs = getJdbcTemplate().query("select * from employees where job_id = ?",
                new EmployeeRowMapper(), id);
        return jobs;
    }
    
   }
