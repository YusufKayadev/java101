import java.util.Scanner;

public class kullanici_girisi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String userName, password;

        System.out.print("Kullanici adi : ");
        userName = inp.nextLine();

        System.out.print("Parola : ");
        password = inp.nextLine();

        if (userName.equals("yusuf") && (password.equals("123"))) {
            System.out.println("Giris basarili..");
        } else {
            String newPassword;
            int select;

            System.out.println("Hatali bilgi girdiniz\nSifirlamak icin\n1-Evet 2-Hayir seciniz");
            select = inp.nextByte();

            switch (select) {
                case 1:
                    Scanner src = new Scanner(System.in);
                    System.out.print("Yeni sifre giriniz:");
                    newPassword = src.nextLine();
                    if (newPassword.equals(password)) {
                        System.out.println("Yeni sifre eskisi ile ayni olamaz");
                    } else {
                        System.out.println("Sifre basariyla olusturuldu..");
                    }
                    break;
                case 2:
                    System.out.println("Sifre sifirlama islemi gerceklesmedi..");
                    break;
            }

        }

    }
}
