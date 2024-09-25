package com.noob.Employee.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity //it will work with jpa to store data in database
@Data
@Table(name="employees")
public class EmployeeEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private  Long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
