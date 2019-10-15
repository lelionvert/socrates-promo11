package fr.lacombe;

public class CheckOut {
    private DateEngine departureDate;

    public CheckOut(String departureDate) {
        this.departureDate = new DateEngine(departureDate);
    }
}
