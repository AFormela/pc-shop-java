package models;

import javax.persistence.Entity;

@Entity
public class Gpu extends Product {

    private String producer;
    private int dataBus;
    private String ramType;
    private int ramCapacity;

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getDataBus() {
        return dataBus;
    }

    public void setDataBus(int dataBus) {
        this.dataBus = dataBus;
    }

    public String getRamType() {
        return ramType;
    }

    public void setRamType(String ramType) {
        this.ramType = ramType;
    }

    public int getRamCapacity() {
        return ramCapacity;
    }

    public void setRamCapacity(int ramCapacity) {
        this.ramCapacity = ramCapacity;
    }
}
