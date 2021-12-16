package com.example.Ejercicio3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Ejercicio3.repository.CustomerRepositoryImpl;
import com.example.Ejercicio3.services.CustomerServiceI;


@SpringBootApplication
public class Application implements CommandLineRunner {

	
	@Autowired
	private CustomerServiceI customerService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {




		final CustomerRepositoryImpl customer1 = new CustomerRepositoryImpl();
		
		
		customer1.setName("Raul");
		customer1.setSurName1("Sanchez");
		customer1.setSurName2("Redondo");
		customer1.setDni("12345678A");
		customerService.insertNewCustomer(customer1);

		final CustomerRepositoryImpl customer2 = new CustomerRepositoryImpl();
		customer2.setName("Alvaro");
		customer2.setSurName1("Martinez");
		customer2.setSurName2("Eustaquio");
		customer2.setDni("12345678B");
		customerService.insertNewCustomer(customer2);

		final CustomerRepositoryImpl customer3 = new CustomerRepositoryImpl();
		customer3.setName("Estefania");
		customer3.setSurName1("Rodriguez");
		customer3.setSurName2("Moñiz");
		customer3.setDni("12345678C");
		customerService.insertNewCustomer(customer3);

		System.out.println("estos son todos los clientes");

		customerService.searchAllCustomers();
		
		

		
		System.out.println("Estos son los clientes que tienen de nombre Raul");

		customerService.searchByName("Raul");


		System.out.println("Estos son los clientes que tienen de nombre y apellidos Raul Sanchez Redondo");

		customerService.searchByFullName("Raul", "Sanchez", "Redondo");


		

	}

}
