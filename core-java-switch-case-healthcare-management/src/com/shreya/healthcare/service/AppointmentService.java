package com.shreya.healthcare.service;

import com.shreya.healthcare.model.Appointment;

import java.util.Scanner;

public class AppointmentService {

    private static final Scanner scanner = new Scanner(System.in);

    public Appointment createAppointment() {

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
}
