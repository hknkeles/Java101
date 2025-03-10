

### 📖 PRATİK 1 - Not Ortalaması
<hr>

#### ❓SORU 
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

❗Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

🟩 **CEVAP**
<details>
  <summary>Kodu görmek için tıklayınız.</summary>

```JAVA
package J1_TemelKavramlar_Degiskenler.P1_NotOrtalamasi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float mat, fizik, kimya, turkce, tarih, muzik, ort;


        System.out.print("Lütfen Matematik ders notunuzu giriniz:");
        mat = scanner.nextFloat();

        System.out.print("Lütfen Fizik ders notunuzu giriniz:");
        fizik = scanner.nextFloat();

        System.out.print("Lütfen Kimya ders notunuzu giriniz:");
        kimya = scanner.nextFloat();

        System.out.print("Lütfen Türkçe ders notunuzu giriniz:");
        turkce = scanner.nextFloat();

        System.out.print("Lütfen Tarih ders notunuzu giriniz:");
        tarih = scanner.nextFloat();

        System.out.print("Lütfen Müzik ders notunuzu giriniz:");
        muzik = scanner.nextFloat();

        scanner.close();

        ort = (mat + fizik + kimya + turkce + tarih + muzik) / 6;

        System.out.printf("Not Ortalamanız: %.2f\n%s", ort, (ort > 60) ? "Tebrikler sınıfı geçtiniz." : "Malesef, sınıfta kaldınız.!!");
    }
}
```
</details>
<hr>

### 📖 PRATİK 2 - KDV Hesaplama Uygulaması
<hr>

#### ❓SORU
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

📌KDV'siz Fiyat = 10;

📌KDV'li Fiyat = 11.8;

📌KDV tutarı = 1.8;

---
❗Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

🟩 **CEVAP**
<details>
  <summary>Kodu görmek için tıklayınız.</summary>

```JAVA
package J1_TemelKavramlar_Degiskenler.P2_KDVTutariUygulamasi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Tutarı giriniz: ");
        double tutar = scanner.nextDouble();
        scanner.close();

        double kdvOrani = (tutar > 1000) ? 0.08 : 0.18;
        double kdvTutari = tutar * kdvOrani;
        double kdvliTutar = tutar + kdvTutari;

        System.out.printf("KDV Oranı: %.0f%%\nKDV Tutarı: %.2f TL\nKDV'li Fiyat: %.2f TL\n", kdvOrani * 100, kdvTutari, kdvliTutar);

    }
}
```
</details>
<hr>


### 📖  PRATİK 3 - Dik Üçgende Hipotenüsü ve Üçgende Alanı Hesaplama
<hr>

#### ❓SORU
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

(a\*a) + (b\*b) = c*c

---
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

**Formül
Üçgenin Çevresi**

u = (a+b+c) / 2

**Alan**
$$
\sqrt{u×(u−a)×(u−b)×(u−c)}
$$

🟩 **CEVAP**

<details>
  <summary>Kodu görmek için tıklayınız. (Hipotenüs Hesaplama)</summary>

```JAVA
package J1_TemelKavramlar_Degiskenler.P3_DikUcgendeHipotenusveAlan;

import java.util.Scanner;

public class HipotenusHesaplama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int kenar1, kenar2;
        double kenar3;

        System.out.println("Lütfen dik kenarların uzunluklarını giriniz.");
        System.out.println("Birinci kenar uzunluğu: ");
        kenar1 = scanner.nextInt();
        System.out.println("İkinci kenar uzunluğu: ");
        kenar2 = scanner.nextInt();

        kenar3 = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));

        System.out.printf("Hipotenüs: %.2f", kenar3);
    }
}
```
</details>

<details>
  <summary>Kodu görmek için tıklayınız. (Alan Hesaplama)</summary>

