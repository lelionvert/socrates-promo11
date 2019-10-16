package fr.lacombe;

public class CheckOut {
    private String departureDay;
    private String departureHour;

    public CheckOut(String departureDay, String departureHour) {
        this.departureDay = departureDay;
        this.departureHour = departureHour;
    }

    public String getDepartureDay() {
        return departureDay;
    }
}
