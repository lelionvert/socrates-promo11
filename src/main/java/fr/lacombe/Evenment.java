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
        SimpleDateFormat formatDate = new SimpleDateFormat ("yyyy-MM-dd HH:mm");
        if(date.before(formatDate.parse("2019-10-17 21:01"))
                || date.after(formatDate.parse("2019-10-18 01:59")))
            return false;
        return true;
    }
}
