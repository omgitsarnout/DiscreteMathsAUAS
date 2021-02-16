package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
	    List<Sentient> allDomain = prepareForAllDomain();
	    List<Sentient> existDomain = prepareThereExistDomain();
	    Predicate<Sentient> predicate = preparePredicate();
	    boolean resultForAll = forAll(allDomain, predicate);
	    boolean resultForAllShouldBeFalse = forAll(existDomain, predicate);
	    boolean resultThereExists = thereExists(existDomain, predicate);
        System.out.println("True: " + resultForAll);
        System.out.println("False: " + resultForAllShouldBeFalse);
        System.out.println("True: " + resultThereExists);
    }

    private static boolean thereExists(List<Sentient> existDomain, Predicate<Sentient> predicate) {
        for (Sentient e: existDomain) {
            if (predicate.test(e)) {
                return true;
            }
        }
        return false;
    }

    private static boolean forAll(List<Sentient> allDomain, Predicate<Sentient> predicate) {
        for (Sentient e: allDomain) {
            if (!predicate.test(e)) {
                return false;
            }
        }
        return true;
    }

    private static Predicate<Sentient> preparePredicate() {
        return sentient -> sentient.likes(new Human("Donald Trump"));
    }

    private static List<Sentient> prepareThereExistDomain() {
        List<Sentient> listSentient = new ArrayList<Sentient>();
        Sentient sentient1 = new Human("Bob");
        Sentient sentient2 = new Human("Alice");
        Sentient sentient3 = new Human("John");
        Sentient sentient4 = new Human("Donald Trump");
        sentient1.setLikes(sentient4);
        sentient2.setLikes(sentient3);
        sentient3.setLikes(sentient2);
        sentient4.setLikes(sentient1);
        listSentient.add(sentient1);
        listSentient.add(sentient2);
        listSentient.add(sentient3);
        listSentient.add(sentient4);
        return listSentient;
    }

    private static List<Sentient> prepareForAllDomain() {
        List<Sentient> listSentient = new ArrayList<Sentient>();
        Sentient sentient1 = new Human("Bob");
        Sentient sentient2 = new Human("Alice");
        Sentient sentient3 = new Human("John");
        Sentient sentient4 = new Human("Donald Trump");
        sentient1.setLikes(sentient4);
        sentient2.setLikes(sentient4);
        sentient3.setLikes(sentient4);
        sentient4.setLikes(sentient4);
        listSentient.add(sentient1);
        listSentient.add(sentient2);
        listSentient.add(sentient3);
        listSentient.add(sentient4);
        return listSentient;
    }
}
