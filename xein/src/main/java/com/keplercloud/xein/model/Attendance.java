package com.keplercloud.xein.model;

import javax.persistence.*;

/**
 * @author MHS DILSHAN
 */
@Entity
@Table(name = "Attendance")
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private long timeIn;

    private long timeOut;

    private String remarks;



}