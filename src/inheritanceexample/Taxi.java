
package inheritanceexample;

/**
 *
 * @author Motlalane
 */
public class Taxi {
    // since not used extends we derive from the class object
    // make all fields private and all methods public
    private String name;            // 
    private String yearManufactured;
    
    // Construct must have same name as the class name
    // pass the name and yearmanufactured
    public Taxi (String name, String yearManufactured)                 
    { 
        // reference tje name of object you are busy building
        this.name = name;
        this.yearManufactured = yearManufactured;
    }
    
    // create getters nd setters to use to get the private fields
    public String getName()
    {
        return name;
    }
    
    public String yearManufactured()
    {
        return yearManufactured;
    }
    
    public void setName (String name)
    {
        // set the name to the name that was passed through
        this.name = name;
    }
    
    public void setYearManufactured (String yearManufactured)
    {
        // set the name to the name that was passed through
        this.yearManufactured = yearManufactured;
    }
    
    @Override
    public String toString()
    {
        // this will override the toString method of the super class
        // retrun the sting to show was is saved in those two variables
        // When we print it out
        return  "Name of the Taxi: " + name + "\n" +
                "Year Manufactured: " + "\n";
    }
    
    public String toFile()
    {
        return name + "," + yearManufactured;
    }
}
