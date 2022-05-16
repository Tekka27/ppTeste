/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha8;

import Enums.ConditionEnum;
import Enums.OrigemEnum;
import Enums.TruckType;
/**
 *
 * @author Diogo
 */
public class Pesado extends Veiculo{
    
    private int length;
    private int load;
    private TruckType truckType;
    private Trailer trailer;

    public Pesado(int length, int load, TruckType truckType, int vin, String brand, String model, String manufacturingDate, OrigemEnum origin, int kms, double price, ConditionEnum condition) {
        super(vin, brand, model, manufacturingDate, origin, kms, price, condition);
        this.length = length;
        this.load = load;
        this.truckType = truckType;
        this.trailer = null;
    }
    
    public Pesado(int length, int load, TruckType truckType, Trailer trailer, int vin, String brand, String model, String manufacturingDate, OrigemEnum origin, int kms, double price, ConditionEnum condition) {
        super(vin, brand, model, manufacturingDate, origin, kms, price, condition);
        this.length = length;
        this.load = load;
        this.truckType = truckType;
        this.trailer = trailer;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public TruckType getTruckType() {
        return truckType;
    }

    public void setTruckType(TruckType truckType) {
        this.truckType = truckType;
    }

    public Trailer getTrailer() {
        return trailer;
    }

    public void setTrailer(Trailer trailer) {
        this.trailer = trailer;
    }
    

    @Override
    public String toString() {
        return "Pesado{" + "length=" + length + ", load=" + load + ", truckType=" + truckType + ", trailer=" + trailer + '}';
    }

    @Override
    public double getPrice() {
        
        if(this.trailer != null && super.getCondition() == ConditionEnum.NEW){
            return super.getPrice() * 0.95;
            
        }else if(this.trailer == null && super.getCondition() == ConditionEnum.NEW){
            return super.getPrice();
        }else{
            return super.getPrice() * 0.85;
        }
    }
    
    
    
    
}
