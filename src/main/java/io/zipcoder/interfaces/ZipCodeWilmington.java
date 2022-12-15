package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();

    Learner[] learners = new Learner[10];

    public void setLearners() {
        for (int i=0; i<learners.length; i++) {
            learners[i] = (Student) students.findById(i+1);
        }
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        setLearners();
        teacher.lecture(learners, numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        setLearners();
        Teacher teacher = (Teacher) instructors.findById((int) id);
        teacher.lecture(learners, numberOfHours);
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> hm = new HashMap<>();
        for (Person p : students) {
            Student s = (Student) p;
            hm.put(s, s.getTotalStudyTime());
        }
        return hm;
    }
}
