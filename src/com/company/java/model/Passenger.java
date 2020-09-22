package model;

import java.util.Set;

public class Passenger extends BaseEntity {
    String firstNamePassenger; // имя пассажира
    String secondNamePassenger; // фамилия пассажира
    Long idTicket; // id билета

    Set<Ticket>tickets;


    // конструктор без параметров
    public Passenger() {
    }

    // конструктор с параметрами
    public Passenger(String firstNamePassenger, String secondNamePassenger, Long idTicket) {
        this.firstNamePassenger = firstNamePassenger;
        this.secondNamePassenger = secondNamePassenger;
        this.idTicket = idTicket;
    }

    // геттеры и сеттеры

    public String getFirstNamePassenger() {
        return firstNamePassenger;
    }

    public void setFirstNamePassenger(String firstNamePassenger) {
        this.firstNamePassenger = firstNamePassenger;
    }

    public String getSecondNamePassenger() {
        return secondNamePassenger;
    }

    public void setSecondNamePassenger(String secondNamePassenger) {
        this.secondNamePassenger = secondNamePassenger;
    }

    public Long getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(Long idTicket) {
        String str = null;


        this.idTicket = idTicket;
    }

    // вывод информации на консоль
    @Override
    public String toString() {
        return "Passenger{" +
                "firstNamePassenger='" + firstNamePassenger + '\'' +
                ", secondNamePassenger='" + secondNamePassenger + '\'' +
                ", idTicket=" + idTicket +
                '}';
    }
}


