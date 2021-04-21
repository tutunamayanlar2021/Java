import Math.dortIslem;
import  Math.Logaritma;
import Math.*;//tümünü kullanmak için
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ///kullanıcıdan veri alma
        Scanner scanner =new Scanner(System.in);
        System.out.println("Adınızı giriniz giriniz!");
        String isim =scanner.nextLine();
        System.out.println("Hosgeldin "+isim);
        dortIslem dortslem=new dortIslem();
        System.out.println(dortslem.topla(10,56));
        Logaritma logaritma=new Logaritma();
        System.out.println(logaritma.logHesapla(10,10));



    }
}
