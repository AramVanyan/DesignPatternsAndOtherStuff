public class Singleton {
    private static Singleton singleton = null;
    private String firstName;
    private String lastName;
    String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    private Singleton(){
        firstName = "Aram";
        lastName  = "Vanyan";
    };
    static Singleton getInstance(){
        if(singleton == null) singleton = new Singleton();
        return singleton;
    }
}
