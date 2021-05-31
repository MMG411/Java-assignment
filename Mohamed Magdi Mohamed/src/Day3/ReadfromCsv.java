/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ReadfromCsv {
    public List <Cities> readcitiesfromcsv(String f) 
    {
        List<Cities> l=new ArrayList<>();
        File F= new File(f);
        
          try {
             Scanner myreader = new Scanner(F);
               myreader.nextLine();
               
          while(myreader.hasNextLine())
            {
            String[] myArray = myreader.nextLine().split(",");
            Cities c=new Cities(Integer.parseInt(myArray[0]),myArray[1],myArray[2],myArray[3],Integer.parseInt(myArray[4]),Integer.parseInt(myArray[5]), Boolean.parseBoolean(myArray[6]));
            l.add(c);
            } 
          }
          catch (FileNotFoundException ex)
          {
              Logger.getLogger(Cities.class.getName()).log(Level.SEVERE, null, ex);
          }
         
     return l;   
    }
    public List <Countries> readCountriesFromcsv(String f) 
    {
        List<Countries> l=new ArrayList<>();
        File F= new File(f);
        
          try {
             Scanner myreader = new Scanner(F);
               myreader.nextLine();
               
          while(myreader.hasNextLine())
            {
               
            String[] myArray = myreader.nextLine().split(",");
            Countries c=new Countries(myArray[0],myArray[1]);
            l.add(c);
            } 
          }
          catch (FileNotFoundException ex)
          {
              Logger.getLogger(Cities.class.getName()).log(Level.SEVERE, null, ex);
          }
         
     return l;   
    }  
    
}
