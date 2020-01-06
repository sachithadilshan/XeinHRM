package com.keplercloud.xein.model;

import javax.persistence.*;

/**
 * @author MHS DILSHAN
 */
@Entity
@Table(name = "Company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
}