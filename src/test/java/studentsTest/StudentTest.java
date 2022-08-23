package studentsTest;

import org.junit.Before;
import org.junit.Test;
import students.Student;
import static org.junit.Assert.*;

public class StudentTest {
    private Student student1;

    @Before
    public void setUp() {
        student1 = new Student(1, "Darien");

    }

    @Test
    public void checkId() {
        assertEquals(1, student1.getId());
    }
    @Test
    public void checkName() {
        assertEquals("Darien", student1.getName());
    }
    @Test
    public void checkAdd() {
        assertTrue(student1.getGrades().isEmpty());
        student1.addGrade(80);
        assertEquals(1, this.student1.getGrades().size());
        assertTrue(student1.getGrades().contains(80));
        student1.addGrade(90);
        assertEquals(2, this.student1.getGrades().size());
    }
    @Test
    public void checkAverage() {
        student1.addGrade(80);
        student1.addGrade(90);

        assertEquals(85, student1.getGradeAverage(), .1);
    }
}

