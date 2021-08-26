package FirstProject;

public class Mean extends order{
	public Mean(int []sayilar) {
		super(sayilar);
	}
	public double ortalama() {
		double toplam=0;
		for( var sayi: sayilar) {
			toplam += sayi;
		}
		return toplam/sayilar.length;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nortalama: "+ortalama() ;
	}
	

}
