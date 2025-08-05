package com.shreya.timesheet.service;

import com.shreya.timesheet.model.Employee;

import java.util.List;

public interface EmployeeService {

    boolean addEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    boolean updateEmployee(Employee employee);

    void deleteEmployee(Long id);
}


