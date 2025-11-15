import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int j;
        System.out.print("Masukkan jumlah pesanan: ");
        j = sc.nextInt();
        sc.nextLine();

        String[] nm = new String[j];
        int[] hg = new int[j];

        for (int i = 0; i < nm.length; i++) {
            System.out.print("Nama pesanan ke-" + i + " : ");
            nm[i] = sc.nextLine();

            System.out.print("Harga : ");
            hg[i] = sc.nextInt();
            sc.nextLine();
        }

        int tot = 0;
        for (int i = 0; i < hg.length; i++) {
            tot = tot + hg[i];
        }

        System.out.println("===== DAFTAR =====");
        for (int i = 0; i < nm.length; i++) {
            System.out.println(i + ". " + nm[i] + " - Rp " + hg[i]);
        }

        System.out.println("Total = Rp " + tot);
    }
}
