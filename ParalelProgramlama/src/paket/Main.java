package paket;

public class Main {

	public static void main(String[] args) {
		Runnable aYaz = new KarakterIslem('a',100);
		Runnable bYaz = new KarakterIslem('b',100);
		Runnable yaz100 = new RakamIslem(100);
		
		Thread thread1 = new Thread(aYaz);
		Thread thread2 = new Thread(bYaz);
		Thread thread3 = new Thread(yaz100);
		
		thread1.start();
		thread2.start();
		thread3.start();
		while(thread1.isAlive()|| thread2.isAlive()|| thread3.isAlive()) {
			
		}
		
		
		
	}

}
