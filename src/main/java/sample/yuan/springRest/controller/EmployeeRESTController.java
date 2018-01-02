package sample.yuan.springRest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sample.yuan.springRest.model.Employee;
import sample.yuan.springRest.model.EmployeeList;

@RestController
public class EmployeeRESTController {
	@RequestMapping(value = "/employees",method = RequestMethod.GET, produces = "application/json")
    public EmployeeList getAllEmployees()
    {
        EmployeeList employees = new EmployeeList();
         
        Employee empOne = new Employee(1,"firstName","lastName","test@gmail.com");
        Employee empThree = new Employee(3,"Ole","Nordmann","olenordmann@gmail.com");
         
         
        employees.getEmployees().add(empOne);
        employees.getEmployees().add(empTwo);
        employees.getEmployees().add(empThree);
         
        return employees;
    }


}
