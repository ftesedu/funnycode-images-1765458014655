
package pet;

public class Pet {
    private String name;
    private int age;
    private double weight;
    
    public Pet(){
    }

    public Pet(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public String speak(){
        return "Pet is making a sound";
    }
    
}
class Dog extends Pet {
    
    public Dog(){
        super();
    }
    
    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public String speak(){
        return "Dog is banking";
    }
    
    public void fetchBall(){
        System.out.println("Dog is fetching the ball");
    }
}
class Cat extends Pet {

    public Cat() {
        super();
    }
    

    public Cat(String name, int age, double weight) {
        super(name, age, weight);
    }
    
    @Override
    public String toString(){
        return "Cat is meowing";
    }
    
    public void chaseMouse(){
        System.out.println("Cat is chasing a mouse");
    }
}
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Pet> pets = new ArrayList<>();
        Dog dog1 = new Dog("John", 3 ,12.5);
        Cat cat1 = new Cat("May", 2, 5.3);
        
        Dog dog2 = new Dog();
        dog2.setName("Black");
        dog2.setAge(4);
        dog2.setWeight(8.3);
        
        Cat cat2 = new Cat();
        cat2.setName("July");
        cat2.setAge(3);
        cat2.setWeight(4.5);
        
        pets.add(dog1);
        pets.add(cat1);
        pets.add(dog2);
        pets.add(cat2);
        
        
        for(Pet pet: pets){
            System.out.println("Pet: " + pet.getName() + ": " + pet.getAge() + ", " + pet.getWeight() );
        }
        System.out.println(dog1.speak());
        dog1.fetchBall();
        System.out.println(cat1.speak());
        cat1.chaseMouse();
    }
}
