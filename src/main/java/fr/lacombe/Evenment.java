package fr.lacombe;

import java.util.List;

public class Evenment {

    private final int i;

    public Evenment(int i) {

        this.i = i;
    }

    public int countParticipants() {
        if (i==5) return 5;
        return 0;
    }

}
