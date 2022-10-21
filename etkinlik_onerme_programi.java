import java.util.Scanner;

public class etkinlik_onerme_programi {
    public static void main(String[] args) {
        //Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        //Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        //Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
        //Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

        Scanner src = new Scanner(System.in);

        int heat;
        System.out.print("Sicaklik dgeri giriniz :");
        heat = src.nextInt();

        if (heat < 5) {
            System.out.println("Kayak");
        } else if (heat <= 25) {
            if (heat < 15) {
                System.out.println("Sinema");
            }
            if (heat >= 10) {
                System.out.println("Piknik");
            }
        }else {
            System.out.println("Yuzme");
        }
    }
}
