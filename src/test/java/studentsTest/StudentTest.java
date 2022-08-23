package studentsTest;

import org.junit.Before;
import org.junit.Test;
import students.Student;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StudentTest {
    Student studentWithNoGrade;
    Student studentWithOneGrade;
    Student studentWithMany;

    @Before
    public void setUp(){
        studentWithNoGrade = new Student();

        studentWithOneGrade = new Student();
        studentWithOneGrade.addGrade(80);
        studentWithOneGrade.getGradeAverage();

        studentWithMany = new Student();
        studentWithMany.addGrade(80);
        studentWithMany.addGrade(90);
        studentWithMany.addGrade(70);
        studentWithMany.addGrade(100);
        studentWithMany.getGradeAverage();
    }

    @Test
    public void testIsEmpty() {
        assertTrue(studentWithNoGrade.getGrades().isEmpty());
        assertFalse(studentWithNoGrade.getGrades().isEmpty());
    }
}
