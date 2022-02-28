package Comparator;

public class Car {
    String name;
    int speed;
    int cost;
    public Car(String name,int speed,int cost){
        this.name=name;
        this.speed=speed;
        this.cost=cost;
    }
    public String toString(){
        return this.name+"|"+this.speed+"|"+this.cost;
    }
}
