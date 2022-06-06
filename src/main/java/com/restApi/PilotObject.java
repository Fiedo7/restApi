package com.restApi;

import javax.persistence.*;

@Entity

public class PilotObject {
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String model;

    public PilotObject() {
    }

    public PilotObject(Long id, String model) {
        this.id = id;
        this.model = model;
    }

    public PilotObject(String model) {
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    @Override
    public String toString() {
        return "PilotObject{" +
                "id=" + id +
                ", model=" + model +
                '}';
    }
}
