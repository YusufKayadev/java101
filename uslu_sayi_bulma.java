package projeler;

import java.util.Scanner;

public class uslu_sayi_bulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, k;
        System.out.print("Sayi : ");
        n = inp.nextByte();
        System.out.print("Us degeri : ");
        k = inp.nextByte();
        int total = 1;

        /*int i = 1;
        while (i <= k) {
            total *= n;
            i++;
        }
        System.out.println("Sonuc :" + total);*/

        for (int i = 1; i<=k; i++){
            total *= n;
        }
        System.out.println("Cevap : " + total);
    }
}
