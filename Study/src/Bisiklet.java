public class Bisiklet {
    int hız;
    int agirlik;
    int vites;
    public int hızDegistir(int yeniHiz){
       return hız=yeniHiz;
    }
    public int vitesArttır(int yeniVites){
        return vites+yeniVites;
    }
    public int vitesAzalat(int yeniVites){
       return vites-yeniVites;
    }
    public void hızGoster(){
        System.out.println("hızımız:"+hız);
        System.out.println("vitesimiz:"+vites);
    }

}
