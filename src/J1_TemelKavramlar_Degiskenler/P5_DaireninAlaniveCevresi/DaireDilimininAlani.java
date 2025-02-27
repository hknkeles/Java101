package J1_TemelKavramlar_Degiskenler.P5_DaireninAlaniveCevresi;

import java.util.Scanner;

public class DaireDilimininAlani {
    public static void main(String[] args) {
        /*
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

        𝜋 sayısını = 3.14 alınız.

        Formül : (𝜋 * (r*r) * 𝛼) / 360
        */

        Scanner scanner = new Scanner(System.in);

        double pi = 3.14;
        double r, alfa, alan;

        // Yarı çapı kullanıcıdan alalım ve scanner sınıfını kapatalım
        System.out.println("Lütfen dairenin yarı çapını giriniz: ");
        r = scanner.nextDouble();

        System.out.println("Lütfen dairenin merkez açsının ölçüsünü giriniz: ");
        alfa = scanner.nextDouble();

        scanner.close();

        // Hesaplamasını yapalım
        alan = (pi * (r * r) * alfa) / 360;

        System.out.printf("Dairenin Alanı : %.2f\n", alan);

    }
}
