package pl.sdaacademy.designpatterns.creational.singleton;

import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        LocalDate d;
        UniverseV1 universe1 = UniverseV1.INSTANCE;
        UniverseV2 universe2 = UniverseV2.getInstance();
        UniverseV3 universe3 = UniverseV3.getInstance();
        UniverseV4 universe4 = UniverseV4.getInstance();

        System.out.println(universe3 == UniverseV3.getInstance());
        System.out.println(universe4 == UniverseV4.getInstance());
    }
}
