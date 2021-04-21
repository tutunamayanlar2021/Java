public class ProductManager {
        public void add(Product product){

            if(ProductValiDator.isValid(product)){
            System.out.println("Eklendi");
            }else{
                System.out.println("ürün gecersiz");
            }
            //static newlemeden de calsır ama yapıcı blok calısmaz
        }
}
