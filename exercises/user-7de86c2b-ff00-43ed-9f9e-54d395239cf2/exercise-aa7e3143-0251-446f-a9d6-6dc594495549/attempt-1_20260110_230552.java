
package testmot;

import java.util.Scanner;


public class Product {
    String id;
    String name;
    double price;
    double discount;

    public Product(String id, String name, double price, double discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public Product() {
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product ID : ");
            String id = sc.nextLine();
        System.out.print("Enter product name : ");
            String name = sc.nextLine();
        System.out.print("Enter product price : ");
            double price = Double.parseDouble(sc.nextLine());
        System.out.print("Enter product discount : ");
            double discount = Double.parseDouble(sc.nextLine());
            
        Product pd1 = new Product(id, name, price, discount);
        pd1.getFinalPrice();
        pd1.printInfo();
                
    }

    public double getFinalPrice() {
        double finalPrice = this.price - (this.price*this.discount/100);
        return finalPrice;
    }

    public void printInfo() {
        System.out.println("Product ID : " + this.id);
        System.out.println("Product name : " + this.name);
        System.out.println("Product first price : " + this.price);
        System.out.println("Product discount : " + this.discount);
        System.out.println("Product final price : " + getFinalPrice());
    }
    
    
    
    public static void storeInfo(){
        System.out.println("Cua hang FunnyCode - FPT University");
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
}
    
