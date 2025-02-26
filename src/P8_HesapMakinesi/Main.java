package P8_HesapMakinesi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Switch Case yapısı kullanarak dört işlem yapan hesap makinesi uygulaması yazınız.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen birinci sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();

        System.out.println("Lütfen ikinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        System.out.println("Yapmak istediğiniz işlem tuşuna basınız. ( +, - , * , /");
        String islem = scanner.next();

        switch (islem){
            case "+":
                int toplam = sayi1 + sayi2;
                System.out.println("İşlem Sonucunuz: " + toplam);
                break;
            case "-":
                int fark = sayi1 - sayi2;
                System.out.println("İşlem Sonucunuz: " + fark);
                break;
            case "*":
                int carpim = sayi1 * sayi2;
                System.out.println("İşlem Sonucunuz: " + carpim);
                break;
            case "/":
                if (sayi2==0){
                    System.out.println("Sıfıra bölme işlemi yapılamaz.");
                } else {
                    float bolum = (float) sayi1 / (float) sayi2;
                    System.out.println("İşlem Sonucunuz: " + bolum);
                }
                break;
            default:
                System.out.println("Geçersiz bir işlem türü seçtiniz.");
        }

        scanner.close();

    }
}
