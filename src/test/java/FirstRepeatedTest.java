import org.junit.jupiter.api.Test;
import org.streams.FirstRepeated;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class FirstRepeatedTest {
    @Test
    public void testFirstRepeated()
    {
        FirstRepeated f = new FirstRepeated();

        assertEquals('b', f.firstRepeatedCharacter("abbcccdg"));
        assertNull(f.firstRepeatedCharacter("abc"));
        assertEquals('a', f.firstRepeatedCharacter("aabbcccd"));

    }
}
