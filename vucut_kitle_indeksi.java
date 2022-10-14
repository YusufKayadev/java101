import java.util.Scanner;

public class vucut_kitle_indeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float kg, cm, index;

        System.out.print("Kilo değerini giriniz (kg) : ");
        kg = input.nextInt();

        System.out.print("Boy değerini giriniz (cm) :");
        cm = input.nextInt();

        index = kg / cm * cm;

        System.out.print("Vücut kitle indexsiniz : " + index);
    }
}
