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
public class VitalSignHistory {
    
    private ArrayList<Create> history;
    public VitalSignHistory(){
        this.history = new ArrayList<Create>();
        
    }

    public ArrayList<Create> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Create> history) {
        this.history = history;
    }
      public Create addNewVital(){
        Create newVitals = new Create();
        history.add(newVitals);
        return newVitals;
    }

    public void deleteVitals(Create vs) {
        history.remove(vs);
    }
    
}
