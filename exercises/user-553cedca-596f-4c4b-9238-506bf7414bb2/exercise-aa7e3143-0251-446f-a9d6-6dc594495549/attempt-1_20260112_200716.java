package exercise1;
import java.util.Scanner;
class Product {
    String id;
    String name;
    double price;
    double discount;
    public Product (String id, String name, double price, double discount){
        this.id = id;
        this.name = name;
        this.discount = discount;
        this.price = price;
    }
    public double getFinalPrice(){
        return price - (price * discount / 100);
    }
     public static void storeInfo() {
        System.out.println("Cửa hàng FunnyCode - FPT University");
    }
    public void displayProduct(){
        System.out.println("---Thông tin sản phẩm---");
        System.out.println("Mã ID: " + id);
        System.out.println("Tên sản phẩm: " + name);
        System.out.println("Giá gốc: " + price);
        System.out.println("Giảm giá: " + discount + "%");
        System.out.println("Giá sau khi giảm: " + getFinalPrice());
    }
}
public class Exercise1 {
   
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhập mã sản phẩm: ");
            String id = sc.nextLine();
            
            System.out.print("Nhập tên sản phẩm: ");
            String name = sc.nextLine();
            
            System.out.print("Nhập giá gốc: ");
            double price = sc.nextDouble();
            
            System.out.print("Nhập % giảm giá: ");
            double discount = sc.nextDouble();
            
            Product p = new Product(id, name, price, discount);
            p.displayProduct();
            System.out.println("-------------------------");
            Product.storeInfo();
        }
    }
    
}
