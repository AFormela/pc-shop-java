package models;

import javax.persistence.Entity;

@Entity
public class Cpu extends Product {

    private int cores;
    private int threads;
    private double baseFrequency;
    private double turboFrequency;

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getThreads() {
        return threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }

    public double getBaseFrequency() {
        return baseFrequency;
    }

    public void setBaseFrequency(double baseFrequency) {
        this.baseFrequency = baseFrequency;
    }

    public double getTurboFrequency() {
        return turboFrequency;
    }

    public void setTurboFrequency(double turboFrequency) {
        this.turboFrequency = turboFrequency;
    }

}
