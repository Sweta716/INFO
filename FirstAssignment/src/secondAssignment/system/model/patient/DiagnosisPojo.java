/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secondAssignment.system.model.patient;

/**
 *
 * @author sweta
 */
public class DiagnosisPojo {
    String symptoms;
    String diagnosis;
    String medicines;
    String wardType;

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getMedicines() {
        return medicines;
    }

    public void setMedicines(String medicines) {
        this.medicines = medicines;
    }

    public String getWardType() {
        return wardType;
    }

    public void setWardType(String wardType) {
        this.wardType = wardType;
    }

    @Override
    public String toString() {
        return "DiagnosisPojo{" + "symptoms=" + symptoms + ", diagnosis=" + diagnosis + ", medicines=" + medicines + ", wardType=" + wardType + '}';
    }
    
    
    
}
