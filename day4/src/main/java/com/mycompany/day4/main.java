import joinery.datafarame;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import tech.tablesaw.api.DateColumn;
import tech.tablesaw.api.IntColumn;
import tech.tablesaw.api.Table;
package com.mycompany.day4;

class main {
    
    public static void main(String [] args)
    {
        try{
            
          DataFrame<Object>  df= DataFrame.readCsv ("src/main/resources/data/vgsales.csv")
            System.out.println(df.discribe());
            system.out.println(df.discribe().col(column:0).get(4)); 
            system.out.println(df.discribe().col(column:1).get(3));    
            system.out.println(df.discribe().col(column:2).get(2));  
             int rowCount = df.rowCount();
        List<Integer> l = new ArrayList<Integer> ();
         Integer[] cnt = new Integer[rowCount];
        for (int i = 0; i < rowCount; i++) {
            l.add (i));
            cnt[i]=i+1;
        }
        DateColumn dateColumn = DateColumn.create ("Fake Date", dateList);
        IntColumn counter = IntColumn.create ("Counter",cnt);
        
        table1.insertColumn (table1.columnCount (), dateColumn);
        table1.insertColumn (table1.columnCount (), counter);
        
         System.out.println(table1.first(7));
         
         Table joined =table1.joinOn("name").inner(table2);
          System.out.print(joined.first(4));
           System.out.println(joined.structure())
            
        }
        catch(IOExeption e)
                {
                   e.printstaktrace(); 
                }
        
    }
    
}
