/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secondAssignment.system.person;

/**
 *
 * @author sweta
 */
public class Person {
    
    String name;
    String age;
    String contact;
    
    public Person(String name, String age, String contact){
        this.name = name;
        this.age = age;
        this.contact = contact;
        
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", contact=" + contact + '}';
    }

    
   
    
    
}
