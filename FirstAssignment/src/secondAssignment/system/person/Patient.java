/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secondAssignment.system.person;

import java.util.ArrayList;

/**
 *
 * @author sweta
 */
public class Patient extends Person {
    private String patientID;
    private ArrayList<MedicalReport> reports;
    
    
    public Patient(String name, String age, String contact, String patientID,ArrayList<MedicalReport> reports ) {
        super(name, age, contact);
        setPatientID(patientID);
        setReports(reports);
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        if(patientID.startsWith("PA") && patientID.length() == 10){
            this.patientID = patientID;
        }
        else{
            throw new IllegalArgumentException("worng patient id");
        }
    }

    public ArrayList<MedicalReport> getReports() {
        return reports;
    }

    public void setReports(ArrayList<MedicalReport> reports) {
        this.reports = reports;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s,%s",patientID, super.toString(),reports );
    }
    
    
    
}
