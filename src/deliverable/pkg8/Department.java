package deliverable.pkg8;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew
 */
public class Department {
    public String name;
    public String phoneNumber;
    
    public Department(String name, String phoneNumber){
    this.name = name;
    this.phoneNumber = phoneNumber;
    }
    
    public String getName(){return this.name;}
    public String getphoneNumber(){return this.phoneNumber;}
}
