/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficha9;
import Enums.*;
import java.util.Date;

/**
 *
 * @author Diogo
 */
public class ProgrammerDemo {

    public static void main(String[] args) {
        // TODO code application logic here
        
       
        String[] arr = new String[1];
        arr[0] = "sdadsa";
        
        Person gestor1 = new ProjectManager(arr, new Date("11/02/2000"), 0, "Diogo", "11/02/2000", "ds", 0, 0, 100.0);
        
        System.out.println(gestor1.getBaseSalary());
        
    }
    
}
