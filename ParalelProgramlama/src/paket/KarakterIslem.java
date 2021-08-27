package paket;

public class KarakterIslem implements Runnable{
	private char yazilanKarakter;
	private int kacKere;
	public KarakterIslem(char c,int k) {
		yazilanKarakter = c;
		kacKere = k ;
	}
	
 @Override
public void run() {
	for(int i=0;i<kacKere;i++) {
		System.out.print(yazilanKarakter);
	}
	
}
}
