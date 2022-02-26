//class Animal{
//    public Animal() {
//        System.out.println("I am Animal");
//    }
//}
class Lion{
    public Lion(){
        System.out.println("I am Lion");
    }
}
class Cub extends Lion{
    public Cub(){
        System.out.println("I am Cub");
    }
}
public class Practice_1 {
    public static void main(String[] args) {
//        Cub c=new Cub();
//        System.out.println();
//        Lion l=new Lion();
        Lion ll=new Cub();
    }
}
