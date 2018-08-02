package com.axwhe.demobackend.repo;
 
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.axwhe.demobackend.model.Customer;
 
public interface CustomerRepository extends CrudRepository<Customer, Long> {
	List<Customer> findByAge(int age);
}