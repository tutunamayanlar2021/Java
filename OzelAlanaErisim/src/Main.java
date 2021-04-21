public class Main {

    public static void main(String[] args) {

        Car car = new Car("Gumus","Kader",4,5000);
        Car car1=new Car();
        Car car2 =new Car("siyah","OKOCN");
       /* car.setColor("Gumus ");
        System.out.println("Arabanın rengi:"+car.getColor());*/
        car.showInfos();
        car1.showInfos();
        car2.showInfos();
    }
}
