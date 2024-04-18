

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    public ArrayList<Product> products;


    public ProductManager(){
        ArrayList<Product> productList = new ArrayList<>();
        this.products = productList;
    }
    public boolean isIDInProductList (int id){
        if (!products.isEmpty()){
            for (Product product: products) {
                if (product.getId() == id)
                    return true;
            }
        }
        return false;
    }
    public Product inputProductData() {
        int id;
        String name;
        double price;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Product Name: ");
        name = scanner.nextLine();
        boolean isId;
        do {
            System.out.println("Product id: ");
            id = scanner.nextInt();
            isId = true;
            if (isIDInProductList(id)) {
                System.out.println("ID da ton tai");
            } else {
                isId = false;
            }
        } while (isId);
        System.out.println("product price:");
        price = scanner.nextDouble();
        Product product = new Product(id, name, price);
        return product;
    }
    public ArrayList<Product> getProducts() {
        return products;
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public Product findProductById(int id){
        if(products.isEmpty()){
            System.out.println("Khong co san pham");
        }else {
            for (Product product: products) {
                if (product.getId() == id){
                    return product;
                }
                }
            }
        return null;
        }


//tao menu
    public void menu(){
        char choice = '?';
        while (choice!='0'){
            System.out.println("--Menu--");
            System.out.println("1. Them");
            System.out.println("2. Sua");
            System.out.println("3. Xoa");
            System.out.println("4. Tim theo Id");
            System.out.println("Nhap vao lua chon");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextLine().charAt(0);
            switch (choice) {
                case '1':
                    Product product = inputProductData();
                    addProduct(product);
                    break;
                case '2':
                    System.out.println("Sua");
                    break;
                case'3':
                    System.out.println("Xua");
                    break;
                case '4':
                    int id = InputId();
                    Product product1 = findProductById(id);
                    showProduct();
                    break;
                case '5':
                    showProducts();
                    break;
            }
        }
    }
    private void showProduct(){
        for (Product product: products){
            System.out.println("Product ID:"+product.getId() +"Product Name: "+ product.getName()+ "Product Price: "+ product.getPrice());
        }
    }
private void showProducts(){
    for (Product product: products){
        System.out.println("Product ID:"+product.getId() +"Product Name: "+ product.getName()+ "Product Price: "+ product.getPrice());
    }
}

private int InputId(){
    System.out.println("Product ID: ");
    Scanner scanner = new Scanner(System.in);
    int id = scanner.nextInt();
    return id;
}
}