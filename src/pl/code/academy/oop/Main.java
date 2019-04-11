package pl.code.academy.oop;

public class Main {
    public static void main(String[] args) {
        Fast c = new Car();
        c.driveFast();


        Fast b = new Bicycle();
        b.driveFast();

        Fast f = new Fast() {
            @Override
            public void driveFast() {
                System.out.println("jade szybko anonimowo !!");
            }
        };

        f.driveFast();


    }
}
