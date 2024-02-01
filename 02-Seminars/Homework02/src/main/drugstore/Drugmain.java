package main.drugstore;

import main.drugstore.components.Azitronite;
import main.drugstore.components.Penicillin;
import main.drugstore.components.Water;

import java.util.*;

public class Drugmain {

    public static void main(String[] args) {
        Component water = new Water("Water", 10D, 1);
        Component azitronite = new Azitronite("Azitronite", 2D, 14);
        Component penicillin = new Penicillin("penicillin", 1.6D, 6);


        PharmacyTwo p1 = new PharmacyTwo();
        p1.addComponents(water, azitronite);

        PharmacyTwo p2 = new PharmacyTwo();
        p2.addComponents(penicillin, water);

        PharmacyTwo p3 = new PharmacyTwo();
        p3.addComponents(azitronite, penicillin);

        List<Component> components = new ArrayList<>();

        components.add(azitronite);
        components.add(water);
        components.add(penicillin);

        System.out.println(components);

        Collections.sort(components);
        System.out.println(components);

//        Iterator<Component> iterator = p1;
//        while (iterator.hasNext()) {
//            System.out.println(p1.next().toString());
//        }

//        for (Component c : p2) {
//            System.out.println(c);
//        }

    }
}
