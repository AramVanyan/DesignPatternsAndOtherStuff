package builder;

public class Main {
    public static void main(String[] args) {
//        Worker.WorkerBuilder builder = new Worker.WorkerBuilder("AT5465465");
//        builder.address("Address 21")
//                .firstName("Hayk")
//                .lastName("Aramyan")
//                .phone(1231321); // method chaining
        Worker ww = new Worker.WorkerBuilder("AT5465465")
                .address("Address 21")
                .firstName("Hayk")
                .lastName("Aramyan")
                .phone(1231321)
                .build();
    }
}
