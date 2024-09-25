package com.noob.Employee.services;

import com.noob.Employee.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployee();

    Boolean deleteEmployee(Long id);

    Employee getEmployeeById(Long id);

    Employee updateEmployeeDetails(Long id, Employee employee);
}
