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


        Pharmacy p1 = new Pharmacy();
        p1.addComponents(water, azitronite);

        Pharmacy p2 = new Pharmacy();
        p2.addComponents(penicillin, water);

        Pharmacy p3 = new Pharmacy();
        p3.addComponents(azitronite, penicillin, water);

        Pharmacy p4 = new Pharmacy();
        p4.addComponents(azitronite, penicillin, water, penicillin);


        List<Component> components = new ArrayList<>();

        components.add(azitronite);
        components.add(water);
        components.add(penicillin);

        System.out.println(components);

        Collections.sort(components,Comparator.reverseOrder());
        System.out.println(components);

        System.out.println("----------[ Домашнее задание ]----------------------");

        List<Pharmacy> pharmacys = new ArrayList<>();
        pharmacys.add(p4);
        pharmacys.add(p1);
        pharmacys.add(p2);
        pharmacys.add(p3);


        System.out.println(pharmacys);

        System.out.println("----------[ До сортировки Pharmacy ]----------------------");
        for (Pharmacy pharmacy : pharmacys) {
            System.out.println(pharmacy);
        }

        Collections.sort(pharmacys);

        System.out.println("-------------[ После сортировки Pharmacy]-------------------");
        for (Pharmacy pharmacy : pharmacys) {
            System.out.println(pharmacy);
        }
    }
}
