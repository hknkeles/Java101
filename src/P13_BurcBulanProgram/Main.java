package P13_BurcBulanProgram;

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

        switch (ay){
            case 1: if (ay>0 && ay<22){
                System.out.println("Oğlak burcusunuz.");
            } else if(ay>21 && ay<31) {
                System.out.println("Kova burcusunuz");
            } else {
                System.out.println("Hatalı Giriş yaptınız");
            }
            break;
            case 2: if (ay>0 && ay<20){
                System.out.println("Kova burcusunuz.");
            } else if(ay>19 && ay<31) {
                System.out.println("Balık burcusunuz");
            } else {
                System.out.println("Hatalı Giriş yaptınız");
            }
            break;
            case 3: if (ay>0 && ay<21){
                System.out.println("Balık burcusunuz.");
            } else if(ay>20 && ay<31) {
                System.out.println("Koç burcusunuz");
            } else {
                System.out.println("Hatalı Giriş yaptınız");
            }
            break;
            case 4: if (ay>0 && ay<21){
                System.out.println("Koç burcusunuz.");
            } else if(ay>20 && ay<31) {
                System.out.println("Boğa burcusunuz");
            } else {
                System.out.println("Hatalı Giriş yaptınız");
            }
            case 5: if (ay>0 && ay<22){
                System.out.println("Boğa burcusunuz.");
            } else if(ay>21 && ay<31) {
                System.out.println("İkizler burcusunuz");
            } else {
                System.out.println("Hatalı Giriş yaptınız");
            }
                break;
            case 6: if (ay>0 && ay<23){
                System.out.println("İkizler burcusunuz.");
            } else if(ay>22 && ay<31) {
                System.out.println("Yengeç burcusunuz");
            } else {
                System.out.println("Hatalı Giriş yaptınız");
            }
                break;
            case 7: if (ay>0 && ay<23){
                System.out.println("Yengeç burcusunuz.");
            } else if(ay>22 && ay<31) {
                System.out.println("Aslan burcusunuz");
            } else {
                System.out.println("Hatalı Giriş yaptınız");
            }
                break;
            case 8: if (ay>0 && ay<23){
                System.out.println("Aslan burcusunuz.");
            } else if(ay>20 && ay<31) {
                System.out.println("Başak burcusunuz");
            } else {
                System.out.println("Hatalı Giriş yaptınız");
            }
                break;
            case 9: if (ay>0 && ay<23){
                System.out.println("Başak burcusunuz.");
            } else if(ay>22 && ay<31) {
                System.out.println("Terazi burcusunuz");
            } else {
                System.out.println("Hatalı Giriş yaptınız");
            }
                break;
            case 10: if (ay>0 && ay<23){
                System.out.println("Terazi burcusunuz.");
            } else if(ay>22 && ay<31) {
                System.out.println("Akrep burcusunuz");
            } else {
                System.out.println("Hatalı Giriş yaptınız");
            }
                break;
            case 11: if (ay>0 && ay<22){
                System.out.println("Akrep burcusunuz.");
            } else if(ay>21 && ay<31) {
                System.out.println("Yay burcusunuz");
            } else {
                System.out.println("Hatalı Giriş yaptınız");
            }
                break;
            case 12: if (ay>0 && ay<22){
                System.out.println("Yay burcusunuz.");
            } else if(ay>21 && ay<31) {
                System.out.println("Oğlak burcusunuz");
            } else {
                System.out.println("Hatalı Giriş yaptınız");
            }
                break;
        }


    }
}
