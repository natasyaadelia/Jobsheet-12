
package method;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Latso5 {
    public static void hasil(int k, int l, int m){
        if( k > l && k > m){
            System.out.println("Nilai terbesar "+k);
        }else if( l > k && l > m){
            System.out.println("Nilai terbesar "+l);
        }else if( m > k && m > l){
            System.out.println("Nilai terbesar "+m);
            
            
        }
    
}
public static void main(String[] args){
    Scanner tata = new Scanner(System.in);
    System.out.print("Masukkan bilangan 1 = ");
    int k = tata.nextInt();
    System.out.print("Masukkan bilangan 2 = ");
    int l = tata.nextInt();
    System.out.print("Masukkan bilangan 3 = ");
    int m = tata.nextInt();
    hasil(k,l,m);
}
    }
