package com.xworkz.employee.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class EmployeeDto {

    private int employeeId;
    private String name;
    private int age;
    private double salary;
    private String department;
    private String gender;
}
