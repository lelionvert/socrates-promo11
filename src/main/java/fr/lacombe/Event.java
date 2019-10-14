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

}
