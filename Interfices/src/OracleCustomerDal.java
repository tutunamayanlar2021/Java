//bir kclass birden fazla interfesi implemente edebilir
public class OracleCustomerDal implements IcustomerDal,IRepository {

    @Override
    public void add() {
        System.out.println("oracle eklendi");
    }
}
