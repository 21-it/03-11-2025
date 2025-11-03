import java.util.Scanner;

public class SoalUklSedangNomorSatu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan bilangan positif: ");
        int n = in.nextInt();

        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }

        System.out.println("Faktorial dari " + n + "! = " + hasil);
    }
}
