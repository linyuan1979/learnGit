package sample.yuan.springRest.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
 /*
@XmlRootElement (name="employees")
@XmlAccessorType(XmlAccessType.FIELD)*/
@JsonIgnoreProperties
public class EmployeeList implements Serializable
{
    private static final long serialVersionUID = 1L;
     
    public List<Employee> employees = new ArrayList<Employee>();
 
    public List<Employee> getEmployees() {
        return employees;
    }
 
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}