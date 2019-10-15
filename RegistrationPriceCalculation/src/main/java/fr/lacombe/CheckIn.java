package fr.lacombe;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckIn {
    public int day;

    public Date getArrivalDate() {
        return arrivalDate;
    }

    private Date arrivalDate;

    public CheckIn(String arrivalDate) {
        this.arrivalDate = parseStringToDate(arrivalDate);
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

    public String getDay() {
        return "Thursday";
    }
}
