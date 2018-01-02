package sample.yuan.springRest.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/*
@XmlRootElement (name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)*/
@JsonIgnoreProperties
public class Employee implements Serializable{
	private static final long serialVersionUID = 1L;
	 
    //@XmlAttribute
    public Integer id;
     
    //@XmlElement
    public String firstName;
     
    //@XmlElement
    public String lastName;
     
    //@XmlElement
    public String email;
     
    public Employee(Integer id, String firstName, String lastName, String email) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
     
    public Employee(){
         
    }
 
    //Setters and Getters
 
    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName
                + ", lastName=" + lastName + ", email=" + email + "]";
    }
}
