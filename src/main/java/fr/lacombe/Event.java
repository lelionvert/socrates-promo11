package fr.lacombe;

import java.util.List;

public class Event {

    private final List<Participant> participants;

    public Event(List<Participant> participants) {
        this.participants = participants;
    }

    public int countParticipants() {
        return participants.size();
    }

    public int countColdMeals() {
        for(Participant participant : participants) {
            if(participant.checkColdMeal()) {
                return 1;
            }
        }
        return 0;
    }
}
