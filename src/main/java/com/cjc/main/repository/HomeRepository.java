package com.cjc.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Employee;

@Repository
public interface HomeRepository extends CrudRepository<Employee ,Integer>{

	Employee findById(int id);



	

	

}
