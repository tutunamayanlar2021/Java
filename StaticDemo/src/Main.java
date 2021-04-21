public class Main {

    public static void main(String[] args) {
	  ProductManager manager =new ProductManager();
	  Product product=new Product();
	  product.name="";
	  product.price=500;
	  product.id=100;
	  manager.add(product);
		DatabaseHelper.Crud.creat();
		DatabaseHelper.connection.creatConnection();

    }
}
