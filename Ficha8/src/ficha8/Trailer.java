/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha8;

/**
 *
 * @author Diogo
 */
public class Trailer {
    
    private int axesNumber;
    private int load;

    public Trailer(int axesNumber, int load) {
        this.axesNumber = axesNumber;
        this.load = load;
    }
    
    public Trailer(int load) {
        this.axesNumber = 2;
        this.load = load;
    }

    public int getAxesNumber() {
        return axesNumber;
    }

    public void setAxesNumber(int axesNumber) {
        this.axesNumber = axesNumber;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "Trailer{" + "axesNumber=" + axesNumber + ", load=" + load + '}';
    }
    
    
    
    
}
