package J2_KosulluIfadeler_KodBloklari.P9_KullaniciSifreKontrolUygulamasi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        📌Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun.

        📌Eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin unuttuğu şifre ile aynı olmaması gerektiğini kontrol edin.

        📌Şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." yazdırın.

        📌Sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
        */

        Scanner scanner = new Scanner(System.in);

        // Varsayılan Kullanıcı adı ve şifresi
        String kullaniciAdi = "Hakan", kullaniciSifre = "Hakan.123", kontrol;

        while (true){
            System.out.println("Lütfen Kullanıcı Adınızı giriniz.");
            String input = scanner.next().trim();

            System.out.println("Lütfen şifrenizi giriniz.");
            String sifre = scanner.next().trim();

            if (input.equals(kullaniciAdi) && sifre.equals(kullaniciSifre)){
                System.out.println("Sayın, " + input + " Hoşgeldiniz...");
                break; // Giriş başarılı döngüyü sonlandır
            } else {
                System.out.println("Kullanıcı adınız veya şifreniz hatalı");
                System.out.println("Şifrenizi sıfırlamak istiyor musunuz? Evet(e) - Hayır(h)");
                kontrol = scanner.next().trim();

                switch (kontrol){
                    case "e","evet" -> {
                            System.out.print("Yeni şifrenizi giriniz: ");
                            String yeniSifre = scanner.next();

                            if (yeniSifre.equals(kullaniciSifre)){
                                System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.\n");
                                continue;
                            } else {
                                kullaniciSifre = yeniSifre;
                                System.out.println("Şifre Oluşturuldu. \n");
                                break;
                            }
                    }
                    case "h", "hayır" -> {
                        System.out.println("Şifre sıfırlama işlemi iptal edildi.\n");
                        break; // Şifre sıfırlama iptal edilirse döngüye devam et
                    }
                    default -> System.out.println("Geçersiz seçim, lütfen tekrar deneyin.");


                }
            }

        }
        scanner.close();
    }
}
