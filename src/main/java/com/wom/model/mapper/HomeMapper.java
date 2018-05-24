package com.wom.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.wom.model.Home;
import org.springframework.jdbc.core.RowMapper;

/**
 * Created by User on 13/12/2016.
 */
public class HomeMapper {

    public class StudentMapper implements RowMapper<Home> {
        public Home mapRow(ResultSet rs, int rowNum) throws SQLException {
            Home home = new Home();
            home.setId(rs.getInt("id"));
            return home;
        }
    }
}