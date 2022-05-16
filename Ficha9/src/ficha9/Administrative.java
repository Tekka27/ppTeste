/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha9;

import Enums.*;
import java.util.Objects;
/**
 *
 * @author Diogo
 */
public class Administrative extends Person{
    
    private String initials;
    private ContractType contractType;
    private Skills skills;
    private String beginContract;
    private String endContract;

    public Administrative(String initials, ContractType contractType, Skills skills, String beginContract, String endContract, int id, String name, String birthDate, String address, int citizenCard, int vatNumber, double baseSalary) {
        super(id, name, birthDate, address, citizenCard, vatNumber, baseSalary);
        this.initials = initials;
        this.contractType = contractType;
        this.skills = skills;
        this.beginContract = beginContract;
        this.endContract = endContract;
    }
    
    public Administrative(String initials, ContractType contractType, Skills skills, String beginContract, int id, String name, String birthDate, String address, int citizenCard, int vatNumber, double baseSalary) {
        super(id, name, birthDate, address, citizenCard, vatNumber, baseSalary);
        this.initials = initials;
        this.contractType = contractType;
        this.skills = skills;
        this.beginContract = beginContract;
        this.endContract = null;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    public String getBeginContract() {
        return beginContract;
    }

    public void setBeginContract(String beginContract) {
        this.beginContract = beginContract;
    }

    public String getEndContract() {
        return endContract;
    }

    public void setEndContract(String endContract) {
        this.endContract = endContract;
    }

    @Override
    public String toString() {
        return "Administrative{" + "initials=" + initials + ", contractType=" + contractType + ", skills=" + skills + ", beginContract=" + beginContract + ", endContract=" + endContract + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Administrative other = (Administrative) obj;
        return Objects.equals(this.initials, other.initials);
    }

    @Override
    public double getBaseSalary() {
        
        double plicen = 0;
        double pmestr = 0;
        double pdout = 0;
        
        if(null != getSkills())switch (getSkills()) {
            case LICENCIATURA:
                plicen = super.getBaseSalary() + (super.getBaseSalary() * 0.1);
                
                return plicen;
            case MESTRADO:
                pmestr = super.getBaseSalary() + (super.getBaseSalary() * 0.2);
                
                return pmestr;
            case DOUTORAMENTO:
                pdout = super.getBaseSalary() + (super.getBaseSalary() * 0.3);
                
                return pdout;
            default:
                break;
        }
        return -1;
    }
    
    
    
    
    
}
