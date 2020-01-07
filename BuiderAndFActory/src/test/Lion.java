package test;

public class Lion extends Animal {
    public Lion(int age) {
        super(age);
        System.out.println("subs constructor call");
    }

    static {
        System.out.println("static call");
    }
    public void printAge(){
        System.out.println(getAge());
        System.out.println(name);

    }

}
