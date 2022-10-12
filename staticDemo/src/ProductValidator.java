public class ProductValidator {
    static {
        System.out.println("Statik yapıcı çalıştı");
    }

    public ProductValidator() {
        System.out.println("Yapıcı blok çalıştı");
    }

    public static boolean isValid(Product product) {
        return product.price > 0 && !product.name.isEmpty();
    }

    public void bisey() {

    }
}
