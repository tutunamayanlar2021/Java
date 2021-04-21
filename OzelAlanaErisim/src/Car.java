public class Car {
///CONSTRUCTOR//
    public Car (String color,String model){
        this(color,model,0,0);

    }
    public Car(String color,String model,int doors,int fiyat){
       this.color=color;
       this.doors=doors;
       this.fiyat=fiyat;
       this.model=model;
    }
    public Car(){
        /*this.color="bilgi yok";
        this.doors=0;
        this.fiyat=0;
        this.model="bilgi yok";*/
        this("bilgi yok","bilgi yok",0,0);

    }
    private int fiyat;
    private String model;
    private int doors;
    private String color;


    public void setColor(String color){//deger verme

        this.color =color ;
    }
    public  String getColor(){//dısardan degerini alma
            return this.color;
    }//deger getirme

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void showInfos(){
        System.out.println("arabanın rengi:"+this.color);
        System.out.println("arabanın modeli:"+this.model);
        System.out.println("arabanın fiyatı:"+this.fiyat);
        System.out.println("arabanın kapısı:"+this.doors);
    }
}
