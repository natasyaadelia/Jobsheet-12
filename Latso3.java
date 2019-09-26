
package method;

public class Latso3 {
    public static int a(){
        return 0;
    }
    public static int a(int b){
        return b;
    }
    public static int a(int b, int c){
        return b+c;
    }
    public static int a(int b, int c, int d){
        return b+c+d;
    }
    public static double a(double b, int c, int d){
        return b*c+d;
    }
    public static void main(String[] args){
        int x;
        x = a();
        System.out.println(x);
        System.out.println(a(7));
        System.out.println(a(4,6));
        System.out.println(a(6,8,9));
        System.out.println(a(2.7,8,9));
    }
    
}
