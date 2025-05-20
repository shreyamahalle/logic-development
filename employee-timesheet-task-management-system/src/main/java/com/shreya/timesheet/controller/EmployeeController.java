package com.shreya.timesheet.controller;

import com.shreya.timesheet.model.Employee;
import com.shreya.timesheet.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/api/employeeManagement")
    public class EmployeeController {

        private final EmployeeService service;

        public EmployeeController(EmployeeService service) {
            this.service = service;
        }

        @PostMapping
        public ResponseEntity<Boolean> addEmployee(@RequestBody Employee employee) {
            boolean saved = service.addEmployee(employee);
            return ResponseEntity.status(201).body(saved);
        }

        @GetMapping
        public ResponseEntity<List<Employee>> getAllEmployees() {
            return ResponseEntity.ok(service.getAllEmployees());
        }

        @GetMapping("/employee/{id}")
        public ResponseEntity<Employee> getEmployee(@PathVariable Long id) {
            return ResponseEntity.ok(service.getEmployeeById(id));
        }

        @PutMapping("/employee/{id}")
        public ResponseEntity<Boolean> updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
            employee.setId(id);
            return ResponseEntity.ok(service.updateEmployee(employee));
        }

        @DeleteMapping("/employee/{id}")
        public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
            service.deleteEmployee(id);
            return ResponseEntity.noContent().build();
        }
    }

