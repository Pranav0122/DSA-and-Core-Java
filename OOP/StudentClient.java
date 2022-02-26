package OOP;

public class StudentClient {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        System.out.println(s1.uniform);
        System.out.println(s2.uniform);


//        s1.uniform="blue";//do not access static variable by object instead of it use classname to access it and change its value
        Student.uniform="blue";

        System.out.println(s1.uniform);
        System.out.println(s2.uniform);
    }
}
