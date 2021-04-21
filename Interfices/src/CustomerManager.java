public class CustomerManager {
//1.yontem
    /*IcustomerDal icustomerDal;
    public void add(){
        icustomerDal.add();

    }*/

    //2. Yöntem
    private IcustomerDal icustomerDal;
    public  CustomerManager(IcustomerDal icustomerDal){
        this.icustomerDal=icustomerDal;

    }
    public void add(){
        icustomerDal.add();
    }
 }
