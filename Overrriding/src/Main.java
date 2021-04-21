public class Main {

    public static void main(String[] args) {
        OgrKrediManager ogrKrediManager = new OgrKrediManager();
        BaseKrediManager [] krediManagers=new BaseKrediManager[]{new TarımKrediManager(),new OgrKrediManager()
        ,new OgrenciKrediManager()};
        for (BaseKrediManager krediManager:krediManagers){
            System.out.println(krediManager.hesapla(1000));
        }

    }
}
