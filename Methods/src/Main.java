public class Main {

    public static void main(String[] args) {

        String message ="bungün her zamnki gibi bir gün";
        int sayi =topla(5,7);
        //System.out.println(sayi);
        //int toplam=total(1,5,6,0);
        System.out.println(total(1,5,6,8));
    }

    public static int  total(int...numbers){///veriable arguments
        int toplam=0;
        for(int num:numbers){
            toplam+=num;
        }
        return toplam;
    }

    public static void sil(){

    }
    public static void guncelle(){

    }
    public static int topla(int num1,int num2){
        return num1+num2;
    }
}
