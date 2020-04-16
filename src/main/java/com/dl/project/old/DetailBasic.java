package com.dl.project.old;

import java.util.ArrayList;
import java.util.UUID;

public class DetailBasic {
    private UUID id;
    private String name;
    private ArrayList<String> values;

    public DetailBasic(UUID id, String name, ArrayList<String> values) {
        this.id = id;
        this.name = name;
        this.values = values;
    }

    public void show() {
        System.out.println("=====Detail values====");
        if(id!=null)
            System.out.println(this.id+
                this.name +
                this.values);
        else
            System.out.println("Detail not set");
        System.out.println("=====Detail values====");
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getValues() {
        return values;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValues(ArrayList<String> values) {
        this.values = values;
    }
}
