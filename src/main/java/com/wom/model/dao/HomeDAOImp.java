package com.wom.model.dao;

        import java.util.List;
        import javax.sql.DataSource;
        import org.springframework.jdbc.core.JdbcTemplate;

public class HomeDAOImp implements HomeDAO {

    private DataSource dataSource;

    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(this.dataSource);
    }

    public void create(String title) {
        String SQL = "insert into home (title) values (?)";

        jdbcTemplateObject.update( SQL, title);
        return;
    }

    public void delete(Integer id){
        String SQL = "delete from home where id = ?";
        jdbcTemplateObject.update(SQL, id);
        System.out.println("Deleted Record with ID = " + id );
        return;
    }

    public void update(Integer id, Integer age){
        String SQL = "update home set age = ? where id = ?";
        jdbcTemplateObject.update(SQL, age, id);
        System.out.println("Updated Record with ID = " + id );
        return;
    }

}