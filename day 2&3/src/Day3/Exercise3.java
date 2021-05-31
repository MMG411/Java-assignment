
package Day3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Exercise3 {

  
    public static Map<String,String> cities_with_max_population_within_countries(Map <String,List<Cities>>mp)
    {
          Map<String,String>HighstpopulationCity=new HashMap <>();
           
           Iterator<Map.Entry<String, List<Cities>>> itr2 = mp.entrySet().iterator();
         
        while(itr2.hasNext())
        {
            Map.Entry<String, List<Cities>> entry = itr2.next();
          HighstpopulationCity.put( entry.getKey(),
           entry.getValue().stream()
           .reduce((first, second) -> second).get().name
          );
           
        }
         
           
    return HighstpopulationCity ;        
    }
    
    public static Map<String,String> cities_with_max_population_within_continents( List <Cities> city)
    {
             
        
         
         Map <String,List<Cities>>mp=new HashMap<>() ; 
         
           for (Cities j: city)
           {
               
         mp.computeIfAbsent(j.continent,k -> new ArrayList<>()).add(j);
          
           }
           Iterator<Map.Entry<String, List<Cities>>> itr1 = mp.entrySet().iterator();
           while(itr1.hasNext())
        {
            Map.Entry<String, List<Cities>> entry = itr1.next();
          entry.getValue().sort(Comparator.comparing(a -> a.population));
          
           
        } 
         
        Map<String,String>HighstpopulationCity=new HashMap <>();
           
           Iterator<Map.Entry<String, List<Cities>>> itr2 = mp.entrySet().iterator();
         
        while(itr2.hasNext())
        {
            Map.Entry<String, List<Cities>> entry = itr2.next();
          HighstpopulationCity.put( entry.getKey(),
           entry.getValue().stream()
           .reduce((first, second) -> second).get().name
          );
           
        }
        
        
        return HighstpopulationCity;
    }
    
    
    
    public static String capital_with_max_population( List <Cities> city)
    {
          String Capital="There is no Capital";   
          int pop=0;
        for (Cities i :city)
        {
            if (i.capital==true)
            {
                if(i.population>pop)
                {
                    pop=i.population;
                    Capital=i.name;
                }
            }
        }
        
        return Capital;
    }
}
