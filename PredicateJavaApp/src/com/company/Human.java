package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Human implements Sentient {

    List<Sentient> listLikes = new ArrayList<Sentient>();
    String humanName;

    public Human(String humanName) {
        this.humanName = humanName;
    }

    @Override
    public boolean likes(Sentient other) {
        for (Sentient e: listLikes) {
            if (e.getIdentity().equals(other.getIdentity())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setLikes(Sentient other) {
        listLikes.add(other);
        return true;
    }

    @Override
    public String getIdentity() {
        return humanName;
    }
}
