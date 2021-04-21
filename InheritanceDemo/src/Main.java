public class Main {

    public static void main(String[] args) {
        ogretmenKrediManager ogretmenKrediManager=new ogretmenKrediManager();
        KrediUI krediUI=new KrediUI();
        ogretmenKrediManager.Hesapla();
        krediUI.KrediHesapla(new ogretmenKrediManager());
    }
}
