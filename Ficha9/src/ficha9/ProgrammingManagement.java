/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha9;

/**
 *
 * @author Diogo
 */
public class ProgrammingManagement {

    private Person[] listPerson;

    public ProgrammingManagement(Person[] listPerson) {
        this.listPerson = listPerson;
    }
     
    public boolean addPerson(Person pessoas) {

        if (isExist(pessoas)) {
            return false;
        }
        Person[] temp = new Person[this.listPerson.length + 1];

        for (int i = 0; i < this.listPerson.length; i++) {

            temp[i] = this.listPerson[i];
        }

        temp[this.listPerson.length] = pessoas;
        this.listPerson = temp;

        return true;
    }

    public boolean isExist(Person pessoas) {

        for (int i = 0; i < this.listPerson.length; i++) {

            if (this.listPerson[i].getVatNumber() == pessoas.getVatNumber()) {
                return true;
            }
        }
        return false;
    }

    public int findPerson(int idPerson) {

        for (int i = 0; i < this.listPerson.length; i++) {
            if(this.listPerson[i].getId() == idPerson){
                return i;
            }
        }
        
        return -1;
    }
    
    public boolean removePerson(int idPerson){
        
        int pos = this.findPerson(idPerson);
        
        if(pos == -1){
            return false;
        }
        
        Person[] temp = new Person[this.listPerson.length - 1];
        
       
        return true;
    }
}
