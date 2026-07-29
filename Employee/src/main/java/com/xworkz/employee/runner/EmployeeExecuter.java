package com.xworkz.employee.runner;

import com.xworkz.employee.dto.EmployeeDto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeExecuter {

    public static void main(String[] args) {

        List<EmployeeDto> employees = new ArrayList<>();

        employees.add(new EmployeeDto(101, "Abhi", 22, 35000, "IT", "Male"));
        employees.add(new EmployeeDto(102, "Priya", 24, 42000, "HR", "Female"));
        employees.add(new EmployeeDto(103, "Rahul", 28, 55000, "Finance", "Male"));
        employees.add(new EmployeeDto(104, "Sneha", 26, 48000, "IT", "Female"));
        employees.add(new EmployeeDto(105, "Kiran", 30, 60000, "Sales", "Male"));
        employees.add(new EmployeeDto(106, "Anjali", 27, 52000, "HR", "Female"));
        employees.add(new EmployeeDto(110, "Meena", 35, 45000, "Sales", "Female"));
        employees.add(new EmployeeDto(107, "Ravi", 35, 75000, "Finance", "Male"));
        employees.add(new EmployeeDto(108, "Pooja", 29, 68000, "Marketing", "Female"));
        employees.add(new EmployeeDto(109, "Vijay", 31, 72000, "IT", "Male"));

        System.out.println("----------------------------------");
        System.out.println("Employees based on their department");
        System.out.println("--------------------------------");
        employees.stream().collect(Collectors.groupingBy(
                e->e.getDepartment()
        )).forEach((d1,d2)->{
            System.out.println(d1+": ");
            d2.forEach(d-> System.out.println(d));
        });
        System.out.println("----------------------------------");
        System.out.println("Employees based on their Gender");
        System.out.println("----------------------------------");
        employees.stream().collect(Collectors.groupingBy(e->e.getGender())).forEach((e1,e2)->{
            System.out.println(e1+": ");
            e2.forEach(e-> System.out.println(e));
        });

        System.out.println("----------------------------------");
        System.out.println("Employees with age greater than 40");
        System.out.println("----------------------------------");
        List<EmployeeDto> em=employees.stream().filter(e->e.getAge()>30).collect(Collectors.toList());
        for(EmployeeDto e:em){
            System.out.println(e);
        }

        System.out.println("----------------------------------");
        System.out.println("Employees grouped on Age");
        System.out.println("----------------------------------");
        employees.stream().collect(Collectors.groupingBy(e->e.getAge())).forEach((e1,e2)-> System.out.println(e1+": "+e2));

        System.out.println("----------------------------------");
        System.out.println("Count of employees in Organization based on Gender");
        System.out.println("----------------------------------");
        employees.stream().collect(Collectors.groupingBy(e->e.getGender())).forEach((e1,e2)-> System.out.println(e1+": "+e2.size()));

        System.out.println("-------------------------------");
        System.out.println("Count of male and female present in each department");
        System.out.println("-------------------------------");
        employees.stream().collect(Collectors.groupingBy(e->e.getDepartment())).forEach((e1,e2)->{
            System.out.println("In "+e1);
            e2.stream().collect(Collectors.groupingBy(e->e.getGender())).forEach((g1,g2)-> System.out.println(g1+": "+g2.size()));
        });
        System.out.println("------------------------------------");
        System.out.println("Number of employees in each department");
        System.out.println("-------------------------------------");
        employees.stream().collect(Collectors.groupingBy(e->e.getDepartment())).forEach((e1,e2)-> System.out.println(e1+": "+e2.size()));

        System.out.println("--------------------------------");
        System.out.println("Elder Employee using sorted");
        EmployeeDto elderOne= employees.stream().sorted((o1,o2)->o2.getAge()-o1.getAge()).findFirst().get();
        System.out.println(elderOne);
        System.out.println("----------------------------------");
        System.out.println("Younger Employee using stream max");
        EmployeeDto elder=employees.stream().min((o1,o2) -> o1.getAge()-o2.getAge()).get();
        System.out.println(elder);
        System.out.println("----------------------------------");
        System.out.println("Elder Employee using Collect max");
        elder=  employees.stream().collect(Collectors.maxBy((o1,o2)->o1.getAge()-o2.getAge())).get();
        System.out.println(elder);
         }
    }
