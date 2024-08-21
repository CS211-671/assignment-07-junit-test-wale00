package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    @DisplayName("Test when add score 69.15")
    void testAddScore(){
        Student s1 = new Student("61xxxxxxxx", "Wale");
        assertEquals(0,s1.getScore());
        s1.addScore(49.15);
        assertEquals(49.15,s1.getScore());
        s1.addScore(20);
        assertEquals(69.15,s1.getScore());
    }

    @Test
    @DisplayName("Test when add score 69.15 and male Object calculate grade")
    void testCalculateGrade(){
        Student s1 = new Student("61xxxxxxxx", "Wale");
        s1.addScore(90);
        assertEquals("A", s1.grade());
    }
}