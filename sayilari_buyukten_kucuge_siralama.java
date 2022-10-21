import java.util.Scanner;

public class sayilari_buyukten_kucuge_siralama {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int a, b, c;

        System.out.print("a : ");
        a = src.nextInt();
        System.out.print("b : ");
        b = src.nextInt();
        System.out.print("c : ");
        c = src.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                System.out.println("a > b > c");
            } else {
                System.out.println("a > c > b");
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println("b > a > c");
            } else {
                System.out.println("b > c > a");
            }
        } else {
            if (a > b) {
                System.out.println("c > a > b");
            } else {
                System.out.println("c > b > a");
            }
        }
    }
}
