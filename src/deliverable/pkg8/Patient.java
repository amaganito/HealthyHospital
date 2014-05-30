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
public class Patient {
    public String Last;
    public String First;
    public String Address;
    public String City;
    public String State;
    public String Zip;
    public String EmergencyContact;
    public String Last4SSN;
    public String Location;
    public String History;
    public String DOB;
    public String Xray;
    public String Medicine;
    public String Billing;
    public static Hashtable Patient = new Hashtable();
    
    public Patient(String First, String Last, String Address, String City,
            String State, String Zip, String EmergencyContact, String Last4SSN, String Location, String DOB)
    {
        this.DOB = DOB;
       this.First = First;
       this.Last = Last;
       this.Address = Address;
       this.City = City;
       this.State = State;
       this.Zip = Zip;
       this.EmergencyContact =EmergencyContact;
       this.Last4SSN = Last4SSN;
       this.Location = Location;
       Patient.put(Last4SSN, this);
    
    }
    
    

    public String getLast() {
        return Last;
    }

    public String getFirst() {
        return First;
    }

    public String getAddress() {
        return Address;
    }

    public String getCity() {
        return City;
    }

    public String getState() {
        return State;
    }

    public String getZip() {
        return Zip;
    }

    public String getEmergencyContact() {
        return EmergencyContact;
    }

    public String getLast4SSN() {
        return Last4SSN;
    }

    public String getLocation() {
        return Location;
    }

    /**
     * @return the History
     */
    public String getHistory() {
        return History;
    }

    /**
     * @param History the History to set
     */
    public void setHistory(String History) {
        this.History = History;
    }

    /**
     * @param Xray the Xray to set
     */
    public void setXray(String Xray) {
        this.Xray = Xray;
    }

    /**
     * @param Medicine the Medicine to set
     */
    public void setMedicine(String Medicine) {
        this.Medicine = Medicine;
    }

    /**
     * @param Billing the Billing to set
     */
    public void setBilling(String Billing) {
        this.Billing = Billing;
    }

    /**
     * @param Location the Location to set
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

   
    
    
    
    
}
