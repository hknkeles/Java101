package J3_Donguler.P18_TekSayilarinToplaminiBulanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve
        // girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.

        int input, toplam=0;
        String sayilar = "";

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Bir Sayı Giriniz :");
            input = scanner.nextInt();
            if (input<0) {
                System.out.println("Negatif sayı girmeniz nedeni ile uygulamadan çıkılıyor");
               break;
            } else if (input %2 ==1) {
                sayilar = sayilar + input + ",";
                toplam = toplam + input;
            }
        }while (true);
        scanner.close();

        System.out.println("Toplanacak sayılar : " + sayilar);
        System.out.println("Toplam : " + toplam);

    }
}
