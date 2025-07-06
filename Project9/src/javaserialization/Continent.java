/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaserialization;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Bismi
 */
public class Continent implements Serializable {
    private String continent;
    private ArrayList<Country> countries;

    public Continent (String continent) {
        this.continent = continent;
    }
    
    public String getContinent (){
        return this.continent;
    }
    
    public void addCountry(Country c){
        countries.add (c);
    }
    
    public void viewCountries(){
        for(Country c: countries){
            System.out.printf("%-20s%20f%20d%n", c.getCountryName(), c.getArea(), c.getPopulation());
        }
    }
}
