package models;

import javax.persistence.Entity;

@Entity
public class HardDrive extends Product {

    private double format;
    private String type;
    private int capacity;

    public double getFormat() {
        return format;
    }

    public void setFormat(double format) {
        this.format = format;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
