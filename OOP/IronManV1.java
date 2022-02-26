package OOP;

public class IronManV1 {
    int helmet=1;
    public String arcReactor="palladium";
    int legs=2;
    int hands;
    String ai;

    public void setHands(int hands) {
        this.hands = hands;
    }

    public void setAi(){
        ai="jarvis";
    }

    public void canFly(){
        System.out.println("Main ud sakta hun!");
    }
    private void canSwim(){

    }
    private void canShootMissile(){

    }
    public static void main(String[] args) {
        IronManV1 im1=new IronManV1();
    }
}
