/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha9;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Diogo
 */
public class ProjectManager extends Person {
    
    private String[] projects;
    private Date contractDate;

    public ProjectManager(String[] projects, Date contractDate, int id, String name, String birthDate, String address, int citizenCard, int vatNumber, double baseSalary) {
        super(id, name, birthDate, address, citizenCard, vatNumber, baseSalary);
        this.projects = projects;
        this.contractDate = contractDate;
    }

    public String[] getProjects() {
        return projects;
    }

    public void setProjects(String[] projects) {
        this.projects = projects;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

    @Override
    public String toString() {
        return "ProjectManager{" + "projects=" + projects + ", contractDate=" + contractDate + '}';
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
        final ProjectManager other = (ProjectManager) obj;
        return Arrays.deepEquals(this.projects, other.projects);
    }

    @Override
    public double getBaseSalary() {
        
        double salaryGest = super.getBaseSalary() + (super.getBaseSalary() * 0.15);
        int tempContratado = Calendar.getInstance().get(Calendar.YEAR) - getContractDate().getYear();
        int qtProjetos = getProjects().length;
        double salaryPAno = (salaryGest * 0.015) * tempContratado;
        double salaryFinal = (salaryPAno * 0.01) * qtProjetos;
        
        return salaryFinal;
        
       
    } 
    
    
}
