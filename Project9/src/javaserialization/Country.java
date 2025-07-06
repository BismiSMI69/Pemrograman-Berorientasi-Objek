/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaserialization;
import java.io.Serializable;

/**
 *
 * @author Bismi
 */
public class Country implements Serializable{
    private String countryName;
    private double area;
    private long population;

    public Country (String c, double a, long p){
        this.countryName = c;
        this.area        = a;
        this.population  = p;
        
        //set getter methods
        public String getCountryName(){
            return this.countryName;
        }
        
        public double getArea(){
            return this.area;
        }
        
        public long getPopulation(){
            return this.population;
        }
    }
   
