public class SearchNilai10 {
    public static void main(String[] args) {
        int[] nilai = {80, 70, 90, 85, 60};
        int key = 90;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Key ditemukan pada indeks ke-" + i);
                break;
            }
        }
    }
}
