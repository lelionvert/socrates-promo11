package fr.lacombe;

import java.util.List;

public class SocratesEvent {

    private final List<Participant> participants;

    public SocratesEvent(List<Participant> participants) {
        this.participants = participants;
    }

    public int countParticipants() {
        return participants.size();
    }

    public int countColdMeals() {
        int numberColdMeals = 0;
        for(Participant participant : participants) {
            if(participant.checkColdMeal()) {
                numberColdMeals ++;
            }
        }
        return numberColdMeals;
    }
}
