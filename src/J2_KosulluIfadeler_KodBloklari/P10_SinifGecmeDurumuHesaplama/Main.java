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
        float matNot, fizikNot, tukceNot, kimyaNot, muzikNot, ortalama = 0, gecmeNotu=55.00f;



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
        if (gecerliDersSayisi>0){
            ortalama = (matNot + fizikNot + tukceNot + kimyaNot + muzikNot) / gecerliDersSayisi;
            System.out.println("Ortalama : " + ortalama);
        } else {
            System.out.println("Geçerli ders girişi yapılmadığından ortalama hesaplanamıyor.");
        }

        // Sınıfı geçip geçmediğini kontrol edelim
        if (ortalama >= gecmeNotu){
            System.out.println("Tebrikler sınıfı geçtiniz."+ "Ortalamanız : " + ortalama);
        }else {
            System.out.println("Malesef not ortalamanız geçme notunun altında. Kaldınız." + "Ortalamanız : " + ortalama);
        }

        scanner.close();



    }
    //Not ortalaması için geçerli ders sayısına ait değişken
    static int gecerliDersSayisi = 0;

    // Notların 0 veya 100 arasında olup olmadığının kontrolü
    public static float notKontrol(float not){

        if (not<=100 && not>=0){
            gecerliDersSayisi++;
            return not;
        } else {
            System.out.println("Ders notunuzu hatalı girmeniz nedeni ile ortalamaya dahil edilmeyecektir.");
            return 0;
        }

    }

}
