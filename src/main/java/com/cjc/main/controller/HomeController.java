package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Employee;
import com.cjc.main.service.ServiceI;
@CrossOrigin("*")
@RestController
public class HomeController {
	@Autowired
	ServiceI si;
@PostMapping("/savedata")
public Employee savedata(@RequestBody Employee employee)
{
	Employee e1=si.savedata(employee);
	return e1;
}	
@GetMapping("/getdata/{id}")	
public Employee getdata(@PathVariable int id)
{
Employee e2=si.getdata(id);
return e2;
}
@PutMapping("/updatedata")
public String updatedata(@RequestBody Employee employee)
{
	si.updatedata(employee);
	return "data updated";
}
@DeleteMapping("/deletedata/{id}")
public void deletedata(@PathVariable int id)
{
	si.deletedata(id);
}



}
 