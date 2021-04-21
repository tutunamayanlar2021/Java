public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager =new CustomerManager();
        CustomerManager customerManager2 =new CustomerManager();
       // customerManager=customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Updata();
        ///value
        int sayi1=10;
        int sayi2=20;
        sayi2=sayi1;
        sayi1=10;
        System.out.println(sayi2);
        //referans
        int []sayilar=new int[]{1,2,3};//int []sayilar={1,2,3} *yazilabilir
        int []sayilar2=new int[]{4,5,6};
        sayilar2=sayilar;
        sayilar[0]=10;
        System.out.println(sayilar2[0]);

    }
}
