package fr.lacombe;

import java.util.List;

public class Evenment {

    private final List<String> participants;

    public Evenment(List<String> participants) {

        this.participants = participants;
    }

    public int countParticipants() {
        return participants.size();
    }

    public boolean checkColdMeal(String s) {
        return true;
    }
}
