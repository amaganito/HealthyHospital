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
public class Employee {
    public String EmployeeID;
    public String Password;
    public String First;
    public String Last;
    public String Address;
    public String City;
    public String Zip;
    public String State;
    public String DOB;
    public String Position;
    public double Salary;
    public String EmergencyContact;
    public Department department;
    public static Hashtable Employeee = new Hashtable();
    
    public Employee(String EmployeeID,String Password, String First,String Last,
                    String Address, String City, String Zip, String State, String DOB,
                    String Position,double Salary,String EmergencyContact, Department department)
{
         this.EmployeeID = EmployeeID;
         this.Password = Password;
         this.First = First;
         this.Last = Last;
         this.Address = Address;
         this.City = City;
         this.Zip = Zip;
         this.State = State;
         this.DOB = DOB;
         this.Position = Position;
         this.Salary = Salary;
         this.EmergencyContact = EmergencyContact;
         Employeee.put(EmployeeID, Salary);
         this.department = department;
}

    public String getEmployeeID() {
        return EmployeeID;
    }

    public String getPassword() {
        return Password;
    }

    public String getFirst() {
        return First;
    }

    public String getLast() {
        return Last;
    }

    public String getAddress() {
        return Address;
    }

    public String getCity() {
        return City;
    }

    public String getZip() {
        return Zip;
    }

    public String getState() {
        return State;
    }

    public String getDOB() {
        return DOB;
    }

    public String getPosition() {
        return Position;
    }

    public double getSalary() {
        return Salary;
    }

    public String getEmergencyContact() {
        return EmergencyContact;
    }

    public static Hashtable getEmployee() {
        return Employeee;
    }
    
    
    
    
    
}
