package main.clients;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Swimable  {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness, int movementStatistics) {
        super(nickName, owner, birthDate, illness, movementStatistics); //Сходи в род.класс и вызови 4 параметра
    }

    public Dog(){
        super();
    }


    @Override
    public void go() {

    }

    @Override
    public void swim() {

    }
}
