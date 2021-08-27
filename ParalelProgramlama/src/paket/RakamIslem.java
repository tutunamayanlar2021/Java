package paket;

public class RakamIslem implements Runnable {
	private int sonSayi;
	public RakamIslem(int s) {
		sonSayi =s;
	} 
	@Override
	public void run() {
		for(int i=0;i<=sonSayi;i++) {
			System.out.print(i);
		}
		
	}
}
