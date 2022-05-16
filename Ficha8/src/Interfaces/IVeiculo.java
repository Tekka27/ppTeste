/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Enums.*;

/**
 *
 * @author Diogo
 */
public interface IVeiculo {
    
    int getId();
    int getVin();
    String getBrand();
    void setBrand(String brand);
    String getModel();
    void setModel(String model);
    String getManufacturingDate();
    void setManufacturingDate(String manufacturingDate);
    OrigemEnum getOrigin();
    void setOrigin(OrigemEnum origin);
    int getKms();
    void setKms(int kms);
    double getPrice();
    void setPrice(double price);
    ConditionEnum getCondition();
    void setCondition(ConditionEnum condition);
    
}
