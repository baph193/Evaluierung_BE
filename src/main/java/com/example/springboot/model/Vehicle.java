package com.example.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@Table(name = "vehicle")
public class Vehicle {

    @Id
    @Column(name="vin")
    private String vin;
    @Column(name="datEuropaCode")
    private String datEuropaCode;
    @Column(name="vehicleType")
    private String vehicleType;
    @Column(name="created")
    private String created;
    @Column(name="mileage")
    private String mileage;
    @Column(name="gearbox")
    private String gearbox;
    @Column(name="owner")
    private int owner;
    @Column(name="kwAndPs")
    private String kwAndPs;
    @Column(name="hek")
    private double hek;
    @Column(name="taxation")
    private String taxation;
    @Column(name="fuel")
    private String fuel;
    @Column(name="color")
    private String color;


    public Vehicle() {}


    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getDatEuropaCode() {
        return datEuropaCode;
    }

    public void setDatEuropaCode(String datEuropaCode) {
        this.datEuropaCode = datEuropaCode;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    public String getKwAndPs() {
        return kwAndPs;
    }

    public void setKwAndPs(String kwAndPs) {
        this.kwAndPs = kwAndPs;
    }

    public double getHek() {
        return hek;
    }

    public void setHek(double hek) {
        this.hek = hek;
    }

    public String getTaxation() {
        return taxation;
    }

    public void setTaxation(String taxation) {
        this.taxation = taxation;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return  "Vehicle: vin=" + vin + " datEuropaCode=" + datEuropaCode + " vehicleType=" + vehicleType +
                " created=" + created + " mileage=" + mileage + " gearbox=" + gearbox + " owner=" + owner +
                " kwAndPs=" + kwAndPs + " hek=" + hek + " taxation=" + taxation + " fuel=" + fuel + " color=" + color;
    }
}


