package J3_Donguler.P23_BasamakSayilarininToplaminiBulanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
        Örnek : 1643 = 1 + 6 + 4 + 3 = 14
        * */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        scanner.close();

        int toplam = 0;

        for (int temp = Math.abs(sayi); temp > 0; temp /= 10) {
            toplam += temp % 10;
        }

        System.out.println("Basamak toplamı: " + toplam);



    }



}
