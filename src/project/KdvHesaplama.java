package project;

import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        double kdvOranı = 0.18 , Kdvtutarı  , Kdvlitutar , tutar ;

        Scanner input = new Scanner(System.in);
        System.out.print("Ucret tutarini giriniz = ");
        tutar = input.nextDouble();

        kdvOranı = (tutar <= 1000) ? 0.18 : 0.8;
        Kdvtutarı = tutar * kdvOranı;
        Kdvlitutar = tutar + Kdvtutarı;

        System.out.println("Kdv'siz Tutar =" + tutar);
        System.out.println("Kdv Orani" + kdvOranı);
        System.out.println("Kdv Turari" + Kdvtutarı);
        System.out.println("Kdv'li tutar " + Kdvlitutar);



















    }
}