```JAVA
package J1_TemelKavramlar_Degiskenler.P3_DikUcgendeHipotenusveAlan;

import java.util.Scanner;

public class UcgenAlaniHesaplama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int kenar1, kenar2, kenar3;
        double cevre, alan;

        System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz.");
        System.out.println("Birinci kenar uzunluğu: ");
        kenar1 = scanner.nextInt();
        System.out.println("İkinci kenar uzunluğu: ");
        kenar2 = scanner.nextInt();
        System.out.println("Üçüncü kenar uzunluğu: ");
        kenar3 = scanner.nextInt();

        // Üçgenin çevresini bulalım
        cevre = (kenar1 + kenar2 + kenar3) / 2;

        // Üçgenin alanını bulalım

        alan = Math.sqrt(cevre * (cevre - kenar1) * (cevre - kenar2) * (cevre - kenar3));

        System.out.printf("üçgenin Alanı: %.2f", alan);


    }
}

```
</details>
<hr>


### 📖 PRATİK 4 - Taksimetre Programı
<hr>

#### ❓SORU

Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

📌Taksimetre KM başına 2.20 TL tutmaktadır.

📌Minimum ödenecek tutar 20 TL'dir.

📌20 TL altında ki ücretlerde yine 20 TL alınacaktır.

📌Taksimetre açılış ücreti 10 TL'dir

🟩 **CEVAP**
<details>
  <summary>Kodu görmek için tıklayınız.</summary>

```JAVA
package J1_TemelKavramlar_Degiskenler.P4_TaksimetreProgrami;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir
        */
        Scanner scanner = new Scanner(System.in);

        double gidilenMesafe, acilisUcreti = 10, tutar;
        float km = 2.20f;

        System.out.println("Gidilen mesafe bilgisini km olarak giriniz.");
        gidilenMesafe = scanner.nextDouble();
        scanner.close();

        tutar = acilisUcreti + (gidilenMesafe * km);

        System.out.printf("Ödenecek tutar : %.2f", (tutar <= 20) ? 20 : tutar);


    }
}
```
</details>
<hr>


### 📖 PRATİK 5 - Dairenin Alanını ve Çevresini Hesaplayan Program
<hr>

#### ❓SORU

Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

**Alan Formülü :** π * r * r;

**Çevre Formülü :** 2 * π * r;

---
❗Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

**𝜋 sayısını** = 3.14 alınız.

**Formül :** (𝜋 * (r*r) * 𝛼) / 360

🟩 **CEVAP**
<details>
  <summary>Kodu görmek için tıklayınız. (Alan ve Çevre Hesaplama)</summary>

```JAVA
package J1_TemelKavramlar_Degiskenler.P5_DaireninAlaniveCevresi;

import java.util.Scanner;

public class AlanveCevre {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double pi = 3.14;
        double r, alfa, alan, cevre;

        // Yarı çapı kullanıcıdan alalım ve scanner sınıfını kapatalım
        System.out.println("Lütfen dairenin yarı çapını giriniz: ");
        r = scanner.nextDouble();
        scanner.close();

        //Dairenin alanını hesaplayalım
        alan = pi * r * r;

        //Dairenin çevresini hesaplayalım
        cevre = 2 * pi * r;

        // Kullanıcıya bilgisini verelim
        System.out.printf("Dairenin Alanı : %.2f\n", alan);
        System.out.printf("Dairenin Çevresi : %.2f\n", cevre);


    }
}

```
</details>
<details>
  <summary>Kodu görmek için tıklayınız. (Daire Diliminin Alanını Hesaplama)</summary>

```JAVA
package J1_TemelKavramlar_Degiskenler.P5_DaireninAlaniveCevresi;

import java.util.Scanner;

public class DaireDilimininAlani {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double pi = 3.14;
        double r, alfa, alan;

        // Yarı çapı kullanıcıdan alalım ve scanner sınıfını kapatalım
        System.out.println("Lütfen dairenin yarı çapını giriniz: ");
        r = scanner.nextDouble();

        System.out.println("Lütfen dairenin merkez açsının ölçüsünü giriniz: ");
        alfa = scanner.nextDouble();

        scanner.close();

        // Hesaplamasını yapalım
        alan = (pi * (r * r) * alfa) / 360;

        System.out.printf("Dairenin Alanı : %.2f\n", alan);

    }
}


```
</details>
<hr>

### 📖 PRATİK 6 - Vücut Kitle İndeksi Hesaplayan Program
<hr>

#### ❓SORU

Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

---
❗**Formül**

Kilo (kg) / Boy(m) * Boy(m)

