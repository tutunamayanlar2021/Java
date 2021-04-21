public class Main {

    public static void main(String[] args) {
        // ASAL SAYI********************
     /*   int number=2;
        boolean isPrime=true;
        if(number==1){
            System.out.println("Sayi asal degildir");
            return;
        }
        for (int i=2;i<number;i++)
        {
          if (number%i==0) {
              isPrime =false;
          }
        }
        if (isPrime){
            System.out.println("Sayi asaldır");
        }
        else
        {
            System.out.println("Sayi asal degildir");
        }*/
        //SESLİ HARFLER

        char harf = 'E';
        /*switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("kalin sesli harf");
                break;
            default:
                System.out.println("ince sesli harf");


        }*/

        //MUKEMMEL SAYİ*****************************
        /* int number =28;
         int total=0;
         for (int i=1;i<number;i++)
         {
             if(number%i==0){
                 total=i+total;

             }
         }

            System.out.println(total);

        if (total==number){
            System.out.println("sayi mukemmeldir");
        }
        else{
            System.out.println("sayi mukemmel degildir");
        }*/


        ///**********ARKADAS SAYI***************
        //220-284
       /* int num1=220;
        int num2=284;
        int total1=0;
        int total2=0;
        for(int i =1;i<num1;i++){
            if(num1%i==0)
            total1 =i+total1;
        }
        for(int j=1;j<num2;j++){
            if(num2%j==0)
            total2=total2+j;
        }

        if(total1==num2 && total2==num1){
            System.out.println("bu sayılar arkadstır");
        }else{
            System.out.println("bu sayılar arkads degil");
        }*/
        ///**********SAYI BULMA**************
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 9;
        boolean varmı = false;
        for (int sayi : sayilar) {
            if (aranacak == sayi)
                varmı = true;
            break;
        }
        if (varmı == true)
            System.out.println("sayi mevcut");
        else {
            System.out.println("sayi mevcut degil");
        }
    }
}
