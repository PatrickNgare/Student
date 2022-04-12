package com.patrick.data.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@AllArgsConstructor
@Setter
@Entity(name = "student")
@Table(name = "student",
uniqueConstraints = {
        @UniqueConstraint(name= "student_email_unique", columnNames = "email")
})


public class Student {

    public Student(String firstName, String lastName, String email, Integer age) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }
  @Id
  @SequenceGenerator(name = "student_sequence",sequenceName ="student_sequence ",allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "student_sequence")
   @Column(name = "id",updatable = false)
    private long id;
    @Column(name = "first_name",nullable = false,columnDefinition = "TEXT")
    private  String firstName;
    @Column(name = "last_name",nullable = false,columnDefinition = "TEXT")
    private String lastName;
    @Column(name = "fast_name",nullable = false,columnDefinition = "TEXT" ,unique = true)
    private String email;
    @Column(name = "age",nullable = false)
    private Integer age;

    public Student() {

    }
}


