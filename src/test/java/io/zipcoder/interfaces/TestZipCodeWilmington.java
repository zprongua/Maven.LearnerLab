package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture() {
        ZipCodeWilmington zcw = new ZipCodeWilmington();
        Instructors instructors = Instructors.getInstance();
        Students students = Students.getInstance();

        Educator teach = Educator.DOLIO;

        zcw.hostLecture(teach, 5.0);
        zcw.hostLecture(2, 2.0);

        Student student = (Student) students.findById(1);

        Assert.assertEquals(0.7, student.getTotalStudyTime(), 0.001);
    }
}