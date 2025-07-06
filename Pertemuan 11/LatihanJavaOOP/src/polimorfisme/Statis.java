
package polimorfisme;

/**
 *
 * @author Aldi
 */
public class Statis {
    
    static int penjumlahan(int x, int y){
        return x + y;
    }
    
    static double penjumlahan(double x, double y){
        return x + y;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int hasil1 = penjumlahan(10, 8);
        double hasil2 = penjumlahan(12.5, 2.5);
        
        System.out.println("Hasil Penjumlahan (int) : " + hasil1);
        System.out.println("Hasil Penjumlahan (double) : " + hasil2);
    }
    
}
