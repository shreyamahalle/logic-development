package com.shreya.healthcare;
import com.shreya.healthcare.model.*;
import com.shreya.healthcare.service.*;

import java.util.Scanner;

public class HealthCare {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        AddressService addressService = new AddressService();
        PatientService patientService = new PatientService();
        DepartmentService departmentService = new DepartmentService();
        DoctorService doctorService = new DoctorService();
        AppointmentService appointmentService = new AppointmentService();
        NurseService nurseService = new NurseService();
        HospitalService hospitalService = new HospitalService();
        BillingService billingService = new BillingService();
        PrescriptionService prescriptionService = new PrescriptionService();

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
                    Department department = departmentService.createDepartment();
                    System.out.println("Department Created: " + department);
                    break;
                case 3:
                    Doctor doctor = doctorService.createDoctor();
                    System.out.println("Doctor Created: " + doctor);
                    break;
                case 4:
                    Appointment appointment = appointmentService.createAppointment();
                    System.out.println("Appointment Created: " + appointment);
                    break;
                case 5:
                    Nurse nurse = nurseService.createNurse();
                    System.out.println("Nurse Created: " + nurse);
                    break;
                case 6:
                    Hospital hospital = hospitalService.createHospital();
                    System.out.println("Hospital Created: " + hospital);
                    break;
                case 7:
                    Billing billing = billingService.createBilling();
                    System.out.println("Billing Created: " + billing);
                    break;
                case 8:
                    Address address = addressService.createAddress();
                    System.out.println("Address Created: " + address);
                    break;
                case 9:
                    Prescription prescription = prescriptionService.createPrescription();
                    System.out.println("Prescription Created: " + prescription);
                    break;
                case 10:
                    System.out.println("Exiting Health-Care Management System. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please enter a number between 1 and 10.");
            }

        } while (option != 0);
    }
}
