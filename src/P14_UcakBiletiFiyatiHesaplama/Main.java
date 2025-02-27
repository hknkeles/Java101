package P14_UcakBiletiFiyatiHesaplama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        * Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın;

        📌 Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

        📌 Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.

        📌 Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.

        📌 Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.

        📌 Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
        * */

        int yas, yolculukTipi;
        double km, ucret = 0.10, topUcret;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Yaşınızı giriniz : ");
        yas = scanner.nextInt();
        if (yas<0) {System.out.println("Hatalı veri girdiniz."); return;};

        System.out.print("Yolculuk tipini giriniz (1- Tek gidiş | 2- Gidiş-Dönüş: ");
        yolculukTipi = scanner.nextInt();
        if (yolculukTipi != 1 && yolculukTipi != 2) {System.out.println("Hatalı veri girdiniz."); return;};

        System.out.print("Gidilecek mesafe birimini giriniz (km) : ");
        km = scanner.nextDouble();
        if (km<0) {System.out.println("Hatalı veri girdiniz."); return;};
        scanner.close();

        topUcret = km * ucret;

        if (yas<12){
            topUcret = topUcret / 2;
        } else if (yas >= 12 && yas <= 24) {
            topUcret = topUcret * 0.9;
        } else if (yas>65) {
            topUcret = topUcret * 0.7;
        }


        if (yolculukTipi == 2){
            topUcret = topUcret * 0.8;
            topUcret = topUcret * 2;
        }

        System.out.printf("Bilet fiyatınız: %.2f TL\n", topUcret);

    }
}
