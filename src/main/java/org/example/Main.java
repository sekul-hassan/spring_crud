package org.example;

import org.example.config.AppConfig;
import org.example.dao.EmployeeDAO;
import org.example.models.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeDAO dao = context.getBean(EmployeeDAO.class);

        Employee employee = new Employee("sekul","sekul@gmail.com","HR");
        dao.save(employee);

        System.out.println("Inserted" + employee);

        List<Employee> employees = dao.findAll();

        System.out.println("All Employees");
        for(Employee emp : employees) {
            System.out.println(emp);
        }

        System.out.println("Fine byId Employee");
        Employee one = dao.findById(7);
        System.out.println(one);

        System.out.println("Update Employee");
        Employee inserted = dao.findAll().getLast(); // get last inserted
        inserted.setDepartment("Finance");
        dao.update(inserted);


        System.out.println("Delete Employee");
        dao.delete(one.getId());
        System.out.println("Deleted");

        System.out.println("Udated and deleted");
        List<Employee> employees2 = dao.findAll();

        System.out.println("All Employees");
        for(Employee emp : employees2) {
            System.out.println(emp);
        }

        context.close();
    }
}