package main.clients;

public interface Goable {
    void go();
    default double getRunSpeed(){
        return 10;
    }

}
