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
        for (int i = 0; i < nilaiAkhir.length; i++) {
    if (nilaiAkhir[i] > 70) {
        System.out.println("Mahasiswa ke-" + (i+1) + " : LULUS");
    } else {
        System.out.println("Mahasiswa ke-" + (i+1) + " : TIDAK LULUS");
    }
}

    }

        }

