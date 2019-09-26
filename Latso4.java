
package method;
import java.util.Scanner;
public class Latso4 {
    
    /**
     * @param k
     * @param l
     */
    public static void method(double k, double l){
        System.out.println("Kecepatan : " + ( k / l ) + " km/jam ");
        }
    public static void main(String[] args){
        int jarak;
        int waktu;
        Scanner tata = new Scanner(System.in);
        System.out.print("Masukkan jarak : ");
        jarak = tata.nextInt();
        System.out.print("Masukkan waktu : ");
        waktu = tata.nextInt();
        method(jarak,waktu);
        
    }
    
}
