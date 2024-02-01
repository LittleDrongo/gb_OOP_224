package main.clients;

import java.time.LocalDate;

public abstract class Animal {

    // protected видно в классе и во всех наследниках
    protected String nickName;
    protected Owner owner;
    protected LocalDate birthDate;
    protected Illness illness;

    protected int movementStatistics;


    // Это пустой конструктор (по умолчанию)
    public Animal(String nickName, Owner owner, LocalDate birthDate, Illness illness, int movementStatistics) {
        this.nickName = nickName;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness;
        this.movementStatistics = movementStatistics;
    }

    public Animal() {
        this("Кличка", new Owner("Хозяин"), LocalDate.now(), new Illness("Болеет"), 0);
    }

    public String getNickName() {
        return nickName;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }


    public String getType() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("nickName = %s, bd = %s, owner = %s, illness = %s, Movement statistics = %s ", nickName, birthDate, owner, illness, movementStatistics);
    }
}