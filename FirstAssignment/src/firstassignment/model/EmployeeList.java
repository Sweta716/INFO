/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstassignment.model;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author sweta
 */
public class EmployeeList {
    
    private ArrayList<CreateEmployee> empList;
    private String imgPath;

    public EmployeeList(){
        this.empList = new ArrayList<CreateEmployee>();
        
    }

    public ArrayList<CreateEmployee> getEmpList() {
        return empList;
    }

    public void setEmpList(ArrayList<CreateEmployee> empList) {
        this.empList = empList;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
//    public ArrayList<Create> getHistory() {
//        return empList;
//    }
//
//    public void setHistory(ArrayList<Create> history) {
//        this.empList = history;
//    }
      public CreateEmployee addNewEmployee(){
        CreateEmployee createEmployee = new CreateEmployee();
        empList.add(createEmployee);
        return createEmployee;
    }

    public void deleteEmployee(CreateEmployee vs) {
        empList.remove(vs);
    }
    
    public ImageIcon empImage(String ImagePath){
        JLabel label = new JLabel();
        ImageIcon empImg = new ImageIcon(ImagePath);
        Image img = empImg.getImage();
        //Image newImg = img.getScaledInstance(label);
        ImageIcon image = new ImageIcon(img);
        return image;
    }
    
}
