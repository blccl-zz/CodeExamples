package com.wom.model.dao;

import java.util.List;
import javax.sql.DataSource;

/**
 * Created by User on 13/12/2016.
 */
public interface HomeDAO {

     void setDataSource(DataSource ds);
     void create(String title);
     void delete(Integer id);
     void update(Integer id, Integer age);
}