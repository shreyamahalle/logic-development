package com.shreya.healthcare.service;
import com.shreya.healthcare.model.Department;
import java.util.Scanner;

public class DepartmentService {

    private static final Scanner scanner = new Scanner(System.in);
    //private static Department[] departments = Department[5];
    Department department = new Department();

    public Department createDepartment() {
        System.out.println("Enter dept id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter dept name");
        String deptName = scanner.nextLine();
        System.out.println("Enter doctorId");
        int doctorId = Integer.parseInt(scanner.nextLine());
        department.setDeptId(id);
        department.setDeptName(deptName);
        department.setDoctorId(doctorId);
        return department;
    }
}
