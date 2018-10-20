package org.pursuit;

public class Carr {
    private String model;
    private String year;
    private int mileage;

    Carr() {

    }

    public Carr(String model, String year, int mileage) {//constructor , instanrtiaate bf calling
        this.model = model;
        this.year = year;
        this.mileage = mileage;

    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }
}