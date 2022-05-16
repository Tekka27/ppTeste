/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;



/**
 *
 * @author Diogo
 */
public interface IAutomovel extends IVeiculo {
    
    int getOccupantsNumber();
    int getDoorsNumber();
    void setDoorsNumber(int doorsNumber);
    void setOccupantsNumber(int occupantsNumber);
            
}
