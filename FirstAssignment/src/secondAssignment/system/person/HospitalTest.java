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
public class HospitalTest {
    public static void main(String[] args) {
        Patient p = new Patient("sweta","20","contact_patiient","PA12345678",
        new ArrayList<MedicalReport>()
        );
        System.out.println(p);
    }
    
}
