package com.akbank.springdi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.akbank.springdi.models.Person;
import com.akbank.springdi.models.User;

// Uygulama içindeki sınıflarını anotasyonlar ile ApplicationContext register olması için kullandığımız class configuration yapılarıdır.
@Configuration
@ComponentScan(basePackages = "com.akbank.springdi")
public class ApplicationConfig {

  @Bean
  // @Scope(value = WebApplicationContext) // default singleton
  Person person() {
    var p = new Person();
    p.setName("withDependecy");
    return p;
  }

  // Not Bean name ile bir id tanımı yapmaz isek budurmda user method ismini bean
  // ismi yapar.
  @Bean(name = "user1")
  User user() {
    return new User(person());
  }

  @Bean(name = "user2")
  User user1() {
    return new User();
  }
}
