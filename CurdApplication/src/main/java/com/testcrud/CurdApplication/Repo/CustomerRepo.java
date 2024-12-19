package com.testcrud.CurdApplication.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testcrud.CurdApplication.Entity.Customer;



public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
