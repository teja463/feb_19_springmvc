package st.com.mvc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
        Employee e = new Employee();
        e.setName( rs.getString("first_name"));
        e.setEmail( rs.getString("email"));
        e.setSalary( rs.getInt("salary"));
        return e;
        
    }

}
