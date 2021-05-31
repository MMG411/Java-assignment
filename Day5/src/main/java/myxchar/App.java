package myxchar;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.knowm.xchart.*;


import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
          App xChartExamples = new App ();
        List<Titanic> l = xChartExamples.getPassengers();
        xChartExamples.graphPassengerClass (l);
        
        try {
            System.in.read();
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
     public List<Titanic> getPassengers() {
        List<Titanic> l = new ArrayList<Titanic> ();
        ObjectMapper objectMapper = new ObjectMapper ();
        objectMapper.configure (DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try (InputStream input = new FileInputStream ("titanic_csv.json")) {
            
            l = objectMapper.readValue (input, new TypeReference<List<Titanic>> () {
            });
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
        return l;
    }
public void graphPassengerClass(List<Titanic> l) {
    //filter to get a map of passenger class and total number of passengers in each class
    Map<String, Long> result =
    l.stream ().collect (
    Collectors.groupingBy (
    Titanic::getPclass, Collectors.counting ()
    )
    );
    
    PieChart chart = new PieChartBuilder ();
    chart.width(1024).height(700).title("New Title").build();
 
    chart.addSeries ("First Class", result.get ("1"));
    chart.addSeries ("Second Class", result.get ("2"));
    chart.addSeries ("Third Class", result.get ("3"));
   
    new SwingWrapper (chart).displayChart ();
}
  
}

       