import java.util.Scanner;

public class hesap_makinesi {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int n1, n2, select;

        System.out.print("Birinci sayiyi girin: ");
        n1 = src.nextInt();
        System.out.print("Ikinci sayiyi girin: ");
        n2 = src.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Yapmak istediginiz islemi seciniz : ");
        select = src.nextInt();

        switch (select) {
            case 1:
                System.out.print("Sonuc : " + (n1 + n2));
                break;
            case 2:
                System.out.print("Sonuc : " + (n1 - n2));
                break;
            case 3:
                System.out.print("Sonuc : " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.print("Sonuc : " + (n1 / n2));
                } else {
                    System.out.println("Sayi sifira bolunemez..!!");
                }
                break;
            default:
                System.out.println("Hatali giris yaptiniz..!!");
        }
    }
}
