import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik",
            "Cappucino", "Chocolate Ice"
        };

        System.out.print("Masukkan makanan yang dicari: ");
        String key = sc.nextLine();

        int i;
        for (i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(key)) {
                System.out.println("Menu ditemukan");
                break;
            }
        }

        if (i == menu.length) {
            System.out.println("Menu tidak ditemukan");
        }
    }
}
