import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class cift_sayilari_bulma {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int k, total = 0, number = 0, result;


        System.out.print("Sayi : ");
        k = src.nextInt();

        // GİRİLEN SAYIYA KADAR OLAN CIFT SAYILARI BULMA
        /*for (int i = 0; i < k; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }*/

        // WHİLE İLE YAPIMI
        /*int i = 0;
        while (i <= k) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }*/


        // 3 VE 4 E TAM BOLUNEN SAYILARI BULMA
        for (int i = 0; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
                total += i;
                number++;
            }
        }
        result = total / (number - 1);
        System.out.println("Sonuc : " + result);
    }
}
