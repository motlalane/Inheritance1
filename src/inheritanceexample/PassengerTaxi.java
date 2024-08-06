/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceexample;

/**
 *
 * @author Motlalane
 */
public class PassengerTaxi extends Taxi{
    
    // name and year Manufactured will inherit from taxi
    private int maxNumberOfPassengers;
    
    // create a constructor same name as class
    // accept name and year Manufactured
    
    public PassengerTaxi(String name, String yearManufactured, int maxNumberOfPassengers)
    {
       // set the year build, we can call the Taxi to do that
       // this will take the name and year Manufactured and pass to taxi
        // constructore will set name and year Manufactured
        // we now have access to all three
       super(name, yearManufactured);
       this.maxNumberOfPassengers = maxNumberOfPassengers;
    }
    
    public int getMaxNumberOfPassengers()
    {
        return maxNumberOfPassengers;
    }
    
    public void setMaxNumberOfPassengers(int max)
    {
        //max is value that was passed in
        this.maxNumberOfPassengers = max;
    }
    
    // create toString and toFile as as taxi
    //this override the two methods in TAXI class
    @Override
    public String toString()
    {
        return  "Name of the Taxi: " + getName() + "\n" + "Maximum number of passengers: " + maxNumberOfPassengers + "\n";
        
//        return super.toString()+ "Name of the Taxi: " + getName() + "\n" +
//                "Maximum number of passengers: " + maxNumberOfPassengers + "\n";
    }
    
    @Override
    public String toFile()
    {
        // this return name and Year manufacture  and add maximum number of Passengers
        return super.toFile() + "," + maxNumberOfPassengers;
    }
}
