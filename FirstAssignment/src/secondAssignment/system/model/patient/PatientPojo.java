/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secondAssignment.system.model.patient;

/**
 *
 * @author sweta
 */
public class PatientPojo {
    String patientID;
    String name;
    String contactNumber;
    String age;
    String gender;
    String bloodGroup;
    String address;
    String majorDisease;

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMajorDisease() {
        return majorDisease;
    }

    public void setMajorDisease(String majorDisease) {
        this.majorDisease = majorDisease;
    }

    @Override
    public String toString() {
        return "PatientPojo{" + "patientID=" + patientID + ", name=" + name + ", contactNumber=" + contactNumber + ", age=" + age + ", gender=" + gender + ", bloodGroup=" + bloodGroup + ", address=" + address + ", majorDisease=" + majorDisease + '}';
    }
    
    
    
}
