package fr.lacombe;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Participant {
    private Date date;

    public Participant(String date) {
        this.date = parseStringToDate(date);
    }

    public boolean checkColdMeal() {
        if (date.before(parseStringToDate("2019-10-17 21:01"))
                || date.after(parseStringToDate("2019-10-18 01:59")))
            return false;
        return true;
    }

    public Date parseStringToDate(String date) {
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            return formatDate.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
