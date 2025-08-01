package org.example.models;

public class Employee {
    private int id;
    private String name;
    private String email;
    private String department;

    public Employee(){}

    public Employee(String name, String email, String department) {
        this.name = name;
        this.email = email;
        this.department = department;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString(){
        return "Employee{" +
                "id=" + id +
                ", name=" + name +
                ", email" + email +
                ", department" + department;
    }

}
