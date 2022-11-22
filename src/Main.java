import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        // Sample int
        long ad;
        Scanner input = new Scanner(System.in);

        System.out.print("daxil edin : ");
        ad = input.nextLong();
        System.out.println(a);

         */

        /*
        // Sample String
        Scanner input = new Scanner(System.in);
        System.out.print("string daxil edin : ");
        String name = input.nextLine();
        System.out.println(name);
        */
        //Scanner sinifi olustur
        Scanner input = new Scanner(System.in);
        //Degiskenleri tanimla
        int mat, fizik, kimya, tarix, turkce, musiqi ;
        double notOrtalama;
        //Kullanicidan degerleri al
        System.out.print("mat : ");
        mat = input.nextInt();
        System.out.print("fizik : ");
        fizik = input.nextInt();
        System.out.print("kimya : ");
        kimya = input.nextInt();
        System.out.print("tarix : ");
        tarix = input.nextInt();
        System.out.print("turkce : ");
        turkce = input.nextInt();
        System.out.print("musiqi : ");
        musiqi = input.nextInt();

        // Not ortalamasini yapan hesaplama olustur
        notOrtalama = (mat+fizik+kimya+tarix+turkce+musiqi)/6;
        // Ekranda not ortalamasini goster
        System.out.println("Not ortalamasi : " + notOrtalama);
        // sonucu goster
        String sonuc = notOrtalama >80 ? "Sinifi gecti" :"Sinifta kaldi";
        System.out.println( sonuc);









    }
}