package fr.lacombe;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Evenment {

    private final List<Date> participants;

    public Evenment(List<Date> participants) {

        this.participants = participants;
    }

    public int countParticipants() {
        return participants.size();
    }

    public boolean checkColdMeal(Date date) throws ParseException {
        SimpleDateFormat formatDate = new SimpleDateFormat ("HH:mm");
        if(date.equals(formatDate.parse("20:00"))) return false;
        if(date.equals(formatDate.parse("21:00"))) return false;
        return true;
    }
}
