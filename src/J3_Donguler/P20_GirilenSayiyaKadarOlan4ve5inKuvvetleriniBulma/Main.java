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
