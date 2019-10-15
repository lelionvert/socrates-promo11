package fr.lacombe;

import java.util.List;

public class SocratesEvent {

    private final List<CheckIn> checkIns;
    private ColdMealChecker coldMealChecker;

    public SocratesEvent(List<CheckIn> checkIns) {
        this.checkIns = checkIns;
    }

    public SocratesEvent(List<CheckIn> checkIns, ColdMealChecker coldMealChecker) {
        this.checkIns = checkIns;
        this.coldMealChecker = coldMealChecker;
    }

    public int countParticipants() {
        return checkIns.size();
    }

    public int countColdMeals() {
        int numberColdMeals = 0;
        for(CheckIn checkIn : checkIns) {
            if(coldMealChecker.checkColdMeal(checkIn.getArrivalDate())) {
                numberColdMeals ++;
            }
        }
        return numberColdMeals;
    }
}
