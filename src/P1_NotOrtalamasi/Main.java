package P1_NotOrtalamasi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float mat, fizik, kimya, turkce, tarih, muzik, ort;


        System.out.print("Lütfen Matematik ders notunuzu giriniz:");
        mat = scanner.nextFloat();

        System.out.print("Lütfen Fizik ders notunuzu giriniz:");
        fizik = scanner.nextFloat();

        System.out.print("Lütfen Kimya ders notunuzu giriniz:");
        kimya = scanner.nextFloat();

        System.out.print("Lütfen Türkçe ders notunuzu giriniz:");
        turkce = scanner.nextFloat();

        System.out.print("Lütfen Tarih ders notunuzu giriniz:");
        tarih = scanner.nextFloat();

        System.out.print("Lütfen Müzik ders notunuzu giriniz:");
        muzik = scanner.nextFloat();

        scanner.close();

        ort = (mat + fizik + kimya + turkce + tarih + muzik) / 6;

        System.out.printf("Not Ortalamanız: %.2f\n%s", ort, (ort > 60) ? "Tebrikler sınıfı geçtiniz." : "Malesef, sınıfta kaldınız.!!");
    }
}
