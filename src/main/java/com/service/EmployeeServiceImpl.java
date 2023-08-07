package com.service;

import com.dao.EmployeeDao;
import com.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDao employeeDao;

    EmployeeServiceImpl(EmployeeDao employeeDao){
        this.employeeDao = employeeDao;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeDao.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeDao.findAll();
    }

    @Override
    public Employee getEmployee(int id) {
        return employeeDao.getById(id);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        Employee employee1 = employeeDao.findById(employee.getId()).orElse(null);
        if (employee1 != null)
            return employeeDao.save(employee);
        return null;
    }

    @Override
    public void deleteEmployee(int id) {
        Employee employee1 = employeeDao.findById(id).orElse(null);
        if (employee1 != null)
            employeeDao.deleteById(id);
    }
}
