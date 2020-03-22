package com.abdus.lombok.example.domain;

import lombok.*;

import java.io.Serializable;
@Getter
@Setter(AccessLevel.PUBLIC)
@AllArgsConstructor
@Builder
public class Employee  {

  String firstName;
  String lastName;
  String dept;
  String emailId;
  String empId;
  String address;




}
