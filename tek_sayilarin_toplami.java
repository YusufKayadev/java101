import java.util.Scanner;

public class tek_sayilarin_toplami {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int n, total = 0;

        /*do {
            System.out.print("Sayi : ");
            n = src.nextInt();
            if (n % 2 == 1) {
                System.out.print(n);
                total += n;
            }
        } while (n > 0);
        System.out.println("Toplam : " + total);*/

        do {
            System.out.println("Sayi : ");
            n = src.nextInt();
            if (n % 2 == 0 && n % 4 == 0) {
                System.out.print(n);
                total += n;
            }
        } while (n > 0);
        System.out.println("Toplam : " + total);

    }
}
