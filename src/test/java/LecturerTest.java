import org.example.Lecturer;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LecturerTest {

    @Test
    void testGetUsername() {
        Lecturer lecturer = new Lecturer(1, "John Smith", 52, new DateTime("1972-05-10T09:00:00.123"));
        assertNotNull(lecturer.getUsername());
    }

}
