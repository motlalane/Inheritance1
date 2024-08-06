/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceexample;

/**
 *
 * @author Motlalane
 */
public class PanelVan extends Taxi{
    
    private int panelVanCapacityInTons;
    
    // create a constructor same name as class
    // accept name and year Manufactured
    
    public PanelVan(String name, String yearManufactured, int panelVanCapacityInTons)
    {
       // set the year build, we can call the Taxi to do that
       // this will take the name and year Manufactured and pass to taxi
        // constructore will set name and year Manufactured
        // we now have access to all three
       super(name, yearManufactured);
       this.panelVanCapacityInTons = panelVanCapacityInTons;
    }
    
    public int getpanelVanCapacityInTons()
    {
        return panelVanCapacityInTons;
    }
    
    public void setpanelVanCapacityInTons(int capacity)
    {
        //max is value that was passed in
        this.panelVanCapacityInTons = capacity;
    }
    
    // create toString and toFile as as taxi
    //this override the two methods in TAXI class
    @Override
    public String toString()
    {
        return  "Name of the Taxi: " + getName() + "\n" + "PanelVan capacity in tonnage: " + panelVanCapacityInTons + "\n";
        
//        return super.toString()+ "Name of the Taxi: " + getName() + "\n" +
//                "PanneVan  capacity in tonnage: " + panelVanCapacityInTons + "\n";
    }
    
    @Override
    public String toFile()
    {
        // this return name and Year manufacture  and add maximum number of Passengers
        return super.toFile() + "," + panelVanCapacityInTons;
    }
}
