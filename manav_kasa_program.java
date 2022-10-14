import java.util.Scanner;

public class manav_kasa_program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double elma = 3.67, armut = 2.14, domates = 1.11, muz = 0.95;
        double ef, af, df, mf, total;
        int e, a, d, m;

        System.out.print("Elma miktarı : ");
        e = input.nextInt();

        System.out.print("Armut miktarı : ");
        a = input.nextInt();

        System.out.print("Domates miktarı : ");
        d = input.nextInt();

        System.out.print("Muz miktarı : ");
        m = input.nextInt();

        ef = e*elma;
        af = a*armut;
        df = d*domates;
        mf = m*muz;

        total = ef+af+df+mf;

        System.out.println("Toplam fiyat : " + total);

    }
}
