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
        return choice.getPrice() - calculateMealsToRefund();
    }

    public int calculateMealsToRefund() {
        return MEAL_PRICE * calculateNbMealsRetrieved();
    }

    public int calculateNbMealsRetrieved() {
        if (hasTwoMealsToRefund()) {
            return 2;
        }
        if (hasOneMealToRefund()) {
           return  1;
        }
        return 0;
    }

    public boolean hasOneMealToRefund() {
        return checkIn.arrivalDayIsFriday() || checkOut.departureDayIsSaturday();
    }

    public boolean hasTwoMealsToRefund() {
        return checkIn.arrivalDayIsFriday() && checkOut.departureDayIsSaturday();
    }
}
