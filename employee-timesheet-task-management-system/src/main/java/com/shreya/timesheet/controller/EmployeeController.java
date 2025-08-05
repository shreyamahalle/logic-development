package com.shreya.timesheet.controller;

import com.shreya.timesheet.model.Employee;
import com.shreya.timesheet.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employeeManagement")
public class EmployeeController {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    private final EmployeeService service;

    @PostMapping
    public ResponseEntity<Boolean> addEmployee(@RequestBody Employee employee) {
        logger.info("Adding new employee: {}", employee.getName());
        boolean saved = service.addEmployee(employee);
        logger.debug("Employee added status: {}", saved);
        return ResponseEntity.status(201).body(saved);
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        logger.info("Fetching all employees");
        List<Employee> employees = service.getAllEmployees();
        logger.debug("Total employees fetched: {}", employees.size());
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable Long id) {
        logger.info("Fetching employee with ID: {}", id);
        Employee employee = service.getEmployeeById(id);
        return ResponseEntity.ok(employee);
    }

    @PutMapping("/employee/{id}")
    public ResponseEntity<Boolean> updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        logger.info("Updating employee with ID: {}", id);
        employee.setId(id);
        boolean updated = service.updateEmployee(employee);
        logger.debug("Employee update status: {}", updated);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/employee/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        logger.warn("Deleting employee with ID: {}", id);
        service.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }
}
