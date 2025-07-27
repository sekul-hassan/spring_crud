package org.example.dao;

import org.example.models.Employee;

import java.util.List;

public interface EmployeeDAO {

    void save(Employee employee);
    Employee findById(int id);
    List<Employee> findAll();
    void update(Employee employee);
    void delete(int id);
}
