import java.util.Scanner;

public class SearchNilai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilai = new int[5];
        int key;
        int i;

        // Input elemen array
        for (i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + i + " : ");
            nilai[i] = sc.nextInt();
        }

        // Input nilai yang ingin dicari
        System.out.print("Masukkan nilai yang ingin dicari: ");
        key = sc.nextInt();

        // Proses pencarian
        for (i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                break;
            }
        }

        // Mengecek apakah data tidak ditemukan
        if (i == nilai.length) {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
    }
}
