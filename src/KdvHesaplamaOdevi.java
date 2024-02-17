import java.util.Scanner;

public class KdvHesaplamaOdevi {
    public static void main(String[] args) {
        // KDV'siz tutar girişi tanımla
        double i;
        //scanner sınıfı tanımla
        Scanner inp=new Scanner(System.in);
        //kullanıcıdan değeri al
        System.out.print("Ücret Tutarını Giriniz : ");
        i=inp.nextDouble();

        //Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük
        //KDV oranı %8 olarak hesaplanır.

        double a=0.18, b=0.08;

        boolean onsekiz= i>0 && i<1000;
        boolean sekiz= i>1000;
        boolean oran = onsekiz || sekiz;

        String kdvoran= oran ?"0,18":"0,08";

        System.out.println("KDV'siz Tutar : " + i);
        System.out.println("KDV Oranı : " + kdvoran);
        System.out.println("KDV Tutarı : " + (i * a) );
        System.out.println("KDV'li Fiyat : " + (i+(i*a)));
    }
}
