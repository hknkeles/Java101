package P5_DaireninAlaniveCevresi;

import java.util.Scanner;

public class AlanveCevre {
    public static void main(String[] args) {

        /*Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

        Alan Formülü : π * r * r;
        Çevre Formülü : 2 * π * r;

        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

        𝜋 sayısını = 3.14 alınız.

        Formül : (𝜋 * (r*r) * 𝛼) / 360
        */

        Scanner scanner = new Scanner(System.in);

        double pi = 3.14;
        double r, alfa, alan, cevre;

        // Yarı çapı kullanıcıdan alalım ve scanner sınıfını kapatalım
        System.out.println("Lütfen dairenin yarı çapını giriniz: ");
        r = scanner.nextDouble();
        scanner.close();

        //Dairenin alanını hesaplayalım
        alan = pi * r * r;

        //Dairenin çevresini hesaplayalım
        cevre = 2 * pi * r;

        // Kullanıcıya bilgisini verelim
        System.out.printf("Dairenin Alanı : %.2f\n", alan);
        System.out.printf("Dairenin Çevresi : %.2f\n", cevre);


    }
}
