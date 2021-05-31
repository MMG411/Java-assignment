/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2;

import java.util.List;

public class Main {
    public static void main(String[] args)
            
    {
        
       PyramidCSVDAO PDAO=new  PyramidCSVDAO();
    
     List<pyramid> pyramids=PDAO.readPyramidsFromcsv("C:\\Program Files\\NetBeans 8.0.2\\pyramids.csv");
     
     int i=0;
     for(pyramid p:pyramids)
     {
         System.out.println(p.height+","+p.modernname+","+p.pharoah+","+p.site);
     }
    }
     
}
