package com.example.valeriybilyk.realmtest;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Dog extends RealmObject {
    @PrimaryKey
    private String id;
    private String name;
    private String color;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