🟩 **CEVAP**
<details>
  <summary>Kodu görmek için tıklayınız.</summary>

```JAVA
package J1_TemelKavramlar_Degiskenler.P6_VucutKitleIndeksi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Değişkenleri tanımlayalım
        float kilo, boy, index;

        // Kullanıcıdan bilgileri alalım
        System.out.println("Lütfen boy ölçünüzü giriniz: ");
        boy = scanner.nextFloat();

        //Hatalı boy bilgisi girilmesi halinde
        if (boy <= 0) {
            System.out.println("Boy ölçünüzü hatalı girmeniz nedeni ile program sonlandırılıyor.");
            scanner.close();
            return;
        }

        System.out.println("Lütfen kilo bilginizi giriniz: ");
        kilo = scanner.nextFloat();

        //Hatalı kilo bilgisi girilmesi halinde
        if (boy <= 0) {
            System.out.println("Kilo bilginizi hatalı girmeniz nedeni ile program sonlandırılıyor.");
            scanner.close();
            return;
        }

        //Hesaplamasını yapalım
        index = kilo / (boy * boy);

        //Kullanıcıya bilgi verelim.
        System.out.println("Vücut Kitle İndeks Bilgileriniz");
        System.out.printf("Boy: %.2f\n", boy);
        System.out.printf("Kilo: %.2f\n", kilo);
        System.out.printf("Vücut Kitle İndeksiniz : %.2f\n", index);

        //Scanner sınıfını kapatalım
        scanner.close();


    }
}

```
</details>
<hr>


### 📖 PRATİK 7 - Manav Kasa Programı
<hr>

#### ❓SORU

Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

*Meyveler ve KG Fiyatları*

📌 Armut : 2,14 TL

📌 Elma : 3,67 TL

📌 Domates : 1,11 TL

📌 Muz: 0,95 TL

📌 Patlıcan : 5,00 TL

**Örnek Çıktı**
``` 
Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL
```

🟩 **CEVAP**
<details>
  <summary>Kodu görmek için tıklayınız.</summary>

```JAVA
package J1_TemelKavramlar_Degiskenler.P7_ManavKasaProgrami;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ürün fiyatlarını tanımlayalım
        float armut = 2.14f, elma = 3.67f, domates = 1.11f, muz = 0.95f, patlican = 5, toplamTutar;

        // Alınan miktarları tutmak için değişkenler
        float armutMiktar, elmaMiktar, domatesMiktar, muzMiktar, patlicanMiktar;

        System.out.println("MANAVA HOŞGELDİNİZ");
        System.out.printf("Armut KG FİYATI: %.2f\n", armut);
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
        patlicanMiktar = scanner.nextFloat();

        //Toplam tutarı hesaplayalım
        toplamTutar = armut * armutMiktar + elma * elmaMiktar + domates * domatesMiktar + muz * muzMiktar + patlican * patlicanMiktar;

        System.out.printf("Ödemeniz gereken toplam tutar: %.2f", toplamTutar);
    }
}

```
</details>
<hr>


### 📖 PRATİK 8 - Hesap Makinesi Programı
<hr>

#### ❓SORU

Switch Case yapısı kullanarak dört işlem yapan hesap makinesi uygulaması yazınız.


🟩 **CEVAP**
<details>
  <summary>Kodu görmek için tıklayınız.</summary>

```JAVA
package J2_KosulluIfadeler_KodBloklari.P8_HesapMakinesi;

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

        switch (islem) {
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
                if (sayi2 == 0) {
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

```
</details>
<hr>

### 📖 PRATİK 9 - Kullanıcı Şifre Kontrol Uygulaması
<hr>

#### ❓SORU

📌Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun. 

📌Eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin unuttuğu şifre ile aynı olmaması gerektiğini kontrol edin.

📌Şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." yazdırın.

📌Sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.



🟩 **CEVAP**
<details>
  <summary>Kodu görmek için tıklayınız.</summary>

