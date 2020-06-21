package pl.sdaacademy.designpatterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        PressPublisher pressPublisher = new PressPublisher("ABC XYZ");
        PressReader pressReader = new PressReader("Dariusz Dariuszowski");
        pressPublisher.addObserver(pressReader);
        pressPublisher.publish("Znaleziono ślady życia na Marsie!");

        Billboard billboard = new Billboard();
        pressPublisher.addObserver(billboard);
        pressPublisher.publish("Mecz między ABC i XYZ zakończony remisem");
    }
}
