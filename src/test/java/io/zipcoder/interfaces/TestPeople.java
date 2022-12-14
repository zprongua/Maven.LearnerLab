package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    @Test
    public void testAdd() {
        People people = new People();
        Person p1 = new Person(1, "John");

        people.add(p1);

        Assert.assertEquals(1, people.count());
    }

    @Test
    public void testRemove() {
        People people = new People();
        Person p1 = new Person(1, "John");
        Person p2 = new Person(2, "Steve");

        people.add(p1);
        people.add(p2);
        people.remove(p1);
        people.remove(2);

        Assert.assertEquals(0, people.count());
    }

    @Test
    public void testFindById() {
        People people = new People();
        Person p1 = new Person(1, "Fred");
        Person p2 = new Person(2, "Steve");

        people.add(p1);
        people.add(p2);

        Person actual = people.findById(2);

        Assert.assertEquals(p2, actual);
    }
}