```JAVA
package J2_KosulluIfadeler_KodBloklari.P9_KullaniciSifreKontrolUygulamasi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Varsayılan Kullanıcı adı ve şifresi
        String kullaniciAdi = "Hakan", kullaniciSifre = "Hakan.123", kontrol;

        while (true) {
            System.out.println("Lütfen Kullanıcı Adınızı giriniz.");
            String input = scanner.next().trim();

            System.out.println("Lütfen şifrenizi giriniz.");
            String sifre = scanner.next().trim();

            if (input.equals(kullaniciAdi) && sifre.equals(kullaniciSifre)) {
                System.out.println("Sayın, " + input + " Hoşgeldiniz...");
                break; // Giriş başarılı döngüyü sonlandır
            } else {
                System.out.println("Kullanıcı adınız veya şifreniz hatalı");
                System.out.println("Şifrenizi sıfırlamak istiyor musunuz? Evet(e) - Hayır(h)");
                kontrol = scanner.next().trim();

                switch (kontrol) {
                    case "e", "evet" -> {
                        System.out.print("Yeni şifrenizi giriniz: ");
                        String yeniSifre = scanner.next();

                        if (yeniSifre.equals(kullaniciSifre)) {
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

```
</details>
<hr>


### 📖 PRATİK 10 - Sınıf Geçme Durumunu Hesaplayan Program
<hr>

#### ❓SORU

Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

---
❗Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.

🟩 **CEVAP**
<details>
  <summary>Kodu görmek için tıklayınız.</summary>

```JAVA
package J2_KosulluIfadeler_KodBloklari.P10_SinifGecmeDurumuHesaplama;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        /*Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

        Geçme Notu : 55

        ❗Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
        */

        Scanner scanner = new Scanner(System.in);

        // Notlar için değişkenler oluşturalım
        float matNot, fizikNot, tukceNot, kimyaNot, muzikNot, ortalama = 0, gecmeNotu = 55.00f;


        //Kullanıcıdan ders notlarını isteyelim
        System.out.print("Matematik ders notunuzu giriniz: ");
        matNot = notKontrol(scanner.nextFloat());

        System.out.print("Fizik ders notunuzu giriniz: ");
        fizikNot = notKontrol(scanner.nextFloat());

        System.out.print("Türkçe ders notunuzu giriniz: ");
        tukceNot = notKontrol(scanner.nextFloat());

        System.out.print("Kimya ders notunuzu giriniz: ");
        kimyaNot = notKontrol(scanner.nextFloat());

        System.out.print("Müzik ders notunuzu giriniz: ");
        muzikNot = notKontrol(scanner.nextFloat());

        // Eğer geçerli ders varsa ortalamayı hesaplayalım.
        if (gecerliDersSayisi > 0) {
            ortalama = (matNot + fizikNot + tukceNot + kimyaNot + muzikNot) / gecerliDersSayisi;
            System.out.println("Ortalama : " + ortalama);
        } else {
            System.out.println("Geçerli ders girişi yapılmadığından ortalama hesaplanamıyor.");
        }

        // Sınıfı geçip geçmediğini kontrol edelim
        if (ortalama >= gecmeNotu) {
            System.out.println("Tebrikler sınıfı geçtiniz." + "Ortalamanız : " + ortalama);
        } else {
            System.out.println("Malesef not ortalamanız geçme notunun altında. Kaldınız." + "Ortalamanız : " + ortalama);
        }

        scanner.close();


    }

    //Not ortalaması için geçerli ders sayısına ait değişken
    static int gecerliDersSayisi = 0;

    // Notların 0 veya 100 arasında olup olmadığının kontrolü
    public static float notKontrol(float not) {

        if (not <= 100 && not >= 0) {
            gecerliDersSayisi++;
            return not;
        } else {
            System.out.println("Ders notunuzu hatalı girmeniz nedeni ile ortalamaya dahil edilmeyecektir.");
            return 0;
        }

    }

}

// Notların 0 veya 100 arasında olup olmadığının kontrolü
public static float notKontrol(float not) {

    if (not <= 100 && not >= 0) {
        gecerliDersSayisi++;
        return not;
    } else {
        System.out.println("Ders notunuzu hatalı girmeniz nedeni ile ortalamaya dahil edilmeyecektir.");
        return 0;
    }

}

}

```
</details>
<hr>


### 📖 PRATİK 11 - Hava Sıcaklığına Göre Etkinlik Önerme
<hr>

