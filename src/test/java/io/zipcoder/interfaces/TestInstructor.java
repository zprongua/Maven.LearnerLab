package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    Instructor instructor = new Instructor(7, "Mr. Wiggles");
    Student s1 = new Student(1, "Billy");
    Student s2 = new Student(2, "Bob");
    Student s3 = new Student(3, "Sally");
    Student[] students = new Student[]{s1, s2, s3};

    @Test
    public void testImplementation() {
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        instructor.teach(s1, 3.0);

        Assert.assertEquals(3.0, s1.getTotalStudyTime(), 0.001);
    }

    @Test
    public void testLecture() {
        instructor.lecture(students, 9.0);

        Assert.assertEquals(3.0, s1.getTotalStudyTime(), 0.001);
        Assert.assertEquals(3.0, s2.getTotalStudyTime(), 0.001);
        Assert.assertEquals(3.0, s3.getTotalStudyTime(), 0.001);
    }
}
