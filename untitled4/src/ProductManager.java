
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class ProductManager {
    private ArrayList<Product> products;
    public static final String FILE_NAME = "product.csv";
    public static final String COMMA = ",";

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
        boolean isId = true;
        do {
            System.out.println("Product id: ");
            id = scanner.nextInt();
            if (isIDInProductList (id)) {
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
    public ArrayList<Product> getProducts () { return products; }
    public void addProduct (Product product) {
        String line = null;
        line = product.getId()+ COMMA+ product.getPrice()+ COMMA+ product.getName();
//        products.add(product);
//        System.out.println("Them san pham thanh cong");
        try {
            FileWriter fileWriter = new FileWriter(FILE_NAME,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e){
            throw new RuntimeException(e);
        }
        }
//    public Product findProductById (int id){
//        if(products.isEmpty()){
//            System.out.println("Khong co san pham");
//        }else {
//            for (Product product: products) {
//                if (product.getId() == id){
//                    return product;
//                }
//                }
//            }
//        return null;
//        }
    public Product findProductFromFile (int id){
        List<Product> productList = readProductsFromFile();
        if(!productList.isEmpty()){
            for (Product product: productList) {
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
            System.out.println("4. Tim theo ID: ");
            System.out.println("5. Danh sach san pham: ");
            System.out.println("Nhap vao lua chon: ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextLine().charAt(0);
            switch (choice) {
                case '1':{
                    Product product = inputProductData ();
                    addProduct (product);
                    break;}
                case '2':{
//                    System.out.println("Nhap ID: ");
                    int id = inputId();
                    updateProductById(id);
                    break; }
                case'3':
                    System.out.println("Xoa");
                    break;
                case '4': {
                    int id = inputId();
                    Product product = findProductFromFile(id);
                    if (product != null) {
                        showProduct(product);
                    }else {
                        System.out.println("khong tim thay");
                    }
                    break;
                }
                case '5':{
                    List<Product> productList = readProductsFromFile();
                    showProducts(productList);
                    break;}
            }
        }
    }

    private void updateProductById (int id){
        List<Product> productList = readProductsFromFile();
        for (int i=0; i< productList.size(); i++){
            if (productList.get(i).getId()== id){
            String name;
            double price;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Product Name: ");
            name = scanner.nextLine();
            System.out.println("product price:");
            price = scanner.nextDouble();
            productList.get(i).setName(name);
            productList.get(i).setPrice(price);
        }}

        for (int i = 0; i < productList.size(); i++){
        String line = null;
        line = productList.get(i).getId()+ COMMA+ productList.get(i).getPrice()+ COMMA+ productList.get(i).getName();
        try {
//            FileWriter fileWriter =new FileWriter(FILE_NAME,true);
            FileWriter fileWriter;
            if (i==0) {
                fileWriter = new FileWriter(FILE_NAME, false);
            }else {
                fileWriter = new FileWriter(FILE_NAME,true);
            }

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
                    } catch (IOException e){
            throw new RuntimeException(e);
        }
    }}


    private void showProduct(Product product){
        System.out.println("Product ID:"+product.getId() +"Product Name: "+ product.getName()+ "Product Price: "+ product.getPrice());
    }
private void showProducts(List<Product> productList){
    for (Product product: productList){
        System.out.println("Product ID:"+product.getId() +"Product Name: "+ product.getName()+ "Product Price: "+ product.getPrice());
    }
}

private int inputId() {
    System.out.println("Product ID: ");
    Scanner scanner = new Scanner(System.in);
    int id = scanner.nextInt();
    return id;
    }

    private List<Product> readProductsFromFile(){
        List<String> listLine = new ArrayList<>();
        List<Product> productList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_NAME);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine())!=null){
                listLine.add(line);
            }
                } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (String line: listLine){
            String[] lineSplit = line.split(COMMA);
            Product product = new Product(Integer.parseInt(lineSplit[0]),lineSplit[1],Double.parseDouble(lineSplit[2]));
            productList.add(product);
        }
        return productList;
    }
}