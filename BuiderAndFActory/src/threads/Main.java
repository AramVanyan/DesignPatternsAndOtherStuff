package threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        WalkThread walkThread = new WalkThread();
//        Thread talkThread = new Thread(new TalkThread());
//        System.out.println(walkThread.getState());
//        walkThread.setPriority(Thread.MIN_PRIORITY);
//        talkThread.setPriority(Thread.MAX_PRIORITY);
//        talkThread.start();
//        Thread.currentThread().join();
//        walkThread.start();
//        walkThread.join();
//        System.out.println("smth");
//        throw new RuntimeException();
//        System.out.println(walkThread.getState());
//        Thread yield = new Yield();
//        yield.start();
//        for (int i = 0; i < 5 ; i++) {
//            TimeUnit.MILLISECONDS.sleep(200);
//            Thread.yield();
//            System.out.println(Thread.currentThread().getName()
//                    + " in control");
//        }
//        Thread t = new Thread(new Join());
//        t.start();
//        // Waits for 1000ms this thread to die.
//        t.join();
//        System.out.println("\nJoining after 1000"+
//                " mili seconds: \n");
//        System.out.println("Current thread: " +
//                t.getName());


        // Checks if this thread is alive
//        System.out.println("Is alive? " + t.isAlive());
        InviteAction invite1 = new InviteAction("Aram");
        InviteAction invite2 = new InviteAction("Tiko");
        new Thread(()->{
            invite1.invite(invite2);
        }).start();
        new Thread(()->{
            invite2.invite(invite1);
        }).start();
    }
}
