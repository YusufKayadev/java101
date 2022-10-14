import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        int mat, turkce, fizik, kimya, tarih, muzik ;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz : ");
        mat = inp.nextInt();

        System.out.print("Fizik notunu giriniz : ");
        fizik = inp.nextInt();

        System.out.print("Turkce notunu giriniz : ");
        turkce = inp.nextInt();

        System.out.print("Kimya notunu giriniz : ");
        kimya = inp.nextInt();

        System.out.print("Tarih notunu giriniz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik notunu giriniz : ");
        muzik = inp.nextInt();

        int toplam = mat+tarih+fizik+muzik+kimya+turkce;
        float sonuc = toplam/6;

        System.out.println("Not ortalamanız : " + sonuc);

        String durum = ( sonuc >= 60 ) ? "Sınıfı geçtiniz .." : "Sınıfı geçemediniz...";

        System.out.println(durum);

    }
}
