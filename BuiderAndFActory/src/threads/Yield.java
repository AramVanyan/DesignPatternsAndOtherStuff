package threads;

public class Yield extends Thread {
    public void run()
    {
        for (int i=0; i < 5 ; i++)
            System.out.println(Thread.currentThread().getName()
                    + " in control");
    }
}
