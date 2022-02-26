package ExceptionHandling;

public class ExceptionHierarchy {
    private static void employees() throws Exception{
        if(3000 >2500){

                throw new Exception("Humm na krte");
//            } catch (Exception e) {
//                System.out.println(e);
//                System.out.println("Hum milkr hi bana lenge");
//            }
//            System.out.println("hum bhi bna lenge");
        }
    }
    private static void assistant() throws Exception {
        System.out.println("Sunno employes tumhe ek project  banana hai");
//        employees();
        try {
            employees();
        } catch (Exception e) {//Exception e=new Exception()
            System.out.println(e.getMessage());
            System.out.println("Chalo main hi bna leta hun, warna naukri gayi");
        }
    }
    public static void main(String[] args) throws Exception {//Supervisor
        System.out.println("Sun assistant!");
        assistant();
        System.out.println("Tera promotion");
//        try {
//            assistant();
//
//            System.out.println("Beta tera pormotion");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            System.out.println("Gyi teri naukri");
//        }
    }
}
