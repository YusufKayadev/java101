import java.util.Scanner;

public class hesap_makinesi2 {
    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Sonuc : " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Sonuc: " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Sonuc : " + result);
        return result;
    }

    static double divided(int a, int b) {
        if (b == 0) {
            return 0;
        }
        double result = a / b;
        System.out.println("Sonuc : " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Sonuc : " + result);
        return result;
    }

    /*static int fact(int a) {
        int result;
        for (int i=1; i<=a; i++) {
            result *= i;
        }
        return result;
    }*/

    static int mod(int a, int b) {
        int result;
        result = a % b;
        System.out.println("Sonuc : " + result);
        return result;
    }

    static void calc(int a, int b) {
        System.out.println("Cevre : " + (2 * (a + b)));
        System.out.println("Alan: " + a * b);
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n" + "2- Çıkarma İşlemi\n" + "3- Çarpma İşlemi\n" + "4- Bölme işlemi\n" + "5- Üslü Sayı Hesaplama\n" + "6- Faktoriyel Hesaplama\n" + "7- Mod Alma\n" + "8- Dikdörtgen Alan ve Çevre Hesabı";

        while (true) {
            System.out.println(menu);
            System.out.print("İslemi seciniz : ");
            select = src.nextInt();

            if (select == 0) {
                break;
            }

            System.out.print("İlk Sayi : ");
            int a = src.nextInt();
            System.out.print("İkinci Sayi : ");
            int b = src.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    if (divided(a, b) == 0) {
                        System.out.println("İkinci sayi sifirdan farkli olmali..");
                    } else divided(a, b);
                    break;
                case 5:
                    power(a, b);
                case 6:
                    mod(a, b);
                case 7:
                    calc(a, b);
                default:
                    System.out.println("Dogru bir deger giriniz.." +
                            "");
            }
        }
    }
}
