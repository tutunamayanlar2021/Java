public class Main {

    public static void main(String[] args) {
     WomanGameCalculator gameCalculator= new WomanGameCalculator();
        gameCalculator.hesapla();
        gameCalculator.gameOver();

        GameCalculator gameCalculator1=new ManGameCalculator();
        gameCalculator1.gameOver();
        gameCalculator1.hesapla();

        GameCalculator gameCalculator2 =new KidsGameCalculator();
        gameCalculator2.hesapla();

    }
}
