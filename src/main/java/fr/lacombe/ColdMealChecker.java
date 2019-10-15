package fr.lacombe;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ColdMealChecker {

    private String beginColdMealDate;
    private String endColdMealDate;

    public ColdMealChecker(String beginColdMealDate, String endColdMealDate) {
        this.beginColdMealDate = beginColdMealDate;
        this.endColdMealDate = endColdMealDate;
     }

    public boolean checkColdMeal(Date date) {
        if (date.before(parseStringToDate(beginColdMealDate))
                || date.after(parseStringToDate(endColdMealDate)))
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
