package Animals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CowTest {
    @Test
    public void shouldBeClone() throws CloneNotSupportedException {
        Cow cow = new Cow("Diana", "Holstein", "White");

        Cow cow2 = cow.clone();
        cow2.setName("Judite");

        assertEquals("Holstein", cow2.getBreed());
        assertEquals("White", cow2.getPredominantColor());
        assertEquals("Judite", cow2.getName());
    }
}