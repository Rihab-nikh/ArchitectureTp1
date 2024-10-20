package org.example.customerservice.Dao.Repository;

import org.example.customerservice.Dao.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {


}
