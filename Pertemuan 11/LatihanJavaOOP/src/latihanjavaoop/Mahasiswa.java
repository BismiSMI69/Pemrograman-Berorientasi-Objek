
package latihanjavaoop;

import modifier.Orang;

/**
 *
 * @author Aldi 
 */
public class Mahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Orang mhs = new Orang();
        
        mhs.buatNama("Aldi Awaludin");
        System.out.println("Nama Mahasiswa : " + mhs.tampilNama());
    }
    
}
