package J1_TemelKavramlar_Degiskenler.P4_TaksimetreProgrami;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir
        */
        Scanner scanner = new Scanner(System.in);

        double gidilenMesafe, acilisUcreti=10, tutar;
        float km = 2.20f;

        System.out.println("Gidilen mesafe bilgisini km olarak giriniz.");
        gidilenMesafe = scanner.nextDouble();
        scanner.close();

        tutar = acilisUcreti + (gidilenMesafe * km);

        System.out.printf("Ödenecek tutar : %.2f", (tutar<=20) ? 20 : tutar);


    }
}
