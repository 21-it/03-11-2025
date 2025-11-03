import java.util.Scanner;

public class SoalUklSulitNomorSatu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int n = in.nextInt();

        double total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Nilai siswa ke-" + i + ": ");
            total += in.nextDouble();
        }

        double rata = total / n;
        System.out.println("Rata-rata nilai: " + rata);
    }
}