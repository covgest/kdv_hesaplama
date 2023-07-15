import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double Tutar,Kdvoran = 0.18, kdvTutar, kdvlitutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz : " );
        Tutar = input.nextDouble();

        kdvTutar = Tutar * Kdvoran;
        kdvlitutar = Tutar + kdvTutar;

        System.out.println("KDV SİZ TUTAR :" + Tutar );
        System.out.println("KDV ORANI :" + Kdvoran );
        System.out.println("KDV TUTARI :" + kdvTutar );
        System.out.println("KDV Lİ TUTARI :" + kdvlitutar );
    }
}