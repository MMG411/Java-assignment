
package Day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class Homework_Main {

    public static void main(String[] args) {
     
        
        
        /*------------------ Exersice1 ---------------------------*/
        
        Map <String,List<Cities>>mp=new HashMap<>() ;  
        ReadfromCsv R=new ReadfromCsv();
        List<Countries> c=R.readCountriesFromcsv("C:\\Users\\lenovo\\Desktop\\Countries.csv");
       List <Cities> city= R.readcitiesfromcsv("C:\\Users\\lenovo\\Desktop\\Cities.csv");
       
      
       /*Filling maps with list of cities */
           for (Cities j: city)
           {
               
         mp.computeIfAbsent(j.countrycode,k -> new ArrayList<>()).add(j);
          
           }
         
    
        /*sorted the lists of cities*/
             
         Iterator<Map.Entry<String, List<Cities>>> itr1 = mp.entrySet().iterator();
        while(itr1.hasNext())
        {
            Map.Entry<String, List<Cities>> entry = itr1.next();
          entry.getValue().sort(Comparator.comparing(a -> a.population));
          
           
        }  
         
        
        
        
        
        
        /*--------------Exersice 2 -----------------------------*/
         String string1="dsdhjdv";
    String string2="hsdshdhghhh";
     String longer =Exersice2.betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());
     System.out.println(" EX2 : The Better String is : "+longer);
        
        
        /*-------------------Exercise 3 ---------------------------*/
        
        /*----Q1---*/
          Map<String,String>HighstpopulationCitywithincountry = Exercise3.cities_with_max_population_within_countries(mp);
          
          
        System.out.println(" EX3-Q1 : Highst population cities within country");
         for (Map.Entry<String, String> entry : HighstpopulationCitywithincountry.entrySet())
         {
        System.out.println("Country code : "+entry.getKey() + " ==>" +" City : " +entry.getValue());
    }
             
         /*----Q2---*/
         Map<String,String>HighstpopulationCitywithincontinent=Exercise3.cities_with_max_population_within_continents(city);
             
         System.out.println("EX3-Q2 : Highst population cities within continent");
             for (Map.Entry<String, String> entry : HighstpopulationCitywithincontinent.entrySet())
         {
        System.out.println("Continent : "+entry.getKey() + " ==>" + " City : "+entry.getValue());
    }
         
        /*---Q3 --*/
         
       String capital=Exercise3.capital_with_max_population(city);
             
         System.out.println("EX3-Q3 : The capital with the highst population");
         System.out.println(capital);
        
        
         
         /*---------------- Exersice 4 -----------------------*/
         
         List<Double>Heights=PyramidCSVDAO.readPyramidsFromcsv("C:\\Users\\lenovo\\Desktop\\pyramids.csv");
       Collections.sort(Heights);
       
       
       double Median=0,Q1=0,Q3=0;
     
       if(Heights.size()/2==(Heights.size()+1)/2)
       {
           Median=Heights.get(Heights.size()/2);
       }
       else
       {
           Median=(Heights.get(Heights.size()/2)+Heights.get((Heights.size()/2)+1))/2;
       }  
       
         System.out.println("EX4-Q1: Median of Heights of the pyramids = "+ Median); 
       
       if((Heights.size()/2)%2==0)
       {
           Q1=(Heights.get(Heights.size()/4)+Heights.get((Heights.size()/4)+1))/2;
         Q3 = (Heights.get((3*Heights.size())/4)+Heights.get(((3*Heights.size())/4)+1))/2;
       }
       else
       {
           Q1=Heights.get(Heights.size()/4);
         Q3 = Heights.get((3*Heights.size())/4);
       }
      
          System.out.println("EX4-Q2 : Lower quartile of Heights of the pyramids = "+ Q1); 
          System.out.println("EX4 -Q3 : Upper quartile of Heights of the pyramids = "+ Q3); 
              }
    
}
