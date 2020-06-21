package pl.sdaacademy.designpatterns.behavioral.observer;

public class Billboard implements PressObserver {
    private String text;

    @Override
    public void update(String paper) {
        System.out.println("Z billboardu zdejmowany jest tekst: " + text +
                " i od teraz wyświetlane jest: " + (text =paper.substring(0,10)));
    }
}
