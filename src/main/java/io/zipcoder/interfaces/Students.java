package io.zipcoder.interfaces;

public final class Students extends People {
     private static final Students INSTANCE = new Students();

     private Students() {
         super.add(new Student(1, "Zach"));
         super.add(new Student(2, "Collin"));
         super.add(new Student(3, "Carolina"));
         super.add(new Student(4, "Eryk"));
         super.add(new Student(5, "Nina"));
         super.add(new Student(6, "Anna"));
         super.add(new Student(7, "Yangjie"));
         super.add(new Student(8, "Thien"));
         super.add(new Student(9, "Tarin"));
         super.add(new Student(10, "Dan"));
     }

    public static Students getInstance() {
         return INSTANCE;
    }
}
