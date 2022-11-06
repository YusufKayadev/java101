import java.util.Scanner;

public class ikinin_kuvvetleri {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int n;
        System.out.print("Sayi : ");
        n = src.nextInt();

        for (int i = 1; i <= n; i *= 2) {
            System.out.println(i);
        }
    }
}
