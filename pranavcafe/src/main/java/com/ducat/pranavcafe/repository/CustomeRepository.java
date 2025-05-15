package com.ducat.pranavcafe.repository;

import com.ducat.pranavcafe.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomeRepository extends JpaRepository <Customer,Long>{
}
