
package method;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        System.out.println("Kalkulator Sederhana");
        System.out.println("\n");
        System.out.println("Penjumlahan : " +penjumlahan());
        System.out.println("Pengurangan : " +pengurangan());
        System.out.println("Perkalian : " +perkalian(5, 10));
        System.out.println("Pembagian : " +pembagian());
        System.out.println("Sisa Hasil Bagi : " +sisahasilbagi(9, 10));
    }
    public static int penjumlahan(){
        System.out.println(" PENJUMLAHAN ");
        int bil1 = 10;
        int bil2 = 15;
        int hasil = bil1+bil2;
        return hasil;
    }
    public static int pengurangan(){
        System.out.println(" PENGURANGAN ");
        int bil1 = 15;
        int bil2 = 5;
        int hasil = bil1-bil2;
        return hasil;
    }
    public static int perkalian(int bil1, int bil2){
        System.out.println(" PERKALIAN ");
        int hasil = bil1*bil2;
        return hasil;
    }
    public static double pembagian(){
        System.out.println(" PEMBAGIAN ");
        double bil1 = 100;
        double bil2 = 7;
        double hasil = bil1/bil2;
        return hasil;
    }
    public static int sisahasilbagi(int bil1, int bil2){
        System.out.println(" SISA HASIL BAGI ");
        if( bil1 > bil2 ){
            System.out.println("Sisa hasil bagi : " + bil1 % bil2);
        } else if( bil1 < bil2 ){
            System.out.println("Sisa hasil baginya : hasil tidak ditemukan");
        }
        return 0;
}
}
