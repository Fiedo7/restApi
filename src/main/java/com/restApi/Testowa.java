package com.restApi;


public class Testowa {
    private String name;
    private Integer wiek;
    private String stan;

    public Testowa(String name, Integer wiek) {
        this.name = name;
        this.wiek = wiek;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWiek() {
        return wiek;
    }

    public void setWiek(Integer wiek) {
        this.wiek = wiek;
    }
}
