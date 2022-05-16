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
public class JavaProgrammer extends Person {

    private int programmingYears;
    private String projectName;
    private ProgrammerType programmerType;

    public JavaProgrammer(int programmingYears, String projectName, ProgrammerType programmerType, int id, String name, String birthDate, String address, int citizenCard, int vatNumber, double baseSalary) {
        super(id, name, birthDate, address, citizenCard, vatNumber, baseSalary);
        this.programmingYears = programmingYears;
        this.projectName = projectName;
        this.programmerType = programmerType;
    }

    public int getProgrammingYears() {
        return programmingYears;
    }

    public void setProgrammingYears(int programmingYears) {
        this.programmingYears = programmingYears;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public ProgrammerType getProgrammerType() {
        return programmerType;
    }

    public void setProgrammerType(ProgrammerType programmerType) {
        this.programmerType = programmerType;
    }

    @Override
    public String toString() {
        return "JavaProgrammer{" + "programmingYears=" + programmingYears + ", projectName=" + projectName + ", programmerType=" + programmerType + '}';
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
        final JavaProgrammer other = (JavaProgrammer) obj;
        return Objects.equals(this.projectName, other.projectName);
    }

    @Override
    public double getBaseSalary() {

        double salaryProgrammer = super.getBaseSalary() + (super.getBaseSalary() * 0.05);
        int workTime = getProgrammingYears();

        if(null != getProgrammerType())switch (getProgrammerType()) {
            case JUNIOR:
                salaryProgrammer += salaryProgrammer * 0.05;
                salaryProgrammer += (workTime * (salaryProgrammer * 0.05));
                
                return salaryProgrammer;
            case SENIOR:
                salaryProgrammer += (salaryProgrammer * 0.15);
                salaryProgrammer += (workTime * (salaryProgrammer * 0.05));
                
                return salaryProgrammer;
        }
        return -1;
        
    }
}
