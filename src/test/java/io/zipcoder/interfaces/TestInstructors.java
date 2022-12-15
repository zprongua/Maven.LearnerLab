package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void testInstructors() {
        Instructors instructors = Instructors.getInstance();

        for (Person s : instructors) {
            System.out.println(s.getName());
        }

        Assert.assertEquals(3, instructors.personList.size());
    }
}
