package main.drugstore;

public abstract class Component {
    private String title;
    private Double weight;
    private int power;

    public Component(String title, Double weight, int power) { //ALT + Insert
        this.title = title;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public String toString() {
        return String.format("Title = %s, power = %s", title, power);
    }
}


