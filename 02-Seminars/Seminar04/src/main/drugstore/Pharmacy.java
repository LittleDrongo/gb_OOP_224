package main.drugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterable<Component> , Copmparable, Comparable<Pharmacy> {
    private List<Component> components = new ArrayList<>();

    private int index = 0;

    public void addComponents(Component... components) {
        for (Component c : components) {
            this.components.add(c);
        }
    }

    public int getComponentsSum() {
        int sum = 0;
        for (Component component : this.components) {
            sum += component.getPower();
        }
        return sum;
    }

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() { //Анонимный класс

            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }

    @Override
    public String toString() {
        return String.format("components = %s, count = %s, sum = %s", components, components.size(), this.getComponentsSum());
    }

    @Override
    public int compareTo(Pharmacy otherPharmacy) {

        int otherPharmacySum = 0;
        int thisPharmacySum = 0;

        for (Component c : otherPharmacy.components) {
            otherPharmacySum += c.getPower();
        }

        for (Component c : this.components) {
            thisPharmacySum += c.getPower();
        }

        if (thisPharmacySum < otherPharmacySum) {
            return -1;
        }
        else if (thisPharmacySum > otherPharmacySum) {
            return 1;
        } else return 0;
    }
}