package Interfaces;

public interface Programmer {
    String typeOfWork = "coding";
    default void code(){
        System.out.println("coding in some language");
    }
    static void printLanguage(){
        System.out.println("smth");
    };
    void printSmth();
};
