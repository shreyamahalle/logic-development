package com.shreya.healthcare;
import com.shreya.healthcare.model.*;
import com.shreya.healthcare.service.AddressService;
import com.shreya.healthcare.service.PatientService;

import java.util.Scanner;

public class HealthCare {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HealthCare healthCare = new HealthCare();
        AddressService addressService = new AddressService();
        PatientService patientService = new PatientService();

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
            switch (option) {
                case 1:
                    Patient patient = patientService.createPatient();
                    System.out.println("Patient Created: " + patient);
                    break;
                case 2:
                    Department department = healthCare.createDepartment();
                    System.out.println("Department Created: " + department);
                    break;
                case 3:
                    Doctor doctor = healthCare.createDoctor();
                    System.out.println("Doctor Created: " + doctor);
                    break;
                case 4:
                    Appointment appointment = healthCare.createAppointment();
                    System.out.println("Appointment Created: " + appointment);
                    break;
                case 5:
                    Nurse nurse = healthCare.createNurse();
                    System.out.println("Nurse Created: " + nurse);
                    break;
                case 6:
                    Hospital hospital = healthCare.createHospital();
                    System.out.println("Hospital Created: " + hospital);
                    break;
                case 7:
                    Billing billing = healthCare.createBilling();
                    System.out.println("Billing Created: " + billing);
                    break;
                case 8:
                    Address address = addressService.createAddress();
                    System.out.println("Address Created: " + address);
                    break;
                case 9:
                    Prescription prescription = healthCare.createPrescription();
                    System.out.println("Prescription Created: " + prescription);
                    break;
                case 10:
                    System.out.println("Exiting Health-Care Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please enter a number between 1 and 10.");
            }

        } while (option != 0);
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

    private Billing createBilling() {
        System.out.println("Enter Billing Id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter pId");
        int pId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter totalTax");
        int totalTax = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter totalBill");
        int totalBill = Integer.parseInt(scanner.nextLine());

        Billing billing = new Billing();
        billing.setId(id);
        billing.setpId(pId);
        billing.setTotalBill(totalBill);
        billing.setTotalTax(totalTax);
        return billing;
    }

    private Prescription createPrescription() {
        System.out.println("Enter prescriptionId");
        int prescriptionId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter prescriptionDetails");
        String prescriptionDetails = scanner.nextLine();
        System.out.println("Enter mobileNo");
        String mobileNo = scanner.nextLine();
        Prescription prescription = new Prescription();
        prescription.setPrescriptionId(prescriptionId);
        prescription.setPrescriptionDetails(prescriptionDetails);
        prescription.setMobileNo(mobileNo);
        return prescription;
    }
}
