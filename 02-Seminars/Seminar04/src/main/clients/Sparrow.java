package main.clients;

import java.time.LocalDate;

public class Sparrow extends Animal implements Flyable, Goable{
    public Sparrow(String nickName, Owner owner, LocalDate birthDate, Illness illness, int movementStatistics) {
        super(nickName, owner, birthDate, illness, movementStatistics);
    }

    public Sparrow(){
        super();
    }


    @Override
    public void fly() {

    }

    @Override
    public void go() {

    }
}
