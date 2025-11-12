import java.util.Scanner;
public class ArrayRataNilai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        int[] nilaiMhs = new int[jumlah];
        int total = 0;
        double rata2;

for (int i = 0; i < jumlah; i++) {
    System.out.print("Nilai mahasiswa ke-" + (i+1) + ": ");
    nilaiMhs[i] = sc.nextInt();
    total += nilaiMhs[i];
}


    int lulus = 0;
for (int i = 0; i < nilaiMhs.length; i++) {
    if (nilaiMhs[i] > 70) {
        lulus++;
    }
}
        System.out.println("Jumlah mahasiswa yang lulus = " + lulus);

        rata2 = total / nilaiMhs.length;

        System.out.println("\nTotal nilai = " + total);
        System.out.println("Rata-rata nilai = " + rata2);
    }
}
