package fr.lacombe;

import java.util.List;

public class Evenment {

    private final List<Participant> participants;

    public Evenment(List<Participant> participants) {
        this.participants = participants;
    }

    public int countParticipants() {
        return participants.size();
    }

}
