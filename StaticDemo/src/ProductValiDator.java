public class ProductValiDator {
    static {
        System.out.println("statik Yapıcı blok çalıstı");
    }
    public  ProductValiDator(){
        System.out.println("Yapıcı blok çalıstı");
    }
    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return  true;
        }else{
            return false;
        }
    }
    public void bisey(){

    }
    //inner classs
    public static class baskaClass{
        public  static  void ekle(){

        }
    }
}
