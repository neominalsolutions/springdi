package com.akbank.springdi;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.akbank.springdi.models.Employee;
import com.akbank.springdi.models.Person;
import com.akbank.springdi.models.User;
import com.akbank.springdi.services.TextLogManager;

@SpringBootApplication
public class SpringdiApplication {

	public static void main(String[] args) {
		// SpringApplication.run(SpringdiApplication.class, args);

		var context1 = new ClassPathXmlApplicationContext("spring.xml");
		// applicationContext üzerinden person class instance getir.
		// name kısmı bean ismi
		// requiredType bean target type
		var person = context1.getBean("person1", Person.class);

		person.setName("person1");
		System.out.println(person.getName());

		var person2 = context1.getBean("person2", Person.class);

		System.out.println(person2.getName());

		// bean tanımlarını okuyacağı sınıfın classPath gösterdik.
		var context2 = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		var user = context2.getBean("user1", User.class);
		user.setName("annotationConfig");

		System.out.println(user.person.getName());

		// Bean yöntemi ile bir sınıf başka bir sınıfa dependecy aktarabiliyor.

		// streotype da bir anotation config yöntemidir. en çok kulanılan otomatik bean
		// tanımı bu yöntemdir.

		// bean name verilmediği için ikinci farklı bir id tanımına göre instance
		// alamıyoruz. sadece class path gösterilen nesne spring ioc sürecine dahil
		// oluyor.
		var emp = context2.getBean(Employee.class);
		System.out.println(emp.getName());

		// Logger @AutoWired Dependecy Injection Kullanımı

		// beans üzerinden application contexten ilgili servisin intance üretip
		// @autowired ile yönlendirmeyi sağladık.
		var loggerManager = context2.getBean(TextLogManager.class);
		loggerManager.Log();

	}

}
