package product;
import java.util.*;
public class Product {
    private String id;
    private String name;
    private double price;
    private double discount;
    
    public Product(String id, String name, double price, double discount){
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
    }
    public double getFinalPrice(){
        return price - (price*discount/100);
    }
    static void storeInfo(){
        System.out.println("--Cửa hàng FunnyCode-FPT University");
    }
    public void display(){
        System.out.println("Mã: " + id);
        System.out.println("Tên: "+ name);
        System.out.printf("Giá gốc: %.2f%n", price);
        System.out.println("Giảm giá: " + discount +"%");
        System.out.printf("Giá sau giảm: %.2f%n ", getFinalPrice());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        System.out.print("Nhập mã sản phẩm: ");
        String id = sc.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá gốc: ");
        double price = sc.nextDouble();
        System.out.print("Nhập % giảm giá: ");
        double discount = sc.nextDouble();
        
        Product p = new Product(id, name, price, discount);
        System.out.println("\n--Thông tin sản phẩm--");
        p.display();
        sc.close();
    }
    
}
