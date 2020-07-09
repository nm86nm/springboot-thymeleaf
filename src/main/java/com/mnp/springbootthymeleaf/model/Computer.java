package com.mnp.springbootthymeleaf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Computer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String processor;
    private String ram;
    private String motherboard;
    private String graphicscard;
    private String disk;
    private String powersupply;
    private String coolingcpu;
    private String computercase;
    private float price;

    public Computer() {
    }

    public Computer(String processor, String ram, String motherboard, String graphicscard, String disk, String powersupply, String coolingcpu, String computercase, float price) {
        this.processor = processor;
        this.ram = ram;
        this.motherboard = motherboard;
        this.graphicscard = graphicscard;
        this.disk = disk;
        this.powersupply = powersupply;
        this.coolingcpu = coolingcpu;
        this.computercase = computercase;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getGraphicscard() {
        return graphicscard;
    }

    public void setGraphicscard(String graphicscard) {
        this.graphicscard = graphicscard;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getPowersupply() {
        return powersupply;
    }

    public void setPowersupply(String powersupply) {
        this.powersupply = powersupply;
    }

    public String getCoolingcpu() {
        return coolingcpu;
    }

    public void setCoolingcpu(String coolingcpu) {
        this.coolingcpu = coolingcpu;
    }

    public String getComputercase() {
        return computercase;
    }

    public void setComputercase(String computercase) {
        this.computercase = computercase;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", motherboard='" + motherboard + '\'' +
                ", graphicscard='" + graphicscard + '\'' +
                ", disk='" + disk + '\'' +
                ", powersupply='" + powersupply + '\'' +
                ", coolingcpu='" + coolingcpu + '\'' +
                ", computercase='" + computercase + '\'' +
                ", price=" + price +
                '}';
    }
}
