/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable.pkg8;
import java.util.Dictionary;
import java.util.Hashtable;
/**
 *
 * @author Andrew
 */
public class HospitalInit {
    Department ICU = new Department("ICU", "510-888-1111");
    Department Supply = new Department("Supply", "510-888-1112");
    Department Pediatrics = new Department("Pediatrics", "510-888-1113");
    Department XRAY = new Department("X-Ray/MRI", "510-888-1213");
    //
   Employee Joe = new Employee("A1234","8888", "Joe","Doe",
                    "379 Washburn Ave", "Fremont", "94536", "CA", "12/23/1987",
                     "Doctor",1000000.00," Joe's Mom\n 510 888 7879",XRAY);
   Employee Jane = new Employee("H1234","8888", "Jane","Doe",
                    "219 Superman Ave", "Hayward", "94536", "CA", "12/23/1980",
                     "Nurse",80000.00," Jane's Dad\n 510 888 7879", ICU);
   
  Equipment XRay = new Equipment("X-Ray");
  Equipment Gloves = new Equipment("Gloves");
  Equipment Beds = new Equipment("Beds");
  Equipment CottonBalls = new Equipment("Cotton Balls");
  
  
  Medicine Tylenol =new Medicine("Tylenol", 300);
  Medicine Zyrtec = new Medicine("Zyrtec", 500);
  
      Patient Hook = new Patient("James", "Hook", "111 Tooke", "Fort Walton Beach",
            "FL", "89148", "Smi 5108881523", "5678", "ICU","03/09/2001");
         Patient Peter = new  Patient("Peter", "Pan", "134 Lost", "Never Land",
           "Florida", "89147", "Wendy 5108885464", "4789", "Pediatrics","01/08/2008");
         
   
     
      
      
}
