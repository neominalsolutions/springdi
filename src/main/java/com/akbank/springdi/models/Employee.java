package com.akbank.springdi.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// stereotype olarak işaretlenen sınıflar otomatik olarak spring ioc sürecine girer. 
@Component
@Scope("prototype")
public class Employee {

  private String name = "employee1";
  private String surname;

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

}