#### ❓SORU

**Koşullar :**

📌 Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.

📌 Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.

📌 Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.

📌 Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

---
❗Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.

🟩 **CEVAP**
<details>
  <summary>Kodu görmek için tıklayınız.</summary>

```JAVA
package J2_KosulluIfadeler_KodBloklari.P11_HavaSicakliginaGoreEtkinlikOnerme;

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

        if (sicaklik <= 5) {
            System.out.println("Sıcaklık değeri " + sicaklik + ". Bu koşulda Kayak yapmanızı öneririm.");
        } else if (sicaklik > 5 && sicaklik <= 15) {
            System.out.println("Sıcaklık değeri " + sicaklik + ". Bu koşulda Sinemaya gitmenizi öneririm.");
        } else if (sicaklik > 15 && sicaklik <= 25) {
            System.out.println("Sıcaklık değeri " + sicaklik + ". Bu koşulda Piknik yapmanızı öneririm.");
        } else if (sicaklik > 25) {
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

```
</details>
<hr>


### 📖 PRATİK 12 - Sayıları Büyükten Küçüğe Sıralama
<hr>

#### ❓SORU

Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.


🟩 **CEVAP**
<details>
  <summary>Kodu görmek için tıklayınız.</summary>

```JAVA
package J2_KosulluIfadeler_KodBloklari.P12_GirilenUcSayiyiSiralama;

import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Main {

    public static void main(String[] args) {

        /*Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.*/

        Scanner sc = new Scanner(System.in);

        int buyuk;

        System.out.print("1. sayiyi gir: ");
        int n1 = sc.nextInt();
        System.out.print("2. sayiyi gir: ");
        int n2 = sc.nextInt();
        System.out.print("3. sayiyi gir: ");
        int n3 = sc.nextInt();

        if (n1 > n2 && n2 > n3) {
            System.out.printf("%d>%d>%d", n1, n2, n3);

        } else if (n1 > n3 && n3 > n2) {
            System.out.printf("%d>%d>%d", n1, n3, n2);

        } else if (n2 > n1 && n1 > n3) {
            System.out.printf("%d>%d>%d", n2, n1, n3);

        } else if (n2 > n3 && n3 > n1) {
            System.out.printf("%d>%d>%d", n2, n3, n1);

        } else if (n3 > n1 && n1 > n2) {
            System.out.printf("%d>%d>%d", n3, n1, n2);

        } else if (n3 > n2 && n2 > n1) {
            System.out.printf("%d>%d>%d", n3, n2, n1);


        }
    }
}

```
</details>
<hr>


### 📖 PRATİK 13 - Burç Bulan Program
<hr>

#### ❓SORU

Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat

Balık Burcu : 20 Şubat - 20 Mart

---
❗Aynı örneği switch-case kullanmadan yapınız.

🟩 **CEVAP**
<details>
  <summary>Kodu görmek için tıklayınız.</summary>

