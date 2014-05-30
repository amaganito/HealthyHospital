/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable.pkg8;

/**
 *
 * @author Andrew
 */
public class Medicine{
    public String name;
    public int Quantity;
    
    public Medicine(String name, int Quantity){this.name =  name; this.Quantity = Quantity;}
    
    
    public String getMed(){return name + " " + Quantity;}
    
    public String getName(){return name;}
}
