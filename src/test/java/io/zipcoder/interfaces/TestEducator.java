package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {

    Educator educator = Educator.DOLIO;
    Student s1 = new Student(1, "Billy");
    Student s2 = new Student(2, "Bob");
    Student s3 = new Student(3, "Sally");
    Student[] students = new Student[]{s1, s2, s3};

    @Test
    public void testImplementation() {
        Assert.assertTrue(educator instanceof Teacher);
    }

    @Test
    public void testTeach() {
        educator.teach(s1, 3.0);

        Assert.assertEquals(3.0, s1.getTotalStudyTime(), 0.001);
    }

    @Test
    public void testLecture() {
        educator.lecture(students, 9.0);

        Assert.assertEquals(3.0, s1.getTotalStudyTime(), 0.001);
        Assert.assertEquals(3.0, s2.getTotalStudyTime(), 0.001);
        Assert.assertEquals(3.0, s3.getTotalStudyTime(), 0.001);
    }
}
