import java.util.Scanner;

public class KDV_tutari {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double fiyat, kdvOran = 0.18, fiyatKdv, fiyatYeni;
        System.out.print("Ürün fiyatını giriniz : ");
        fiyat = inp.nextInt();

        System.out.println("Güncel KDV oranı " + kdvOran + " dir ...");
        fiyatKdv = fiyat * kdvOran;
        fiyatYeni = fiyat + fiyatKdv;


        System.out.println("KDV fiyatı : " + fiyatKdv);
        System.out.println("Toplam KDV li fiyat : " + fiyatYeni);

    }
}
