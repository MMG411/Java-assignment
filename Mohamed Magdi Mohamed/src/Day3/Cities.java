
package Day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Cities {
   int containscode,surfacearea,population;
   boolean capital;

    public boolean isCapital() {
        return capital;
    }

    public int getContainscode() {
        return containscode;
    }

    public int getSurfacearea() {
        return surfacearea;
    }

    public int getPopulation() {
        return population;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public String getCountrycode() {
        return countrycode;
    }
   String name,continent,countrycode;

    public Cities(int containscode,String name , String cont ,String countrycode, int surfacearea, int population,boolean capital) {
        this.containscode = containscode;
        this.countrycode = countrycode;
        this.surfacearea = surfacearea;
        this.name = name;
        this.continent = cont;
        this.population=population;
        this.capital=capital;
    }
   
    
    
}
