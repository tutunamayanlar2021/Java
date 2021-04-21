public class Main {

    public static void main(String[] args) {

    Product product=new Product();
    product.id=1;
    product.name=" Laptop";
    product.description="Asus laptop";
    product.price =5000;
    product.stocAmount=5;
    //System.out.println(product.name);

    ProductManager productManager =new ProductManager();
    productManager.Add(product);


    }
}
