/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modifier;

/**
 *
 * @author Bismi
 */
public class Dosen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Orang dsn = new Orang();
        //dsn.nama = "Haris";
        
        dsn.buatNama("Haris Aspriyono");
        System.out.println("Nama Dosen :" + dsn.tampilNama());
    }
    
}
