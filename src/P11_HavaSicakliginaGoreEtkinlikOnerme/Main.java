package P11_HavaSicakliginaGoreEtkinlikOnerme;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Koşullar :

        📌 Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.

        📌 Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.

        📌 Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.

        📌 Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

        ❗Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.

        */

        Scanner scanner = new Scanner(System.in);

        //Sıcaklık değeri için değişken tanımlayalım
        int sicaklik;

        // Kullanıcıdan sıcaklık değerini alalım
        System.out.println("Sıcaklık değerini giriniz : ");
        sicaklik = scanner.nextInt();


        // Aldığımız sıcaklık değerine göre etkinlikleri planlayalım

        if (sicaklik<=5){
            System.out.println("Sıcaklık değeri " + sicaklik + ". Bu koşulda Kayak yapmanızı öneririm.");
        } else if (sicaklik>5 && sicaklik<=15){
            System.out.println("Sıcaklık değeri " + sicaklik + ". Bu koşulda Sinemaya gitmenizi öneririm.");
        } else if (sicaklik>15 && sicaklik<=25) {
            System.out.println("Sıcaklık değeri " + sicaklik + ". Bu koşulda Piknik yapmanızı öneririm.");
        } else if (sicaklik>25) {
            System.out.println("Sıcaklık değeri " + sicaklik + ". Bu koşulda Yüzmeye gitmenizi öneririm.");
        }

        scanner.close();


        /*
        * Başkaca if kullanımı
        *
                if (sicaklik < 5) {
                    System.out.println("Kayak yapmanızı öneririm.");
                } else if (sicaklik <= 15) {
                    System.out.println("Sinemaya gitmenizi öneririm.");
                } else if (sicaklik <= 25) {
                    System.out.println("Piknik yapmanızı öneririm.");
                } else {
                    System.out.println("Yüzmeye gitmenizi öneririm.");
                }
        * */


    }
}
