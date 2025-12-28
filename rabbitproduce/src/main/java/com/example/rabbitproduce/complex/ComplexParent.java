package com.example.rabbitproduce.complex;

import java.io.Serializable;

public class ComplexParent implements Serializable {
    private long id;
    private String name;

    private ComplexChild complexChild;

    public ComplexParent(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public ComplexParent() {
    }

    public ComplexChild getComplexChild() {
        return complexChild;
    }

    public void setComplexChild(ComplexChild complexChild) {
        this.complexChild = complexChild;
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
}
