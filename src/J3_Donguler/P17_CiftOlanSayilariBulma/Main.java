package J3_Donguler.P17_CiftOlanSayilariBulma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    /*
    * Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazınız.

    ❗Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
    * */

        int input, toplam=0, sayac=0;
        float ortalama;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        input = scanner.nextInt();
        scanner.close();

        // çift olan sayıları bulma
        System.out.print("Çift Sayılar => ");
        for (int i = 0; i <= input; i++) {
            if (i %2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");


        //3 ve 4'e tam bölünen sayıların ortalaması
        System.out.print("3 ve 4'e bölünen sayılar:  => ");

        for (int i = 1; i <= input; i++) {
            if (i %3 == 0 && i %4 == 0){
                System.out.print(i + " ");
                toplam = toplam+i;
                sayac++;
            }
        }

        //Eğer sayac sıfır olursa yani 3'e ve 4'e bölünecek sayı olmaz ise kontrolü
        if (sayac>0){
            System.out.print("\n3 ve 4'e bölünen sayıların ortalaması:  => " + (double)toplam / sayac);
        }else {
            System.out.println("\n3 ve 4'e bölünen bir sayı bulunamadı.");
        }

    }

}
