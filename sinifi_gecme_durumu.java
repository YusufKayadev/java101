import java.util.Scanner;

public class sinifi_gecme_durumu {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int mat, turkce, fizik, kimya;
        int toplam = 0, dersSayisi = 0;
        float ort;

        System.out.print("M Notu giriniz : ");
        mat = inp.nextInt();
        if (mat < 0 || mat > 100) {
            System.out.println("Gecerli not değil !! Ortalamaya dahil edilmedi...");
        } else {
            System.out.println("Matematik notu : " + mat);
            toplam += mat;
            dersSayisi += 1;
        }

        System.out.print("T notu: ");
        turkce = inp.nextInt();
        if (turkce < 0 || turkce > 100) {
            System.out.println("Gecerli not değil !! Ortalamaya dahil edilmedi...");
        } else {
            System.out.println("Turkce notu : " + turkce);
            toplam += turkce;
            dersSayisi += 1;
        }

        System.out.print("Fizik notu: ");
        fizik = inp.nextInt();
        if (fizik < 0 || fizik > 100) {
            System.out.println("Gecerli not değil !! Ortalamaya dahil edilmedi...");
        } else {
            System.out.println("F notu : " + fizik);
            toplam += fizik;
            dersSayisi += 1;
        }

        System.out.print("K notu: ");
        kimya = inp.nextInt();
        if (kimya < 0 || kimya > 100) {
            System.out.println("Gecerli not değil !! Ortalamaya dahil edilmedi...");
        } else {
            System.out.println("K notu : " + kimya);
            toplam += kimya;
            dersSayisi += 1;
        }

        ort = toplam / dersSayisi;
        System.out.println("Ortalama : " + ort);

        if (ort >= 55) {
            System.out.println("Sinifi gecti..");
        } else {
            System.out.println("Sinifta kaldi..");
        }

    }
}
