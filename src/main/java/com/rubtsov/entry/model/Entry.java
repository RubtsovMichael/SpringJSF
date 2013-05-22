package com.rubtsov.entry.model;

import java.io.Serializable;

public class Entry implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 9113347041904497607L;

    private int id;
    
    private String name;

    public Entry(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return getName();
    }
    
}
