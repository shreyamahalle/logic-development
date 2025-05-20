package com.shreya.timesheet.repository;

import com.shreya.timesheet.exception.ResourceNotFoundException;
import com.shreya.timesheet.model.Employee;
import com.shreya.timesheet.service.ConnectionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    private final Logger log = LoggerFactory.getLogger(EmployeeRepository.class);

    public boolean save(Employee employee) {
        String sql = "INSERT INTO employee (name, email, department, designation, joining_date, active) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConnectionService.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, employee.getName());
            ps.setString(2, employee.getEmail());
            ps.setString(3, employee.getDepartment());
            ps.setString(4, employee.getDesignation());
            ps.setDate(5, Date.valueOf(employee.getJoiningDate()));
            ps.setBoolean(6, employee.isActive());

            int rows = ps.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            log.error("Error saving employee: {}", employee, e);
            throw new RuntimeException("Error saving employee", e);
        }
    }

    public List<Employee> findAll() {
        List<Employee> list = new ArrayList<>();
        String sql = "SELECT * FROM employee";

        try (Connection conn = ConnectionService.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                list.add(mapRow(rs));
            }
        } catch (SQLException e) {
            log.error("Error retrieving employees", e);
            throw new RuntimeException("Error retrieving employees", e);
        }

        return list;
    }

    public Employee findById(Long id) {
        String sql = "SELECT * FROM employee WHERE id = ?";

        try (Connection conn = ConnectionService.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setLong(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return mapRow(rs);
                } else {
                    throw new ResourceNotFoundException("Employee not found with id " + id);
                }
            }

        } catch (SQLException e) {
            log.error("Error finding employee with id {}", id, e);
            throw new RuntimeException("Error finding employee", e);
        }
    }

    public boolean update(Employee employee) {
        String sql = "UPDATE employee SET name = ?, email = ?, department = ?, designation = ?, joining_date = ?, active = ? WHERE id = ?";

        try (Connection conn = ConnectionService.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, employee.getName());
            ps.setString(2, employee.getEmail());
            ps.setString(3, employee.getDepartment());
            ps.setString(4, employee.getDesignation());
            ps.setDate(5, Date.valueOf(employee.getJoiningDate()));
            ps.setBoolean(6, employee.isActive());
            ps.setLong(7, employee.getId());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            log.error("Error updating employee: {}", employee, e);
            throw new RuntimeException("Error updating employee", e);
        }
    }

    public boolean delete(Long id) {
        String sql = "DELETE FROM employee WHERE id = ?";
        try (Connection conn = ConnectionService.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setLong(1, id);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            log.error("Error deleting employee with id: {}", id, e);
            return false;
        }
    }

    private Employee mapRow(ResultSet rs) throws SQLException {
        return new Employee(
                rs.getLong("id"),
                rs.getString("name"),
                rs.getString("email"),
                rs.getString("department"),
                rs.getString("designation"),
                rs.getDate("joining_date").toLocalDate(),
                rs.getBoolean("active")
        );
    }
}
