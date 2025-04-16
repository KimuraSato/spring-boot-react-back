package com.kimura.spring_boot_react.repository;

import com.kimura.spring_boot_react.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("customerRepository")
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
