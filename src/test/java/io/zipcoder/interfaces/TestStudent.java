package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testStudent() {
        Student student = new Student(1, "Steve");

        student.learn(5.4);
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(5.4, actual, 0.0001);
        Assert.assertTrue(student instanceof Person);
        Assert.assertTrue(student instanceof Learner);
    }
}
