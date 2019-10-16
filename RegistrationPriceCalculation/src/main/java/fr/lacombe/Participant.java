package fr.lacombe;

public class Participant {

    private String name;
    private CheckIn checkIn;
    private CheckOut checkOut;
    private Choice choice;

    public Participant(String name, CheckIn checkIn, CheckOut checkOut, Choice choice) {
        this.name = name;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.choice = choice;
    }

    public Choice getChoice() {
        return this.choice;
    }
}
