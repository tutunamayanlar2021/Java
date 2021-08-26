package FirstProject;

public class order {
	protected int[] sayilar;
	public order(int[] sayilar) {
		this.sayilar=new int [sayilar.length];
		for(int i=0;i<sayilar.length;i++) {
			this.sayilar[i]=sayilar[i];
		}
	}
	public order (int sayi) {
		sayilar=new int [ String.valueOf(sayi).length()];
		int index =sayilar.length-1;
		while(sayi>0) {
			sayilar[index--]=sayi%10;
			sayi/=10;	
		}
		
	}
	public int[] sirala(){
		for(int i=0;i<sayilar.length-1;i++) {
			for(int j=1;j<sayilar.length-i;j++) {
				if(sayilar[j]<sayilar[j-1]) {
					int tmp=sayilar[j-1];
					sayilar[j-1]=sayilar[j];
					sayilar[j]=tmp;
				}
			}
		}
		int []sirali=new int [sayilar.length];
		for(int i=0;i<sayilar.length;i++) {
			sirali[i]=sayilar[i];
		}
		return sirali;
	}
	@Override
	public String toString() {
		String str="";
	    sirala();
	    for(int sayi:sayilar) {
	    	str += sayi+" ";
	    }
		return str;
	}

}
