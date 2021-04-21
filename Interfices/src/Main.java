public class Main {
///interfice ler new lenmezler
    public static void main(String[] args) {
        //IcustomerDal icustomerDal =new MySqlCustomerDal();
        //icustomerDal.add();
        //1.yontem
       /* CustomerManager customerManager=new CustomerManager();
        customerManager.icustomerDal=new OracleCustomerDal();
        customerManager.add();*/
        //2.Yontem
        CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
        customerManager.add();
    }
}
