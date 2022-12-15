package io.zipcoder.interfaces;

public final class Instructors extends People {
    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        super.add(new Instructor(1, "Kris"));
        super.add(new Instructor(2, "Dolio"));
        super.add(new Instructor(3, "Karen"));
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }
}