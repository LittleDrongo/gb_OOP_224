package main.drugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PharmacyTwo implements Iterable<Component> {
    private List<Component> components = new ArrayList<>();
    private int index = 0;

    public void addComponents(Component ... components) {
        for(Component c : components){
            this.components.add(c);
        }
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
}

