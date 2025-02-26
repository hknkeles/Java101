package KDVTutariUygulamasi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Tutarı giriniz: ");
        double tutar = scanner.nextDouble();
        scanner.close();

        double kdvOrani = (tutar > 1000) ? 0.08 : 0.18;
        double kdvTutari = tutar * kdvOrani;
        double kdvliTutar = tutar + kdvTutari;

        System.out.printf("KDV Oranı: %.0f%%\nKDV Tutarı: %.2f TL\nKDV'li Fiyat: %.2f TL\n", kdvOrani * 100, kdvTutari, kdvliTutar);

    }
}
