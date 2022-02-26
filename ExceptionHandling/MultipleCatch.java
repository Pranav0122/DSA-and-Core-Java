package ExceptionHandling;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int a=2/0;
            System.out.println(a);
            return;
//            int a=5/0;
//            int[] arr=new int[5];
//           arr[6]=3;
//            String str="hello";
//            str.charAt(6);
        }
        catch (ArithmeticException e){
            System.out.println("0 se divide mt kro");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Galat index of array");
        }
        catch (Exception e){
            System.out.println("Exception ka sbse bada block");
        }
        finally {
            System.out.println("In finnaly block");
        }
        System.out.println("Hello Bhai");
    }
}
