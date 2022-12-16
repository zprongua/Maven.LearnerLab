package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    @Test
    public void testStudents() {
        Students students = Students.getInstance();

        for (Student s : students) {
            System.out.println(s.getName());
        }

        Assert.assertEquals(10, students.personList.size());
    }
}
