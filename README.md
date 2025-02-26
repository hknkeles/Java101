

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
package P5_DaireninAlaniveCevresi;

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
package P5_DaireninAlaniveCevresi;

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
package P6_VucutKitleIndeksi;

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
        if (boy <= 0){
            System.out.println("Boy ölçünüzü hatalı girmeniz nedeni ile program sonlandırılıyor.");
            scanner.close();
            return;
        }

        System.out.println("Lütfen kilo bilginizi giriniz: ");
        kilo = scanner.nextFloat();

        //Hatalı kilo bilgisi girilmesi halinde
        if (boy <= 0){
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
package P7_ManavKasaProgrami;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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
