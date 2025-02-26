

### 📖 PRATİK 1 - Not Ortalaması
<hr>

#### ❓SORU 
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

❗Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

🟩 **CEVAP**
<details>
  <summary>Kodu görmek için tıklayınız.</summary>

```JAVA
package NotOrtalamasi;

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
package KDVTutariUygulamasi;

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
package DikUcgendeHipotenusveAlan;

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
package DikUcgendeHipotenusveAlan;

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
        cevre = (kenar1 + kenar2 + kenar3)/2;

        // Üçgenin alanını bulalım

        alan = Math.sqrt(cevre* (cevre - kenar1) * (cevre - kenar2) * (cevre - kenar3));

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
package TaksimetreProgrami;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir
        */
        Scanner scanner = new Scanner(System.in);

        double gidilenMesafe, acilisUcreti=10, tutar;
        float km = 2.20f;

        System.out.println("Gidilen mesafe bilgisini km olarak giriniz.");
        gidilenMesafe = scanner.nextDouble();
        scanner.close();

        tutar = acilisUcreti + (gidilenMesafe * km);

        System.out.printf("Ödenecek tutar : %.2f", (tutar<=20) ? 20 : tutar);


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