```JAVA
package J2_KosulluIfadeler_KodBloklari.P13_BurcBulanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak
        Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart
        */

        int ay, gun;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğduğunuz ay: ");
        ay = scanner.nextInt();

        System.out.print("Doğduğunuz gün: ");
        gun = scanner.nextInt();

        switch (ay) {
            case 1:
                if (ay > 0 && ay < 22) {
                    System.out.println("Oğlak burcusunuz.");
                } else if (ay > 21 && ay < 31) {
                    System.out.println("Kova burcusunuz");
                } else {
                    System.out.println("Hatalı Giriş yaptınız");
                }
                break;
            case 2:
                if (ay > 0 && ay < 20) {
                    System.out.println("Kova burcusunuz.");
                } else if (ay > 19 && ay < 31) {
                    System.out.println("Balık burcusunuz");
                } else {
                    System.out.println("Hatalı Giriş yaptınız");
                }
                break;
            case 3:
                if (ay > 0 && ay < 21) {
                    System.out.println("Balık burcusunuz.");
                } else if (ay > 20 && ay < 31) {
                    System.out.println("Koç burcusunuz");
                } else {
                    System.out.println("Hatalı Giriş yaptınız");
                }
                break;
            case 4:
                if (ay > 0 && ay < 21) {
                    System.out.println("Koç burcusunuz.");
                } else if (ay > 20 && ay < 31) {
                    System.out.println("Boğa burcusunuz");
                } else {
                    System.out.println("Hatalı Giriş yaptınız");
                }
            case 5:
                if (ay > 0 && ay < 22) {
                    System.out.println("Boğa burcusunuz.");
                } else if (ay > 21 && ay < 31) {
                    System.out.println("İkizler burcusunuz");
                } else {
                    System.out.println("Hatalı Giriş yaptınız");
                }
                break;
            case 6:
                if (ay > 0 && ay < 23) {
                    System.out.println("İkizler burcusunuz.");
                } else if (ay > 22 && ay < 31) {
                    System.out.println("Yengeç burcusunuz");
                } else {
                    System.out.println("Hatalı Giriş yaptınız");
                }
                break;
            case 7:
                if (ay > 0 && ay < 23) {
                    System.out.println("Yengeç burcusunuz.");
                } else if (ay > 22 && ay < 31) {
                    System.out.println("Aslan burcusunuz");
                } else {
                    System.out.println("Hatalı Giriş yaptınız");
                }
                break;
            case 8:
                if (ay > 0 && ay < 23) {
                    System.out.println("Aslan burcusunuz.");
                } else if (ay > 20 && ay < 31) {
                    System.out.println("Başak burcusunuz");
                } else {
                    System.out.println("Hatalı Giriş yaptınız");
                }
                break;
            case 9:
                if (ay > 0 && ay < 23) {
                    System.out.println("Başak burcusunuz.");
                } else if (ay > 22 && ay < 31) {
                    System.out.println("Terazi burcusunuz");
                } else {
                    System.out.println("Hatalı Giriş yaptınız");
                }
                break;
            case 10:
                if (ay > 0 && ay < 23) {
                    System.out.println("Terazi burcusunuz.");
                } else if (ay > 22 && ay < 31) {
                    System.out.println("Akrep burcusunuz");
                } else {
                    System.out.println("Hatalı Giriş yaptınız");
                }
                break;
            case 11:
                if (ay > 0 && ay < 22) {
                    System.out.println("Akrep burcusunuz.");
                } else if (ay > 21 && ay < 31) {
                    System.out.println("Yay burcusunuz");
                } else {
                    System.out.println("Hatalı Giriş yaptınız");
                }
                break;
            case 12:
                if (ay > 0 && ay < 22) {
                    System.out.println("Yay burcusunuz.");
                } else if (ay > 21 && ay < 31) {
                    System.out.println("Oğlak burcusunuz");
                } else {
                    System.out.println("Hatalı Giriş yaptınız");
                }
                break;
        }


    }
}

```
</details>
<hr>


### 📖 PRATİK 14 - Uçak Bileti Fiyatı Hesaplama
<hr>

#### ❓SORU

Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.

Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. 
Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın;

📌 Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

📌 Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.

📌 Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.

📌 Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.

📌 Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.


🟩 **CEVAP**
<details>
  <summary>Kodu görmek için tıklayınız.</summary>

```JAVA
package J2_KosulluIfadeler_KodBloklari.P14_UcakBiletiFiyatiHesaplama;

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
        if (yas < 0) {
            System.out.println("Hatalı veri girdiniz.");
            return;
        }
        ;

        System.out.print("Yolculuk tipini giriniz (1- Tek gidiş | 2- Gidiş-Dönüş: ");
        yolculukTipi = scanner.nextInt();
        if (yolculukTipi != 1 && yolculukTipi != 2) {
            System.out.println("Hatalı veri girdiniz.");
            return;
        }
        ;

        System.out.print("Gidilecek mesafe birimini giriniz (km) : ");
        km = scanner.nextDouble();
        if (km < 0) {
            System.out.println("Hatalı veri girdiniz.");
            return;
        }
        ;
        scanner.close();

        topUcret = km * ucret;

        if (yas < 12) {
            topUcret = topUcret / 2;
        } else if (yas >= 12 && yas <= 24) {
            topUcret = topUcret * 0.9;
        } else if (yas > 65) {
            topUcret = topUcret * 0.7;
        }


        if (yolculukTipi == 2) {
            topUcret = topUcret * 0.8;
            topUcret = topUcret * 2;
        }

        System.out.printf("Bilet fiyatınız: %.2f TL\n", topUcret);

    }
}

```
</details>
<hr>


