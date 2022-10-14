import org.example.Student;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    @Test void testGetUsername() {
        Student student = new Student(1, "John Smith", 20, new DateTime("2002-05-10T09:00:00.123"));
        assertNotNull(student.getUsername());
    }
}
