package com.abdus.lombok.example.domain;

public class Run {
  public static void main(String[] args) {
    Employee employee = Employee.builder().build();
    employee.setAddress("India");
    employee.setDept("CSA");
    employee.setEmpId("123");
//And so on.

    System.out.println(employee.getAddress());
    // similarly for others



  }
}
