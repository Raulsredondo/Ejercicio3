package com.example.Ejercicio3.services;

import com.example.Ejercicio3.repository.CustomerRepositoryImpl;

public interface CustomerServiceI {

	public CustomerRepositoryImpl insertNewCustomer(final CustomerRepositoryImpl newCustomer);

	/**
	 * Consulta todos los clientes.
	 */
	public void searchAllCustomers();

	/**
	 * Búsqueda por nombre completo.
	 * 
	 * @param name
	 * @param surname1
	 * @param surname2
	 */
	public void searchByFullName(final String name, final String surname1, final String surname2);

	/**
	 * Búsqueda por nombre.
	 * 
	 * @param name
	 */
	public void searchByName(final String name);

}
