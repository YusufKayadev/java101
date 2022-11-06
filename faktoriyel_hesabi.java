import java.util.Scanner;

public class faktoriyel_hesabi {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int n, total = 1;

        System.out.print("Sayi : ");
        n = src.nextInt();

        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        System.out.println(n + ".fakröriyel : " + total);
    }
}
