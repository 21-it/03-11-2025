import java.util.Scanner;

public class SoalUklSedangNomorDua {
    static double hitungVolume(double r, double t) {
        return Math.PI * r * r * t;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jari-jari tabung: ");
        double r = in.nextDouble();

        System.out.print("Masukkan tinggi tabung: ");
        double t = in.nextDouble();

        double volume = hitungVolume(r, t);
        System.out.println("Volume tabung = " + volume);
    }
}