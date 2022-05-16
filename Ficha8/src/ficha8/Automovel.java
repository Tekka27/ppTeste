/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha8;

//import Enums.*;
import Enums.ConditionEnum;
import Enums.OrigemEnum;
import Interfaces.IAutomovel;

/**
 *
 * @author Diogo
 */
public class Automovel extends Veiculo implements IAutomovel {
    
    private int occupantsNumber;
    private int doorsNumber;

    public Automovel(int occupantsNumber, int doorsNumber, int vin, String brand, String model, String manufacturingDate, OrigemEnum origin, int kms, int price, ConditionEnum condition) {
        super(vin, brand, model, manufacturingDate, origin, kms, price, condition);
        this.occupantsNumber = occupantsNumber;
        this.doorsNumber = doorsNumber;
    }
    
    public Automovel(int occupantsNumber, int vin, String brand, String model, String manufacturingDate, OrigemEnum origin, int kms, int price, ConditionEnum condition) {
        super(vin, brand, model, manufacturingDate, origin, kms, price, condition);
        this.occupantsNumber = occupantsNumber;
        this.doorsNumber = 3;
    }

    public int getOccupantsNumber() {
        return occupantsNumber;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    public void setOccupantsNumber(int occupantsNumber) {
        this.occupantsNumber = occupantsNumber;
    }

    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    @Override
    public double getPrice() {
        if(!(super.getCondition() == ConditionEnum.NEW)) {
            return super.getPrice() * 0.7;
        }
        
        return super.getPrice(); 
    }

    @Override
    public String toString() {
        return "Automovel{" + "occupantsNumber=" + occupantsNumber + ", doorsNumber=" + doorsNumber + '}';
    }
    
    
    
    
    
    
}
