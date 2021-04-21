import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList sayilar =new ArrayList();
        sayilar.add(10);
        sayilar.add(100);
        sayilar.add("Kader");
        //System.out.println(sayilar.size());

        //sayilar.set(0,200);//indeksi degistiirir
        //System.out.println(sayilar.get(0));
       // sayilar.remove(1);//indeksi siler
        //System.out.println(sayilar.get(1));//indeksi getirir
       // sayilar.clear();//hepsini siler
        for(Object i :sayilar){
            System.out.println(i);
        }

    }
}
