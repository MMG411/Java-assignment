/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PyramidCSVDAO {
    public PyramidCSVDAO()
    {}
    public List <pyramid> readPyramidsFromcsv(String f) 
    {
       
        
        List<pyramid> l=new ArrayList<pyramid>();
        File F= new File(f);
        try {
            Scanner myreader=new Scanner(F);
            myreader.nextLine();
            while(myreader.hasNextLine())
            {
             double i=-1;
             
             String[] myArray = myreader.nextLine().split(",");
             if(!myArray[7].isEmpty())
             {
                System.out.println(myArray[7]);
                 i= Double.parseDouble(myArray[7]);
            }
            
             
              pyramid obj = new pyramid(i,myArray[2],myArray[0],myArray[4]) ;
               l.add(obj);
            
            }
            myreader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PyramidCSVDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     return l;   
    }
    
}
