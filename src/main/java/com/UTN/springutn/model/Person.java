package com.UTN.springutn.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

public class Person
{
    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private String lastname;

}
