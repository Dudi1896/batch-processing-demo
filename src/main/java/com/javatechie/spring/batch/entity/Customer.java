package com.javatechie.spring.batch.entity;
/**jakarta.persistence.Entity --> Jakarta Persistence API
 *  Entity class == representation of a database table that can be persisted and managed using JPA.
 *  @Entity ==> this class represents an entity that can be stored and retrieved from a database.
 *  @Table ==> specify the database table name
 *  @Id ==> specify the primary key column. **/

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CUSTOMERS_INFO")
public class Customer {

    @Id
    @Column(name= "CUSTOMER_ID")
    private int id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "CONTACT")
    private String contactNo;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "DOB")
    private String dob;
}
