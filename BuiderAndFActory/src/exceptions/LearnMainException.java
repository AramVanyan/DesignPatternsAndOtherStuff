package exceptions;

public class LearnMainException {
    public static void printLength(String string) throws SimpleException {
        System.out.println(string.length());
    }
    private static void hop(){
        throw new RuntimeException("cannot hop");
    }
    public static void main(String[] args) {
        try {
            System.out.println("aramka");
            throw new Exception();
        }
        catch (Exception e){
            System.out.println("catch block");
            System.exit(0);
        }finally {
            System.out.println("finally block");
        }

    }
}
