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
