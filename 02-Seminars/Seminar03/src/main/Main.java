package main;

import main.clients.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Goable> list = new ArrayList<>();

        Cat cat = new Cat();
        Cat cat2 = new Cat();

        list.add(cat);


        System.out.println(list);
    }
}


