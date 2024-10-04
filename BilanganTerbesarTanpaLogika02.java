import java.util.Scanner;

public class BilanganTerbesarTanpaLogika02 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);
        // Input tiga bilangan
        System.out.print("Masukkan bilangan pertama : ");
        int bil1 = input02.nextInt();
        System.out.print("Masukkan bilangan kedua   : ");
        int bil2 = input02.nextInt();
        System.out.print("Masukkan bilangan ketiga  : ");
        int bil3 = input02.nextInt();
        // Algoritma tanpa menggunakan operator logika
        int terbesar = bil1;  // Asumsikan bil1 yang terbesar
        if (bil2 > terbesar) {
            terbesar = bil2; // Jika bil 2 lebih besar, maka bil2 adalah bilangan yang terbesar
        }
        if (bil3 > terbesar) {
            terbesar = bil3; // Jika bil3 lebih besar, maka bil3 adalah bilngangan yang terbessar
        }
        //OUtput bilangan terbesar
        System.out.println("Maka bilangan terbesar adalah  : " + terbesar);
    }
    
}