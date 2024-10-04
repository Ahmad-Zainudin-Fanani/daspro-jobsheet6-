import java.util.Scanner;

public class DiskonTokoBuku02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jenis buku dan jumlah buku
        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        String jenisBuku = input.nextLine().toLowerCase();
        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = input.nextInt();

        String diskonDetail = ""; // Untuk menyimpan detail diskon

        // Logika untuk menghitung diskon
        if (jenisBuku.equals("kamus")) {
            // Diskon 10% untuk kamus
            diskonDetail = "10%";
            if (jumlahBuku > 2) {
                // Tambahan diskon 2% jika lebih dari 2 kamus
                diskonDetail += " + 2%";
            }
        } else if (jenisBuku.equals("novel")) {
            // Diskon 7% untuk novel
            diskonDetail = "7%";
            if (jumlahBuku > 3) {
                // Tambahan diskon 2% jika lebih dari 3 novel
                diskonDetail += " + 2%";
            } else {
                // Tambahan diskon 1% jika jumlah novel <= 3
                diskonDetail += " + 1%";
            }
        } else {
            // Diskon 5% untuk buku selain kamus dan novel, jika lebih dari 3 buku
            if (jumlahBuku > 3) {
                diskonDetail = "5%";
            }
        }
        System.out.println("Total diskon: " + diskonDetail);
    }
}
