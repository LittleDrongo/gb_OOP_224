package main.clients;

import java.time.LocalDate;

public class Cat extends Animal implements Goable {

    //Todo напомнить в чём разница в double
    Double discount;

    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount, int movementStatistics) {
        super(nickName, owner, birthDate, illness, movementStatistics); //Todo сначала конструктор Супер-класса
        this.discount = discount;
    }

    public Cat() {
        super();
        this.discount = 10D;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    //Todo статикой пользоваться аккуратно ( пароли там не хранить :-) )
    public void meow(){
        System.out.println("Мяяяу!");
    }

    @Override
    public String toString() {
        return super.toString()+"Discount("+discount+")";
    }


    @Override
    public void go() {

    }

    @Override
    public double getRunSpeed() {
        return Goable.super.getRunSpeed();
    }
}
