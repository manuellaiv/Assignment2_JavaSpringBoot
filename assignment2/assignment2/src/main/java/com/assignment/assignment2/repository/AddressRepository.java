package com.assignment.assignment2.repository;

import com.assignment.assignment2.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
