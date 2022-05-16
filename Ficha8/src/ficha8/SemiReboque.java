/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha8;

/**
 *
 * @author Diogo
 */
public class SemiReboque extends Trailer{
    
    private int spareTyreNumber;

    public SemiReboque(int spareTyreNumber, int axesNumber, int load) {
        super(axesNumber, load);
        this.spareTyreNumber = spareTyreNumber;
    }

    public SemiReboque(int spareTyreNumber, int load) {
        super(load);
        this.spareTyreNumber = spareTyreNumber;
    }

    @Override
    public String toString() {
        return "SemiReboque{" + "spareTyreNumber=" + spareTyreNumber + '}';
    }
    
    
    
    
    
}
