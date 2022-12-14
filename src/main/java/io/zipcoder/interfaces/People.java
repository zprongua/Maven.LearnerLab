package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {

    List<Person> personList = new ArrayList<>();

    public void add(Person p1) {
        personList.add(p1);
    }

    public void remove(Person p1) {
        personList.remove(p1);
    }

    public void remove(int i) {
        for (Person p : personList) {
            if (p.getId() == i) {
                personList.remove(p);
                break;
            }
        }
    }

    public void removeAll() {
        personList.clear();
    }

    public Person[] toArray() {
        return personList.toArray(new Person[0]);
    }

    public Person findById(int i) {
        for (Person p : personList) {
            if (p.getId() == i) return p;
        }
        return null;
    }

    public boolean contains(Person p) {
        return personList.contains(p);
    }

    public int count() {
        return personList.size();
    }

    @Override
    public Iterator<Person> iterator() {
        return personList.stream().iterator();
    }
}
