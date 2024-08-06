
package inheritanceexample;

import javax.swing.*;       // to use JOption
import java.io.*;           // to save to file
import java.util.*;         // arraylist is part of util class

/**
 *
 * @author Motlalane
 */
public class InheritanceExample {

    //polymophism 
    // using one array list to save both PanelVan and PassengerTaxi (both can be saved in arraylist type Taxi
    // they are subclasses of Taxi
    private static ArrayList<Taxi> taxis;
    
    
    public static void main(String[] args) {
        
        taxis = new ArrayList<Taxi>();
        char selected = '1';
        
        while (selected != '6')
        {
            selected = JOptionPane.showInputDialog(menu()).charAt(0);
            
            switch (selected)
            {
                case '1':
                    newPassengerTaxi();
                    break;
                    
                case '2':
                    newPanelVan();
                    break;
                    
                case '3':
                    displayPassengerTaxi();
                    break;
                    
                case '4':
                    displayPanelVan();
                    break;
                    
                case '5':
                    getTaxiByName();
                    break;
                    
                 case '6':
                    JOptionPane.showInputDialog(null, "Thank you for using the application!" 
                            + "Bye byeini");
                    break;
                    
                 default:
                    JOptionPane.showMessageDialog(null, "Please selct the valid option from the menu");
            }
        }
        
        System.exit(0);             // the system to exits if the loop terminates/ exit
    }
    
    //===2===
    public static void newPassengerTaxi()
    {
      // need name , year manufacture
        // ask user to enter information
        String name = JOptionPane.showInputDialog("Please enter the name of the taxi:");
        String yearManufactured = JOptionPane.showInputDialog("Please enter the year the taxi was "
                + "was manufactured:");
        String maxNumberOfPassengers = JOptionPane.showInputDialog("Please enter maximum number of passengers");

        // create the passengerTaxi object
        PassengerTaxi taxi = new PassengerTaxi(name, yearManufactured, Integer.parseInt(maxNumberOfPassengers));
        
        //add object to our array
        taxis.add(taxi);
    }
    
       //===2===
    public static void newPanelVan()
    {
      // need name , year manufacture
        // ask user to enter information
        String name = JOptionPane.showInputDialog("Please enter the name of the taxi:");
        String yearManufactured = JOptionPane.showInputDialog("Please enter the year the taxi was "
                + "was manufactured:");
        String panelVanCapacityInTons = JOptionPane.showInputDialog("Please enter cargo Capacity in tonnage ");

        // create the passengerTaxi object
        PanelVan taxi = new PanelVan(name, yearManufactured, Integer.parseInt(panelVanCapacityInTons));
        //add object to our array
        taxis.add(taxi);
    }
    
    public static void displayPassengerTaxi()
    {
        // for loop to show data
        String data = "";
        
        for (int i = 0; i <taxis.size(); i++)
        {
            // use instance to check if every element , object is taxi object and show to user
            if (taxis.get(i) instanceof PassengerTaxi)
            {
               data = data + taxis.get(i).toString()+ "\n";     //toString method ill print name, year manufactured , max number of passenger
            }
        }
        
        // after loop show to user
        JOptionPane.showMessageDialog(null,  "Passenger Taxis:\n" + data);            //to show the data
    }
    
    public static void displayPanelVan()
    {
        // for loop to show data
        String data = "";
        
        for (int i = 0; i <taxis.size(); i++)
        {
            // use instance to check if every element , object is taxi object and show to user
            if (taxis.get(i) instanceof PanelVan)
            {
               data = data + taxis.get(i).toString()+ "\n";     //toString method ill print name, year manufactured , max number of passenger
            }
        }
        
        // after loop show to user
        JOptionPane.showMessageDialog(null,  "PanelVan Taxis:|n\n" + data);            //to show the data
    }
    
    public static void getTaxiByName()
    {
        // ask name and check if exist and display to user if exist
        // start with position -1 and to see if we find by name
        int pos = -1;
        
        String name = JOptionPane.showInputDialog("Please  enter name of the taxi"
                + "you are seraching for");
        
        for (int i = 0; i <taxis.size(); i++)
        {
           if (taxis.get(i).getName().equalsIgnoreCase(name))
           {
               //if found
               pos = i;     // if found at 1, will return 1
           }
        }
        
        if (pos != -1)      // we found in pos
        {
            JOptionPane.showMessageDialog(null, "Information of taxi " +
                    taxis.get(pos).getName() + "\n" +
                    taxis.get(pos).toString());
        }
        // if not found
        else
        {
            JOptionPane.showMessageDialog(null, "The taxi does not exist in database");
        }
        
    }
    
    // create menu "===1"
    public static String menu()
    {
        String menu = "Welcome to the Taxi application!\n" + 
                "Please choose an option below: \n" +
                "1. Create a new PasengerTaxi\n" +
                "2. Create a new PanelVan\n" +
                "3. See all PassengerTaxi\n" +
                "4. See all PanelVans\n" +
                "5. Search for a Taxi by name\n" +
                "6. Exit the application";
        
        return menu;
    }
    
}
