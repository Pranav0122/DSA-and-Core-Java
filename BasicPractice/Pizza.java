package BasicPractice;

class Product{
    int discount;
    public Product(){
        this.discount=20;
    }
    public int getDiscount(){
        return discount;
    }
    public double calculateDiscount(){
        return discount * 3.5;
    }
}
class Food extends Product{
    int discount;
    public Food(){
        this.discount=25;
    }
    public int getDiscount(){
        return discount*3;
    }
    public double calculateDiscount(){
        return discount;
    }
}
public class Pizza extends Food{
    int discount;
    public Pizza(){
        this.discount=5;
    }
    public int getDiscount(){
        return discount*3;
    }

    public static void main(String[] args) {
        Product food= new Food();
        System.out.println(food.discount+food.getDiscount()+food.calculateDiscount());//20+75+70.0+25=190.0
    }
}
