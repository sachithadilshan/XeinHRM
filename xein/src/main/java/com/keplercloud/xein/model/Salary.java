package com.keplercloud.xein.model;

import javax.persistence.*;

/**
 * @author MHS DILSHAN
 */
@Entity
@Table(name = "salary")
public class Salary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private double basicSalary;

    private double tax;

    private double insurance;

    private double ot;

    private double allowances;

    private double deduction;

}