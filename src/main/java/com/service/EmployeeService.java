package com.service;

import com.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployee();
    Employee getEmployee(int id);
    Employee updateEmployee(Employee employee);
    void deleteEmployee(int id);
}
