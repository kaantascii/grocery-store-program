package org.example;
import java.util.Scanner;
/* Author: Kaan Tascii */

/*Java ile kullanıcıların manavdan almış oldukları ürünlerin
kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
 */
public class groceryStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner nesnesini oluşturdum.

        double armutFiyat = 2.14 ;
        double elmaFiyat = 3.67 ;
        double domatesFiyat = 1.11 ;   //double değişkeniyle fiyat değerlerini yazdım.
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        System.out.print("Armut Kaç Kilo? ");
        double armutKilo = scanner.nextDouble();

        System.out.print("Elma Kaç Kilo? ");
        double elmaKilo = scanner.nextDouble();

        System.out.print("Domates Kaç Kilo? ");
        double domatesKilo = scanner.nextDouble();       //sonra manavdaki ürünleri kg bilgilerini aldım.

        System.out.print("Muz Kaç Kilo? ");
        double muzKilo = scanner.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? ");
        double patlicanKilo = scanner.nextDouble();

        double toplamTutar = (armutKilo * armutFiyat) + (elmaKilo * elmaFiyat) +
                (domatesKilo * domatesFiyat) + (muzKilo * muzFiyat) +                 //Toplam tutarı hesaplama yaptım.
                (patlicanKilo * patlicanFiyat);

        System.out.println("Toplam Tutar " + toplamTutar + " TL");  //Sonucunda yazdırdım.

    }
}
