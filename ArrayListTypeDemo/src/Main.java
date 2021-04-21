import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> Sehirler= new ArrayList<String>();
        Sehirler.add("Mardin");
        Sehirler.add("İzmir");
        Sehirler.add("Eskisehir");
        Sehirler.add("Adana");
        Sehirler.remove("Adana");
        Collections.sort(Sehirler);
        for(String sehir:Sehirler){
            System.out.println(sehir);
        }
    }
}
