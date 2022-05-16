/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha8;

import Enums.*;
import Interfaces.*;
/**
 *
 * @author Diogo
 */
public abstract class Veiculo implements IVeiculo{
    
    private static int count;
    private int id;
    private int vin;
    private String brand;
    private String model;
    private String manufacturingDate;
    private OrigemEnum origin;
    private int kms;
    private double price;
    private ConditionEnum condition;

    public Veiculo(int vin, String brand, String model, String manufacturingDate, OrigemEnum origin, int kms, double price, ConditionEnum condition) {
        this.id = ++count;
        this.vin = vin;
        this.brand = brand;
        this.model = model;
        this.manufacturingDate = manufacturingDate;
        this.origin = origin;
        this.kms = kms;
        this.price = price;
        this.condition = condition;
    }


    public int getId() {
        return id;
    }

    public int getVin() {
        return vin;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(String manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public OrigemEnum getOrigin() {
        return origin;
    }

    public void setOrigin(OrigemEnum origin) {
        this.origin = origin;
    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ConditionEnum getCondition() {
        return condition;
    }

    public void setCondition(ConditionEnum condition) {
        this.condition = condition;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Veiculo other = (Veiculo) obj;
        return this.vin == other.vin;
    }
    

    @Override
    public String toString() {
        return "Veiculo{" + "id=" + id + ", vin=" + vin + ", brand=" + brand + ", model=" + model + ", manufacturingDate=" + manufacturingDate + ", origin=" + origin + ", kms=" + kms + ", price=" + price + ", condition=" + condition + '}';
    }
    
    
    
    
    
}
