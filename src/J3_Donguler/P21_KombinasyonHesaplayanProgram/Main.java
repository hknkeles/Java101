package J3_Donguler.P21_KombinasyonHesaplayanProgram;

import java.util.Scanner;

public class Main {

    // Faktoriyet hesaplama metodu
    public static int faktoriyel(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {

        /*
        * N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
        *  N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

        Java ile kombinasyon hesaplayan program yazınız.

        Kombinasyon formülü

        C(n,r) = n! / (r! * (n-r)!)

        * */

        int n, r;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç Elamanlı Küme Olsun : ");
        n = scanner.nextInt();

        System.out.print("Kaç Elemanlı Grup olsun: ");
        r = scanner.nextInt();
        scanner.close();

        int sonuc = faktoriyel(n) / (faktoriyel(r) * faktoriyel(n-r));

        System.out.println(sonuc);


    }


}
