import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
      String message ="  Başka biri olmayı dilerdim. ";
        System.out.println(message);
 /*
        System.out.println("Eleman sayisi:"+message.length());
        System.out.println("5.Eleman:"+ message.charAt(4));
        System.out.println(message.concat(" Ama olmadı"));
        System.out.println(message.startsWith("B"));
        System.out.println(message.endsWith("."));
        char[] karekterler =new char[5];
        message.getChars(0,5,karekterler,0);
        System.out.println(karekterler);
        System.out.println(message.indexOf('i'));
        System.out.println(message.indexOf("bi"));
//*///      System.out.println(message.replace(' ','-'));
//        System.out.println(message.substring(6));
//        System.out.println(message.substring(0,6));
/*
        for(String word:message.split(" "))
        {
            System.out.println(word);// kelimeleri tek tek yazdırır
        }*/
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
    }
}
