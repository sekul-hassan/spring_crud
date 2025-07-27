package org.example.dao;

import org.example.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;


public class EmployeeDAOImpl implements EmployeeDAO {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private final RowMapper<Employee> employeeRowMapper = (rs, rowNum) -> {
        Employee employee = new Employee();
        employee.setId(rs.getInt("id"));
        employee.setName(rs.getString("name"));
        employee.setEmail(rs.getString("email"));
        employee.setDepartment(rs.getString("department"));
        return employee;
    };

    @Override
    public void save(Employee employee){
        String sql = "INSERT INTO employee (name, email, department) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, employee.getName(), employee.getEmail(), employee.getDepartment());

    }

    @Override
    public Employee findById(int id){
        String sql = "SELECT * FROM employee WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, employeeRowMapper);
    }


    @Override
    public List<Employee> findAll(){
        String sql = "SELECT * FROM employee";
        return jdbcTemplate.query(sql,employeeRowMapper);
    }

    @Override
    public void update(Employee employee){
        String sql = "UPDATE employee SET name=?,email=?,department=? WHERE id=?";
        jdbcTemplate.update(sql,employee.getName(),employee.getEmail(),employee.getDepartment(),employee.getId());
    }

    public void delete(int id){
        String sql = "DELETE FROM employee WHERE id=?";
        jdbcTemplate.update(sql,id);
    }

}
