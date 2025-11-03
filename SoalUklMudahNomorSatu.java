
import java.util.Scanner;

public class SoalUklMudahNomorSatu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Berat paket (kg): ");
        double berat = in.nextDouble();

        System.out.print("Jarak (km): ");
        double jarak = in.nextDouble();

        System.out.print("Panjang (cm): ");
        double p = in.nextDouble();
        System.out.print("Lebar (cm): ");
        double l = in.nextDouble();
        System.out.print("Tinggi (cm): ");
        double t = in.nextDouble();

        double volume = p * l * t;
        double biayaPerKg = (jarak <= 10) ? 4250 : 6000;
        double total = berat * biayaPerKg;

        if (volume > 100) {
            total += 50000;
        }

        System.out.println("Volume paket: " + volume + " cm³");
        System.out.println("Total biaya pengiriman: Rp " + total);
    }
}