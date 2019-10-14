package fr.lacombe;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Participant {
    private Date date;

    public Participant(Date date) {
        this.date = date;
    }

    public boolean checkColdMeal() throws ParseException {
        SimpleDateFormat formatDate = new SimpleDateFormat ("yyyy-MM-dd HH:mm");
        if(date.before(formatDate.parse("2019-10-17 21:01"))
                || date.after(formatDate.parse("2019-10-18 01:59")))
            return false;
        return true;
    }
}
