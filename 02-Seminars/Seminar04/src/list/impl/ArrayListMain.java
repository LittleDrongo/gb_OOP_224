package list.impl;

import list.GBList;

public class ArrayListMain {
    public static void main(String[] args) {
        GBList<String> array = new GBArrayList<String>();

        array.add("dsadas");
        array.add("523f");
        array.add("gy1");

        System.out.println(array);
        System.out.println(array.size());

        array.remove(2);
        System.out.println(array);
        System.out.println(array.size());

    }
}
