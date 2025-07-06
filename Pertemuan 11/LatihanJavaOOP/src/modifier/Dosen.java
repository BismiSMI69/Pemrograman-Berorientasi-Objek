
package modifier;

/**
 *
 * @author Aldi
 */
public class Dosen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Orang dsn = new Orang();
        
        dsn.nama = "Budi";
        
        dsn.buatNama("Budi");
        
        System.out.println("Nama Dosen : " +dsn.tampilNama());
    }
    
}
