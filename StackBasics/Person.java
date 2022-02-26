package StackBasics;

public class Person {

    String fullName;
    public Person(){
        fullName="Pranav";
    }
    public Person(String fullName){
        this.fullName=fullName;
    }

    public static void main(String[] args) {
        Person p= new Person("Abhi Jaswal");
        System.out.println(p.fullName);
    }
}
