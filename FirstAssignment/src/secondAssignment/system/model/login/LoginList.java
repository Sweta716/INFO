/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secondAssignment.system.model.login;

import java.util.ArrayList;

/**
 *
 * @author sweta
 */
public class LoginList {
     private ArrayList<AddLogin> loginList;
     public LoginList(){
        loginList = new ArrayList<>();
    }
    public ArrayList<AddLogin> getLoginList() {
        return loginList;
    }

    public void setLoginList(ArrayList<AddLogin> loginList) {
        this.loginList = loginList;
    }
    public AddLogin addlogin(AddLogin login){
        loginList.add(login);
        return login;
    }
     
    
}
