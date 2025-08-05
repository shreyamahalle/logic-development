package com.shreya.timesheet.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

    private Long id;
    private String name;
    private String email;
    private String department;
    private String designation;
    private LocalDate joiningDate;
    private boolean active = true;
}