### 📖 PRATİK 15 - Çin Zodyağı Hesaplama
<hr>

#### ❓SORU

Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

**Çin Zodyağı nedir?**

4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.

**Çin Zodyağı nasıl hesaplanır?**

Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

📌 Doğum Tarihi %12 = 0 ➜ Maymun

📌 Doğum Tarihi %12 = 1 ➜ Horoz

📌 Doğum Tarihi %12 = 2 ➜ Köpek

📌 Doğum Tarihi %12 = 3 ➜ Domuz

📌 Doğum Tarihi %12 = 4 ➜ Fare

📌 Doğum Tarihi %12 = 5 ➜ Öküz

📌 Doğum Tarihi %12 = 6 ➜ Kaplan

📌 Doğum Tarihi %12 = 7 ➜ Tavşan

📌 Doğum Tarihi %12 = 8 ➜ Ejderha

📌 Doğum Tarihi %12 = 9 ➜ Yılan

📌 Doğum Tarihi %12 = 10 ➜ At

📌 Doğum Tarihi %12 = 11 ➜ Koyun


🟩 **CEVAP**
<details>
  <summary>Kodu görmek için tıklayınız.</summary>

```JAVA
package J2_KosulluIfadeler_KodBloklari.P15_CinZodyagi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int dTarih, zodyagDegeri;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz : ");
        dTarih = scanner.nextInt();
        scanner.close();

        if (dTarih <= 999) {
            System.out.println("Hatalı veri girişi yaptınız.");
            return;
        }

        zodyagDegeri = dTarih % 12;

        switch (zodyagDegeri) {
            case 0:
                System.out.println("Maymun");
                break;
            case 1:
                System.out.println("Horoz");
                break;
            case 2:
                System.out.println("Köpek");
                break;
            case 3:
                System.out.println("Domuz");
                break;
            case 4:
                System.out.println("Fare");
                break;
            case 5:
                System.out.println("Öküz");
                break;
            case 6:
                System.out.println("Kaplan");
                break;
            case 7:
                System.out.println("Tavşan");
                break;
            case 8:
                System.out.println("Ejderha");
                break;
            case 9:
                System.out.println("Yılan");
                break;
            case 10:
                System.out.println("At");
                break;
            case 11:
                System.out.println("Koyun");
                break;

        }


    }

}

```
</details>
<hr>



### 📖 PRATİK 16 - Artık YIl Hesaplama
<hr>

#### ❓SORU

Java ile kullanıcının girdiği yılın artık olup olmadığını bulan programı yazınız.

**Artık Yıl Nedir?**

Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl. Bu fazladan gün (artık gün), normalde 28 gün olan şubat ayına 29 Şubat’ın eklenmesi ile elde edilir.

**Artık Yıl Nasıl Hesaplanır?**

Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:

1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.

100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:

Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.

Sadece 400'e tam olarak bölünebilenlerin artık yıl kabul edilmesinin nedeni, bir astronomik yılın 365,25 gün değil, yaklaşık olarak 365,242 gün olmasından kaynaklanan hatayı gidermektir.


🟩 **CEVAP**
<details>
  <summary>Kodu görmek için tıklayınız.</summary>

```JAVA
package J2_KosulluIfadeler_KodBloklari.P16_ArtikYilHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Yıl bilgisini giriniz: ");
        Scanner scanner = new Scanner(System.in);
        int yil = scanner.nextInt();

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    System.out.println(yil + " yılı artık yıldır.");
                } else {
                    System.out.println(yil + " yılı artık yıl değildir.");
                }
            } else {
                System.out.println(yil + " yılı artık yıldır.");
            }
        } else {
            System.out.println(yil + " yılı artık yıl değildir.");
        }


    }

}

```
</details>
<hr>


### 📖 PRATİK 17 - Girilen Sayıya Kadar Olan Çift Sayıları Bulan Program
<hr>

#### ❓SORU

Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazınız.


❗Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

