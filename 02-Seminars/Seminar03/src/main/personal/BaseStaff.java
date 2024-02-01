package main.personal;

import main.clients.Illness;
import main.clients.Owner;

import java.time.LocalDate;

public abstract class BaseStaff extends Staffable {
    public String name;
    public LocalDate birthDate;


    public BaseStaff(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public BaseStaff(String name) {
        this.name = name;
        this.birthDate = LocalDate.now();
    }

    public BaseStaff() {
        this("Имя", LocalDate.now());
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("name = %s, bd = %s ", name, birthDate);
    }
}



