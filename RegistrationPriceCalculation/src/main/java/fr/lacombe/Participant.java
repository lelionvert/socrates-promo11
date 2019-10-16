package fr.lacombe;

public class Participant {

    public static final int MEAL_PRICE = 40;
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

    public int calculateTotalAmount() {
        if (checkIn.getArrivalDay() == "Friday") {
            return choice.getPrice() - MEAL_PRICE;
        }
        return choice.getPrice();
    }
}