🟩 **CEVAP**
<details>
  <summary>Kodu görmek için tıklayınız.</summary>

```JAVA
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

```
</details>
<hr>


### 📖 PRATİK 18 - Tek Sayıların Toplamını Program
<hr>

#### ❓SORU

Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.


🟩 **CEVAP**
<details>
  <summary>Kodu görmek için tıklayınız.</summary>

```JAVA
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

```
</details>
<hr>

### 📖 PRATİK 19 - Girilen değerlerden çift ve 4'ün katları olan sayıları toplayan program
<hr>

#### ❓SORU

Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.


🟩 **CEVAP**
<details>
  <summary>Kodu görmek için tıklayınız.</summary>

```JAVA
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

```
</details>
<hr>


### 📖 PRATİK 20 - Girilen Sayıya Kadar Olan 4 ve 5'in Kuvvetlerini Bulma
<hr>

#### ❓SORU

Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

🟩 **CEVAP**
<details>
  <summary>Kodu görmek için tıklayınız.</summary>

```JAVA
package J3_Donguler.P20_GirilenSayiyaKadarOlan4ve5inKuvvetleriniBulma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.*/

        int input;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hangi sayıya kadar kuvvetleri alalım?");
        input = scanner.nextInt();
        scanner.close();

        System.out.print("Girdiğiniz değere kadar olan 4'ün kuvvetleri : ");
        for (int i = 1; i <= input ; i*=4) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Girdiğiniz değere kadar olan 5'ün kuvvetleri : ");
        for (int i = 1; i <= input ; i*=5) {
            System.out.print(i + " ");
        }

    }
}

```
</details>
<hr>


### 📖 PRATİK 21 - Kombinasyon hesaplayan program
<hr>

#### ❓SORU

N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

**Kombinasyon formülü**
C(n,r) = n! / (r! * (n-r)!)

🟩 **CEVAP**
<details>
  <summary>Kodu görmek için tıklayınız.</summary>

```JAVA
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

        int sonuc = faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));

        System.out.println(sonuc);


    }


}

```
</details>
<hr>


### 📖 PRATİK 22 - Üslü Sayı Hesaplayan Program
<hr>

#### ❓SORU

Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
---
❗soru kritik noktası

🟩 **CEVAP**
<details>
  <summary>Kodu görmek için tıklayınız.</summary>

```JAVA
package J3_Donguler.P22_UsluSayilariHespalayanProgram;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.*/

        Scanner scanner = new Scanner(System.in);
        int sayi, usSayisi;
        double sonuc = 1;

        System.out.print("Üssü alınacak sayıyı giriniz: ");
        sayi = scanner.nextInt();
        System.out.print("Üs sayısını giriniz: ");
        usSayisi = scanner.nextInt();
        scanner.close();


        if (sayi==0 && usSayisi==0){
            System.out.println("0^0 belirsiz bir ifadedir!");
        } else if (sayi == 0 && usSayisi<0) {
            System.out.println("0'ın negatif üssü tanımsızdır!");
        } else if (usSayisi >= 0) {
            for (int i = 0; i < usSayisi; i++) {
                sonuc = sonuc * sayi;
            }
            System.out.println(sayi + "^" + usSayisi + "= "+ sonuc );
        } else {
            // Negatif üs için işlem
            for (int i = 0; i < -usSayisi; i++) {
                sonuc *= sayi;
            }
            sonuc = 1.0 / sonuc;
            System.out.println(sayi + "^" + usSayisi + " = " + sonuc);
        }




    }
}

```
</details>
<hr>



### 📖 PRATİK 24 - Basamak sayılarının toplamını hesaplayan program
<hr>

#### ❓SORU

Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

Örnek : 1643 = 1 + 6 + 4 + 3 = 14

---
❗soru kritik noktası

🟩 **CEVAP**
<details>
  <summary>Kodu görmek için tıklayınız.</summary>

```JAVA
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

```
</details>
<hr>

### 📖 PRATİK # - baslık
<hr>

#### ❓SORU

Soru

---
❗soru kritik noktası

🟩 **CEVAP**
<details>
  <summary>Kodu görmek için tıklayınız.</summary>

```JAVA
kodları yaz
```
</details>
<hr>