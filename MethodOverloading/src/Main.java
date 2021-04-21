public class Main {

    public static void skorHesapla(String name,int scor){
        System.out.println(name+" isimli oyuncunun puanı:"+scor);
    }
    public static void skorHesapla(int scor){
        System.out.println("isimsiz oyuncunun puanı:"+scor);
    }
    public static void skorHesapla(String name){
        System.out.println(name+" isimli oyuncunun puanı:0");
    }
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.Topla(1, 9));
        System.out.println( dortIslem.Topla1(2,5,6));

        skorHesapla("Kader",14);
        skorHesapla(15);
        skorHesapla("Murat");
    }
}
