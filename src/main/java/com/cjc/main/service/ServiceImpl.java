package com.cjc.main.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Employee;
import com.cjc.main.repository.HomeRepository;

@Service
public class ServiceImpl implements ServiceI {
@Autowired
HomeRepository hr;
	@Override
	public Employee getdata(int id) {
		Employee e2=hr.findById(id);
		return e2;
	}

	@Override
	public void updatedata(Employee employee) {
		hr.save(employee);
		
	}

	@Override
	public void deletedata(int id) {
		hr.deleteById(id);
		
	}

	@Override
	public Employee savedata(Employee employee) {
		Employee e1=hr.save(employee);
		return e1;
	}

}
