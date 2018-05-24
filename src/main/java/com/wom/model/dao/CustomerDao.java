package com.wom.model.dao;

import com.wom.model.Customer;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerDao {

    @PersistenceContext
    private EntityManager entityManager;

    public Customer findCustomer(String id) {
        if (id == null) return null;
        return entityManager.find(Customer.class, id);
    }



}
