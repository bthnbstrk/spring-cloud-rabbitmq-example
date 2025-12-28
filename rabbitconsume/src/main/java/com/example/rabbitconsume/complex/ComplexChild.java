package com.example.rabbitconsume.complex;

import java.io.Serializable;

public class ComplexChild implements Serializable {

    private long id;
    private String name;
    private double value;


    public ComplexChild(long id, String name, double value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public ComplexChild() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
