/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProjectSerialization;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Bismi
 */

public class SerializationDemo {
    public static void main(String[] args){
        Continent Asia;
        Continent Europe;
        File file = new File("src/projectserialization/country.ser");
        
        if(!file.exists()) {
            try(ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream(file))){
                Asia = new Continent("Asia");
                
                Asia.addCountry(new Country("China", 9598094, 1382710000));
                Asia.addCountry(new Country("India", 3287263, 1339000000));
                Asia.addCountry(new Country("Pakistan", 796095, 1967000000));
                
                Europe = new Continent("Europe");
                
                Europe.addCountry(new Country("Russia", 17098242, 146544000));
                Europe.addCountry(new Country("Germany", 3287263, 81771000));
                
                objOut.writeObject(Asia);
                objOut.writeObject(Europe);
                
                System.out.println("Object are written successfully!");
            }catch(IOException e){
                System.out.println(e);
            }
        }
    }
}
