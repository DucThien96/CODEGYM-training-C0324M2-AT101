import javax.sound.sampled.Line;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String FILE_NAME = "product.csv";
    public static final String COMMA = ",";

    public static void main(String[] args) throws IOException {
        ProductManager productManager = new ProductManager();
//        Product product = productManager.inputProductData();
//        productManager.addProduct(product);
//
//        for (Product product1:productManager.getProducts()){
//            System.out.println("Product ID:" +product1.getId()+ "Product name: "+product1.getName()+ "Product Price: "+ product1.getPrice());
//        }
        productManager.menu();
        //        System.out.println(productManager.getProducts());

//        try {
//            //true ghi tiep con false k ghi
//        FileWriter fileWriter = new FileWriter(FILE_NAME, true);
//        BufferedWriter bufferedWritter = new BufferedWriter(fileWriter);
//        bufferedWritter.write("xin chao");
//        bufferedWritter.newLine();
//        bufferedWritter.write("Tam biet");
//        bufferedWritter.newLine();
//        bufferedWritter.write("ket thuc");
//        bufferedWritter.newLine();
//
//        bufferedWritter.close();
//
//
////        fileWriter.write("hello");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


        //doc file
//            List<String> list = new ArrayList<>();
//
//        try {
//            FileReader fileReader = new FileReader(FILE_NAME);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String line = null;
//            while ((line = bufferedReader.readLine())!=null) {list.add(line); }
//
//
//
//        }catch (FileNotFoundException e){
//            throw new RuntimeException(e);
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//        System.out.println(list);

        //Ghi object
//        Product product1 = new Product(1,"Samsung", 100);
//        Product product2 = new Product(2,"iphone", 200);
//        Product product3 = new Product(3,"Oppo", 300);
//
//        List<Product> productList = new ArrayList<>();
//        productList.add(product1);
//        productList.add(product2);
//        productList.add(product3);
//
//        String line = null;
//        for (Product product: productList) {
//            line = product.getId() + COMMA + product.getName() + COMMA + product.getPrice();
//            try {
//                FileWriter fileWriter = new FileWriter(FILE_NAME, true);
//                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//                bufferedWriter.write(line);
//                bufferedWriter.newLine();
//                bufferedWriter.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//
//        }

        //Doc Object
//        List<String> list = new ArrayList<>();
//        try {
//            FileReader fileReader = new FileReader(FILE_NAME);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String line = null;
//            while ((line = bufferedReader.readLine()) != null) {
//                list.add(line);
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(list);
//
////        for (int i=0; i< list.size();i++){
////            for (int j=0; j<list.get(i).split(COMMA).length;j++){
////                String line
////            }
////        }
//        String[] lineSplit = list.get(0).split(COMMA);
////        Product product = new Product(Integer.parseInt(lineSplit[0]),lineSplit[1],Double.parseDouble(lineSplit[2]) );
////
//    String[] lineSplit1 = list.get(0).split(COMMA);
//    Product product1 = new Product(Integer.parseInt(lineSplit1[0]),lineSplit1(1),Double.parseDouble(lineSplit1[2]));
//
//    String[] lineSplit2 = list.get(0).split(COMMA);
//    Product product2 = new Product(Integer.parseInt(lineSplit2[0]),lineSplit2(1),Double.parseDouble(lineSplit2[2]));
//
//        String[] lineSplit3 = list.get(0).split(COMMA);
//        Product product3 = new Product(Integer.parseInt(lineSplit3[0]),lineSplit3(1),Double.parseDouble(lineSplit3[2]));
//
//        List<Product> productList = new ArrayList<>();
//        productList.add(product1);
//        productList.add(product2);
//        productList.add(product3);

    }}







