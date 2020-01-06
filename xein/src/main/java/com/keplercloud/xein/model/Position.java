package com.keplercloud.xein.model;

import javax.persistence.*;

/**
 * @author MHS DILSHAN
 */
@Entity
@Table(name = "position")
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "position")
    private String position;

    @Column(name = "salary_scale")
    private String salaryScale;

    @Column(name = "basic_salary")
    private double basicSalary;

    @Column(name = "ot_ph")
    private double otPh;

    public Position() {
    }

    public Position(String position, String salaryScale, double basicSalary, double otPh) {
        this.position = position;
        this.salaryScale = salaryScale;
        this.basicSalary = basicSalary;
        this.otPh = otPh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalaryScale() {
        return salaryScale;
    }

    public void setSalaryScale(String salaryScale) {
        this.salaryScale = salaryScale;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getOtPh() {
        return otPh;
    }

    public void setOtPh(double otPh) {
        this.otPh = otPh;
    }
}