/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha8;
import Enums.*;

/**
 *
 * @author Diogo
 */
public class VehicleDemo {
    public static void main(String[] args) {
        
        //Lista de Veiculos
        Veiculo veiculo1 = new Automovel(4, 4, 2131231, "mercedes", "picas", "11-05-2000", OrigemEnum.NATIONAL, 43, 47, ConditionEnum.NEW);
        Veiculo veiculo2 = new Pesado(100, 3000, TruckType.TRUCK, 543543, "renaut", "fdp", "11-05-2000", OrigemEnum.NATIONAL, 23, 4, ConditionEnum.NEW);

        
        //Lista de Trailers
        Trailer trailer1 = new Reboque(TrailerType.TIPPER, 900);
        Trailer trailer2 = new SemiReboque(700, 2);
        
        
        VehicleManagement management = new VehicleManagement();
        
        management.addVeiculo(veiculo1);
        management.addVeiculo(veiculo1);
        management.addVeiculo(veiculo2);
        
        System.out.println(management.listVeiculo());
        
        System.out.println(management.ableVeiculo());
    }
    
    
}
