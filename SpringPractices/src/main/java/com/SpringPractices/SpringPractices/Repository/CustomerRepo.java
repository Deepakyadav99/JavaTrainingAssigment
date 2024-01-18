package com.SpringPractices.SpringPractices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringPractices.SpringPractices.pojo.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
