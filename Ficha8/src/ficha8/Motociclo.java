/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha8;

import Enums.ConditionEnum;
import Enums.OrigemEnum;
import Interfaces.IMotociclo;

/**
 *
 * @author Diogo
 */
public class Motociclo extends Veiculo implements IMotociclo{
    
    private int cubicCapacity;
    private int wheelSize;

    public Motociclo(int cubicCapacity, int wheelSize, int vin, String brand, String model, String manufacturingDate, OrigemEnum origin, int kms, double price, ConditionEnum condition) {
        super(vin, brand, model, manufacturingDate, origin, kms, price, condition);
        this.cubicCapacity = cubicCapacity;
        this.wheelSize = wheelSize;
    }

    public int getCubicCapacity() {
        return cubicCapacity;
    }

    public void setCubicCapacity(int cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    @Override
    public String toString() {
        return "Motociclo{" + "csubicCapacity=" + cubicCapacity + ", wheelSize=" + wheelSize + '}';
    }
    
    
    
}
