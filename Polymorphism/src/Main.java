public class Main {

    public static void main(String[] args) {
        EmailLogger emailLogger = new EmailLogger();
        emailLogger.Log("Bahtsiz coin Kader");
        BaseLogger[] loggers={new DatabaseLogger(),new EmailLogger(), new FileLogger()};
        for (BaseLogger logger:loggers) {
            logger.Log(" yes");
        }
        CustomerManager customerManager=new CustomerManager(new FileLogger());
        customerManager.Add();
    }



}
