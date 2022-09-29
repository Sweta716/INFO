/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstassignment.model;

import java.util.ArrayList;

/**
 *
 * @author sweta
 */
public class EmployeeList {
    
    private ArrayList<Create> empList;
    public EmployeeList(){
        this.empList = new ArrayList<Create>();
        
    }

    public ArrayList<Create> getEmpList() {
        return empList;
    }

    public void setEmpList(ArrayList<Create> empList) {
        this.empList = empList;
    }

//    public ArrayList<Create> getHistory() {
//        return empList;
//    }
//
//    public void setHistory(ArrayList<Create> history) {
//        this.empList = history;
//    }
      public Create addNewEmployee(){
        Create newVitals = new Create();
        empList.add(newVitals);
        return newVitals;
    }

    public void deleteEmployee(Create vs) {
        empList.remove(vs);
    }
    
}
