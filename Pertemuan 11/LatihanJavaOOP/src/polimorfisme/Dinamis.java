
package polimorfisme;

/**
 *
 * @author Aldi
 */
public class Dinamis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Hewan h = new Hewan();
        Kucing k = new Kucing();
        Ayam a = new Ayam();
        
        h.bersuara();
        k.bersuara();
        a.bersuara();
    }
    
}
