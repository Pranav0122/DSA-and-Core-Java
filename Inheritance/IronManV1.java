package Inheritance;

public class IronManV1 {
    protected int helmet=1;
    int legs=2;
    int hands=2;
    String arcReactor="palladium";
    public void canFly(){
        System.out.println("Main ud ni sakta");
    }
    final public void missiles(){//inherited but cannot be overrided
        System.out.println("missiles");
    }
    private void flameThrower(){//inheritance not allowed
        System.out.println("Main aag barsata hun!");
    }
}
