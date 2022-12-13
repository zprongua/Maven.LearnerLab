package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testPerson() {
        Person person = new Person(1, "Steve");

        person.setName("John");

        Assert.assertEquals(1, person.getId());
        Assert.assertEquals("John", person.getName());
    }
}
