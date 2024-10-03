import java.util.Scanner;

public class Pemilihan2Percobaan102 {

    public static void main(String[] args) {
        // Deklarasi scanner
        Scanner input02 = new Scanner(System.in);

        System.out.print("Masukkan tahun: ");
        int tahun = input02.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) == 0) {
                if ((tahun % 400) == 0) {
                    System.out.println("Tahun Kabisat");
                }
            }
            if ((tahun % 100) != 0) {
                System.out.println("Tahun Kabisat");
            }
        }
        if ((tahun % 4) != 0) {
            System.out.println("Bukan Tahun Kabisat");
        }
        if ((tahun % 100) == 0 && (tahun % 400) != 0) {
            System.out.println("Bukan Tahun Kabisat");
        }

        input02.close();
    }
}
