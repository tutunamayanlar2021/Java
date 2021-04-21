public class Main {

    public static void main(String[] args) {
       // BaseDatabaseManager baseDatabaseManager=new OracleDataManager();
        //baseDatabaseManager.getData();
        CustomerManeger customerManeger=new CustomerManeger();
        customerManeger.baseDatabaseManager=new OracleDataManager();
        customerManeger.baseDatabaseManager=new sqlseverDatabaseManager();
        customerManeger.baseDatabaseManager=new MySqlDatabaseManager();
        customerManeger.getCustomers();
    }
}
