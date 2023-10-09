package com.akbank.springdi.models;

import org.springframework.stereotype.Component;

// @Service, @Repository, @Controller gibi anatasyonların base'i @Component anatasyonunda gelir.
// @Component
public class User {

  private String name;
  private Integer age;
  public Person person;

  public User() {
    super();
  }

  public User(Person person) { // Dependency Inject With Bean
    super();
    this.person = person;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
