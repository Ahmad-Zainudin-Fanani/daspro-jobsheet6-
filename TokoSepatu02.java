import java.util.Scanner;

public class TokoSepatu02 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        // Menampilkan penjelasan tentang ukuran sepatu
        System.out.println("Keterangan Ukuran Sepatu:");
        System.out.println("1. Specs - Slip On: 36-40");
        System.out.println("2. Specs - High Top: 40-44");
        System.out.println("3. 910 - Woman: 36-41");
        System.out.println("4. 910 - Man: 41-44");
        System.out.println("5. Ortus - Kids: 36-40");
        System.out.println("6. Ortus - Adult: 40-44");
        System.out.println();

        // Input merk, kategori, dan ukuran
        System.out.print("Masukkan merk sepatu (Specs/910/Ortus): ");
        String merk = input02.next().toLowerCase();
        System.out.print("Masukkan kategori sepatu (Slip On/High Top/Woman/Man/Kids/Adult): ");
        String kategori = input02.next().toLowerCase();
        System.out.print("Masukkan ukuran sepatu: ");
        int ukuran = input02.nextInt(); 

        // Variabel untuk menyimpan harga
        int harga = 0;

        // Menggunakan switch untuk menentukan harga
        switch (merk) {
            case "specs":
                switch (kategori) {
                    case "slip on":
                        switch (ukuran) {
                            case 36: case 37: case 38: case 39: case 40:
                                harga = 800000;
                                break;
                        }
                        break;
                    case "high top":
                        switch (ukuran) {
                            case 40: case 41: case 42: case 43: case 44:
                                harga = 1200000;
                                break;
                        }
                        break;
                }
                break;

            case "910":
                switch (kategori) {
                    case "woman":
                        switch (ukuran) {
                            case 36: case 37: case 38: case 39: case 40: case 41:
                                harga = 1000000;
                                break;
                        }
                        break;
                    case "man":
                        switch (ukuran) {
                            case 41: case 42: case 43: case 44:
                                harga = 1800000;
                                break;
                        }
                        break;
                }
                break;

            case "ortus":
                switch (kategori) {
                    case "kids":
                        switch (ukuran) {
                            case 36: case 37: case 38: case 39: case 40:
                                harga = 750000;
                                break;
                        }
                        break;
                    case "adult":
                        switch (ukuran) {
                            case 40: case 41: case 42: case 43: case 44:
                                harga = 1500000;
                                break;
                        }
                        break;
                }
                break;
        }

        // Output harga
        if (harga > 0) {
            System.out.println("Harga sepatu: Rp " + harga);
        } else {
            System.out.println("Sepatu tidak ditemukan atau ukuran tidak valid.");
        }

    }
}
