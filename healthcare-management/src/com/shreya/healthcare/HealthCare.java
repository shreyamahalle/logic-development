package com.shreya.healthcare;
import com.shreya.healthcare.model.*;

import java.util.Scanner;

public class HealthCare {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HealthCare healthCare = new HealthCare();
        int option = 0;
        do {
            System.out.println("----------------Health-Care Management----------------");
            System.out.println("Please choose the option:");
            System.out.println("1. Create Patient:");
            System.out.println("2. Create Department:");
            System.out.println("3. Create Doctor:");
            System.out.println("4. Create Appointment:");
            System.out.println("5. Create Nurse:");
            System.out.println("6. Create Hospital:");
            System.out.println("7. Create Billing:");
            System.out.println("8. Create Address:");
            System.out.println("9. Create Prescription:");
            System.out.println("10. Exit Project:");
            option = Integer.parseInt(scanner.nextLine());
            if (option == 1) {
                Patient patient = healthCare.createPatient();
                System.out.println("Patient Created " + patient);
            }
            if (option == 2) {
                Department department = healthCare.createDepartment();
                System.out.println("Department Created " + department);
            }
            if (option == 3) {
                Doctor doctor = healthCare.createDoctor();
                System.out.println("Doctor created " + doctor);
            }
            if (option == 4) {
                Appointment appointment = healthCare.createAppointment();
                System.out.println("Appointment created " + appointment);
            }
            if (option == 5) {
                Nurse nurse = healthCare.createNurse();
                System.out.println("Nurse created " + nurse);
            }
            if (option == 6){
                Hospital hospital = healthCare.createHospital();
                System.out.println("Hospital created " + hospital);
            }
        } while (option != 0);
    }

    private Patient createPatient() {
        System.out.println("Enter id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter fName");
        String fName = (scanner.nextLine());
        System.out.println("Enter lName");
        String lName = scanner.nextLine();
        System.out.println("Enter mobileNo");
        String mobileNo = (scanner.nextLine());
        System.out.println("Enter alternativeMobileNo");
        String alternativeMobileNo = (scanner.nextLine());
        System.out.println("Enter address");
        String address = (scanner.nextLine());
        System.out.println("Enter paymentDetails");
        String paymentDetails = (scanner.nextLine());
        System.out.println("Enter age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter gender");
        String gender = (scanner.nextLine());
        Patient patient = new Patient();
        patient.setId(id);
        patient.setfName(fName);
        patient.setlName(lName);
        ;
        patient.setMobileNo(mobileNo);
        patient.setAlternativeMobileNo(alternativeMobileNo);
        patient.setAddress(address);
        patient.setPaymentDetails(paymentDetails);
        patient.setAge(age);
        patient.setGender(gender);
        return patient;
    }

    private Department createDepartment() {
        System.out.println("Enter dept id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter dept name");
        String deptName = scanner.nextLine();
        System.out.println("Enter doctorId");
        int doctorId = Integer.parseInt(scanner.nextLine());
        Department department = new Department();
        department.setDeptId(id);
        department.setDeptName(deptName);
        department.setDoctorId(doctorId);
        return department;
    }

    private Doctor createDoctor() {
        System.out.println("Enter Doctor Id");
        int doctorId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Doctor Name");
        String docName = scanner.nextLine();
        System.out.println("Enter Doctor lName");
        String docLName = scanner.nextLine();
        System.out.println("Enter Doctor Mobile Number");
        String docMobileNo = (scanner.nextLine());
        Doctor doctor = new Doctor();
        doctor.setDoctorId(doctorId);
        doctor.setDocName(docName);
        doctor.setDocLName(docLName);
        doctor.setDocMobileNo(docMobileNo);
        return doctor;
    }

    private Appointment createAppointment() {
        System.out.println("Enter Appointment Id ");
        int appointmentId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter patient Id ");
        int patientId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter doctor Id ");
        int doctorId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter dept Id ");
        int deptId = Integer.parseInt(scanner.nextLine());
        Appointment appointment = new Appointment();
        appointment.setAppointmentId(appointmentId);
        appointment.setDeptId(deptId);
        appointment.setPatientId(patientId);
        appointment.setDeptId(doctorId);
        return appointment;
    }

    private Nurse createNurse() {
        System.out.println("Enter Nurse Id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Nurse name");
        String name = scanner.nextLine();
        System.out.println("Enter Nurse lName");
        String lName = scanner.nextLine();
        Nurse nurse = new Nurse();
        nurse.setId(id);
        nurse.setlName(lName);
        nurse.setName(name);
        return nurse;
    }

    private Hospital createHospital() {
        System.out.println("Enter Hospital Id");
        int hospitalId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter hospitalName");
        String hospitalName = scanner.nextLine();
        System.out.println("Enter hospitalAddress");
        String hospitalAddress = scanner.nextLine();
        System.out.println("Enter emailId");
        String emailId = scanner.nextLine();
        System.out.println("Enter contactNo");
        String contactNo = scanner.nextLine();

        Hospital hospital = new Hospital();
        hospital.setHospitalId(hospitalId);
        hospital.setHospitalName(hospitalName);
        hospital.setContactNo(contactNo);
        hospital.setHospitalAddress(hospitalAddress);
        hospital.setEmailId(emailId);
        return hospital;

    }
}