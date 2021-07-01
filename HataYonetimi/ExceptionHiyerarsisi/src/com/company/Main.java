package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            int[] sayilar=new int[] {1,2,3};
            System.out.println(sayilar[5]);
        }catch (StringIndexOutOfBoundsException exception){//bu şekil hayata verir
            System.out.println(exception);
        }catch (Exception exception){//Böyle yaparak programın kesilmesi engellenir.
            System.out.println("Loglandi:"+exception);
        }
        finally {
            System.out.println("Ben Her Zaman Calisirim");
        }
    }
}
