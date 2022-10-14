import java.util.Scanner;

public class dairenin_cevresi_alani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double r, pi = 3.14, alan, cevre;

        System.out.print("Yarıçapı giriniz : ");
        r = input.nextInt();

        alan = pi * r * r;
        cevre = 2 * pi * r;

        System.out.println("Alan : " + alan);
        System.out.println("Cevre : " + cevre);


    }
}
