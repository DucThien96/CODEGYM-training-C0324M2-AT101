public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = productManager.inputProductData();
        productManager.addProduct(product);

        for (Product product1:productManager.getProducts()){
            System.out.println("Product ID:" +product1.getId()+ "Product name: "+product1.getName()+ "Product Price: "+ product1.getPrice());
        }
//        System.out.println(productManager.getProducts());
        }
    }



