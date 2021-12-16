package com.example.Ejercicio3.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.example.Ejercicio3.repository.CustomerRepositoryImpl;
import com.example.Ejercicio3.repository.CustomerRepositoryI;

@Service
public class CustomerServiceImpl implements CustomerServiceI {


	@Autowired
	private CustomerRepositoryI customerRepository;

	@Override
	public CustomerRepositoryImpl insertNewCustomer(CustomerRepositoryImpl newCustomer) {


		if (newCustomer != null && newCustomer.getId() == null) {


			newCustomer = customerRepository.save(newCustomer);
		}

		return newCustomer;
	}

	@Override
	public void searchAllCustomers() {


		final Iterable<CustomerRepositoryImpl> customerList = customerRepository.findAll();


		customerList.forEach((final CustomerRepositoryImpl customer) -> System.out.println(customer.toString()));
	}

	@Override
	public void searchByFullName(final String name, final String surname1, final String surname2) {


		final List<CustomerRepositoryImpl> searchClients = customerRepository.findByNameAndSurName1AndSurName2(name, surname1, surname2);


		printCustomers(searchClients);
	}

	@Override
	public void searchByName(final String name) {

		// Obtención del listado de clientes por nombre.
		final List<CustomerRepositoryImpl> searchCustomers = customerRepository.findByName(name);

		// Muestra el listado obtenido.
		printCustomers(searchCustomers);
	}


	private void printCustomers(final List<CustomerRepositoryImpl> searchCustomers) {
		if (!CollectionUtils.isEmpty(searchCustomers)) {
			for (CustomerRepositoryImpl customer : searchCustomers) {
				System.out.println(customer.toString());
			}
		}
	}

}
