package J1_TemelKavramlar_Degiskenler.P6_VucutKitleIndeksi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

        Formül
        Kilo (kg) / Boy(m) * Boy(m)*/

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
