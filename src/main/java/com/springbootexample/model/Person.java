package com.springbootexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "person")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="myapp.person_person_id_seq")
    @SequenceGenerator(name="myapp.person_person_id_seq", sequenceName="myapp.person_person_id_seq", allocationSize=1)
    @Column(name = "person_id")
    private Long id;
	
    private String name;
    
    @Column(name = "pcity")
    private String city;
 
    public Person() {
        super();
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getCity() {
        return city;
    }
 
    public void setCity(String city) {
        this.city = city;
    }
 
    @Override
    public String toString() {
        return "Person [pid=" + id + ", pName=" + name + ", pCity=" + city
                + "]";
    }
}
