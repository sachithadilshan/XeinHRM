package com.keplercloud.xein.model;

import javax.persistence.*;

/**
 * @author MHS DILSHAN
 */
@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String departmentName;

}