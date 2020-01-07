package test;

public class Animal {
    public final String name;
    private int age;


    public int getAge() {
        return age;
    }

    public Animal(int age){
        this.age = age;
        name = "Animal";
        System.out.println("supers constructor call");
    }
}
