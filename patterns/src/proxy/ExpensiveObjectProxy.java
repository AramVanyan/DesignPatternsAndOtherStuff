package proxy;

/**
 * The Proxy pattern allows us to create an intermediary that acts as an interface to another resource,
 * while also hiding the underlying complexity of the component.
 */

public class ExpensiveObjectProxy implements ExpensiveObject{
    private static ExpensiveObject object;

    @Override
    public void process() {
        if (object == null) {
            object = new ExpensiveObjectImpl();
        }
        object.process();
    }
}
