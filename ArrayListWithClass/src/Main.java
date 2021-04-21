import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<Customer> customers=new ArrayList<>();
        Customer kader=new Customer(1,"Kader","Oral");
        //customers.add(new Customer(1,"Kader","Oral"));
        customers.add(new Customer(1,"Derya","Oral"));
        customers.add(new Customer(1,"Deniz","Oral"));
        customers.remove(customers.add(new Customer(1,"Deniz","Oral")));//silinmez bu sekil

        customers.remove(kader);//silinir
        for(Customer customer:customers){
            System.out.println(customer.name);
        }
    }
}
