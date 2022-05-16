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
public class Reboque extends Trailer{
    
    private final TrailerType trailerType;

    public Reboque(TrailerType trailerType, int axesNumber, int load) {
        super(axesNumber, load);
        this.trailerType = trailerType;
    }

    public Reboque(TrailerType trailerType, int load) {
        super(load);
        this.trailerType = trailerType;
    }
    
    

    @Override
    public String toString() {
        String superString = super.toString();
        return superString + "towHaul{" + "trailerType=" + trailerType + '}';
    }

    public TrailerType getTrailerType() {
        return trailerType;
    }


    
    
    
}
