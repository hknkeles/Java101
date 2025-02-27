package J3_Donguler.P19_GirilenSayilarinCiftveDordunKatlarınıToplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
        ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.*/

        int input, toplam=0;
        String sayilar = "";

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Sayi Giriniz : ");
            input = scanner.nextInt();

            if (input %2 == 1){
                System.out.println("Tek sayı girmiş olmanız nedeni ile ugulamadan çıkılıyor");
                break;
            }

            if (input %2 == 0 && input %4 == 0){
                toplam = toplam + input;
                sayilar = sayilar + "," + input;
            }

        }
        scanner.close();

        if (toplam==0){
            System.out.println("Toplanacak sayı bulunmamaktadır.");
        }else {
            System.out.println("Toplama alınacak sayılar : " + sayilar);
            System.out.println("Toplam : " + toplam);
        }


    }
}
