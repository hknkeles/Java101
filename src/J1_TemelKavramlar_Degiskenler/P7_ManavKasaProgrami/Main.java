package J1_TemelKavramlar_Degiskenler.P7_ManavKasaProgrami;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

        Meyveler ve KG Fiyatları

        📌 Armut : 2,14 TL
        📌 Elma : 3,67 TL
        📌 Domates : 1,11 TL
        📌 Muz: 0,95 TL
        📌 Patlıcan : 5,00 TL
        */

        Scanner scanner = new Scanner(System.in);

        // Ürün fiyatlarını tanımlayalım
        float armut = 2.14f, elma = 3.67f, domates = 1.11f, muz = 0.95f, patlican = 5, toplamTutar;

        // Alınan miktarları tutmak için değişkenler
        float armutMiktar, elmaMiktar, domatesMiktar, muzMiktar, patlicanMiktar;

        System.out.println("MANAVA HOŞGELDİNİZ");
        System.out.printf("Armut KG FİYATI: %.2f\n",armut);
        System.out.printf("Elma KG FİYATI: %.2f\n", elma);
        System.out.printf("Domates KG FİYATI: %.2f\n", domates);
        System.out.printf("Muz KG FİYATI: %.2f\n", muz);
        System.out.printf("PATLICAN KG FİYATI: %.2f\n", patlican);
        System.out.println("---------------------------------");


        System.out.print("Armuttan kaç kilo almak istersiniz: ");
        armutMiktar = scanner.nextFloat();

        System.out.print("Elma'dan kaç kilo almak istersiniz:");
        elmaMiktar = scanner.nextFloat();

        System.out.print("Domates'ten kaç kilo almak istersiniz:");
        domatesMiktar = scanner.nextFloat();

        System.out.print("Muz'dan kaç kilo almak istersiniz:");
        muzMiktar = scanner.nextFloat();

        System.out.print("Patlıcan'dan kaç kilo almak istersiniz:");
        patlicanMiktar =  scanner.nextFloat();

        //Toplam tutarı hesaplayalım
        toplamTutar = armut * armutMiktar + elma * elmaMiktar + domates * domatesMiktar + muz * muzMiktar + patlican  *patlicanMiktar;

        System.out.printf("Ödemeniz gereken toplam tutar: %.2f", toplamTutar);

        scanner.close();
    }
}
