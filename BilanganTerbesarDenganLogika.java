import java.util.Scanner;

public class BilanganTerbesarDenganLogika {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);
        
        // Input tiga bilangan
        System.out.print("Masukkan bilangan pertama : ");
        int bil1 = input02.nextInt();
        System.out.print("Masukkan bilangan kedua   : ");
        int bil2 = input02.nextInt();
        System.out.print("Masukkan bilangan ketiga  : ");
        int bil3 = input02.nextInt();
        
        // Algoritma menggunakan operator logika
        int terbesar;
        if (bil1 >= bil2 && bil1 >= bil3) {
            terbesar = bil1;
        } else if (bil2 >= bil1 && bil2 >= bil3) {
            terbesar = bil2;
        } else {
            terbesar = bil3;
        }
        
        // Output bilangan terbesar
        System.out.println("Maka bilangan terbesar adalah   : " + terbesar);
    }
}
