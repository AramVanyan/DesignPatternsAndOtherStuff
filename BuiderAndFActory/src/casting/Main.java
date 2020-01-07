package casting;

public class Main {
    public static void main(String[] args) {
        Parent child1 = new Child();
        child1.action();
        ((Child)child1).childAction();
    }
}
