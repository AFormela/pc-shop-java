package models;

import javax.persistence.Entity;

@Entity
public class MotherBoard extends Product {

    private int depth;
    private int width;
    private String chipset;
    private String cpuSocket;
    private int cpuSlots;
    private boolean raidController;
    private String memoryStandard;
    private int memorySlots;
    private int maxMemory;

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getCpuSocket() {
        return cpuSocket;
    }

    public void setCpuSocket(String cpuSocket) {
        this.cpuSocket = cpuSocket;
    }

    public int getCpuSlots() {
        return cpuSlots;
    }

    public void setCpuSlots(int cpuSlots) {
        this.cpuSlots = cpuSlots;
    }

    public boolean isRaidController() {
        return raidController;
    }

    public void setRaidController(boolean raidController) {
        this.raidController = raidController;
    }

    public String getMemoryStandard() {
        return memoryStandard;
    }

    public void setMemoryStandard(String memoryStandard) {
        this.memoryStandard = memoryStandard;
    }

    public int getMemorySlots() {
        return memorySlots;
    }

    public void setMemorySlots(int memorySlots) {
        this.memorySlots = memorySlots;
    }

    public int getMaxMemory() {
        return maxMemory;
    }

    public void setMaxMemory(int maxMemory) {
        this.maxMemory = maxMemory;
    }
}
