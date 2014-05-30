/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable.pkg8;
import java.util.Hashtable;

/**
 *
 * @author Andrew
 */
public class HealthyHosptialMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HospitalInit test = new HospitalInit();
        
       System.out.println(test.ICU.name);
       Hashtable<String,Employee> worker = new Hashtable<String,Employee>();
       worker.put(test.Joe.EmployeeID, test.Joe);
       worker.put(test.Jane.EmployeeID,test.Jane);
       Employee what = worker.get("1235");
       System.out.println(what.DOB);
        
       
        
        
     
       
       
       
    }
}
