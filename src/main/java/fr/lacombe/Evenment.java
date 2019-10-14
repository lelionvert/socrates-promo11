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
        if(date.before(formatDate.parse("21:01"))) return false;
        return true;
    }
}
