import java.util.Scanner;

public class ArrayNilai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        // Input nilai
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + ": ");
            nilaiAkhir[i] = sc.nextInt();
        }

        // Tampilkan semua nilai
        System.out.println("\n=== Daftar Nilai Akhir ===");
        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai akhir ke-" + i + " adalah " + nilaiAkhir[i]);
        }
    }
}
