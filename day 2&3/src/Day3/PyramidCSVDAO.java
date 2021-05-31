
package Day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PyramidCSVDAO {
    public PyramidCSVDAO()
    {}
    public static List <Double> readPyramidsFromcsv(String f) 
    {
       
        
        List<Double> l=new ArrayList<>();
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
               
                 i= Double.parseDouble(myArray[7]);
                 l.add(i);
            }
            
             
             
            
            }
            myreader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PyramidCSVDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     return l;   
    }
    
}
