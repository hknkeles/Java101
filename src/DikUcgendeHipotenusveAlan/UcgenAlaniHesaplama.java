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
