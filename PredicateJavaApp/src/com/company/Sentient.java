package com.company;

public interface Sentient {
    /**
     *
     * @param other, the other sentient, the one that might or might not be liked by this one.
     * @return true this sentient being likes the other sentient. false if this sentient being does not like the other sentient being.
     */
    boolean likes (Sentient other);

    /**
     * Keeps track of all the other sentient being this sentient being likes.
     *
     * @param other, the other sentient when passed to this method this other sentient being is liked.
     * @return
     */
    boolean setLikes(Sentient other);

    /**
     * Gets the identity of this sentient being. Must be unique.
     * @return
     */
    String getIdentity();
}
