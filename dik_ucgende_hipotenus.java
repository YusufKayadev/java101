import java.util.Scanner;

public class dik_ucgende_hipotenus {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a, b;
        double c, cevre, alan, u;
        System.out.print("a kenarını giriniz: ");
        a = inp.nextInt();

        System.out.print("b kenarını giriniz: ");
        b = inp.nextInt();

        c = Math.sqrt((a*a)+(b*b));

        System.out.println("Hipotenüs uzunluğu : " + c);

        
    }
}
