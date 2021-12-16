package com.example.Ejercicio3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepositoryI extends JpaRepository<CustomerRepositoryImpl, Long> {


	public List<CustomerRepositoryImpl> findByName(final String name);


	public List<CustomerRepositoryImpl> findByNameAndSurName1AndSurName2(final String name, final String surname1, final String surname2);

}
