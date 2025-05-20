package com.shreya.timesheet.service.impl;

import com.shreya.timesheet.exception.ResourceNotFoundException;
import com.shreya.timesheet.model.Employee;
import com.shreya.timesheet.repository.EmployeeRepository;
import com.shreya.timesheet.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class EmployeeServiceImpl implements EmployeeService {

        private final EmployeeRepository repo;

        public EmployeeServiceImpl(EmployeeRepository repo) {
            this.repo = repo;
        }

        @Override
        public boolean addEmployee(Employee employee) {
            return repo.save(employee);
        }

        @Override
        public List<Employee> getAllEmployees() {
            return repo.findAll();
        }

        @Override
        public Employee getEmployeeById(Long id) {
            Employee employee = repo.findById(id);
            if (employee == null) {
                throw new ResourceNotFoundException("Employee not found with id " + id);
            }
            return employee;
        }

        @Override
        public boolean updateEmployee(Employee employee) {
            Employee existing = getEmployeeById(employee.getId());
            existing.setName(employee.getName());
            existing.setEmail(employee.getEmail());
            existing.setDepartment(employee.getDepartment());
            existing.setDesignation(employee.getDesignation());
            existing.setJoiningDate(employee.getJoiningDate());
            existing.setActive(employee.isActive());
            return repo.save(existing);
        }

        @Override
        public void deleteEmployee(Long id) {
            Employee existing = getEmployeeById(id);
            repo.delete(existing.getId());
        }
    }

