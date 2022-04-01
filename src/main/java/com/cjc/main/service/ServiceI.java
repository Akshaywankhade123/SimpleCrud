package com.cjc.main.service;

import com.cjc.main.model.Employee;

public interface ServiceI {

	Employee getdata(int id);

	void updatedata(Employee employee);

	void deletedata(int id);

	Employee savedata(Employee employee);

}
