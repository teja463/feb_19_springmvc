package  st.com.mvc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class JobRowMapper implements RowMapper<Job> {

    @Override
    public Job mapRow(ResultSet rs, int arg1) throws SQLException {
        Job j = new Job( rs.getString("job_id"),rs.getString("job_title"));
        return j;
    }

}
