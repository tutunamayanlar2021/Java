public class CustomerManager {
    private BaseLogger logger;
    public CustomerManager(BaseLogger logger){
        this.logger=logger;
    }
    public void Add(){
        System.out.println("musteri eklendi!");
        this.logger.Log("log mesajı");
    }
}
