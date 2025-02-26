

### 📖 PRATİK 1 - Not Ortalaması

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
