

import java.util.Scanner;

public class SoalUklMudahNomorDua {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int n = in.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " adalah bilangan genap.");
        } else {
            System.out.println(n + " adalah bilangan ganjil.");
        }
    }
}