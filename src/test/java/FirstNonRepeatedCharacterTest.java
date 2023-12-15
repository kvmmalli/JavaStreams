import org.junit.jupiter.api.Test;
import org.streams.FirstNonRepeated;

import static org.junit.jupiter.api.Assertions.*;

public class FirstNonRepeatedCharacterTest {

    @Test
    public void testFirstNonRepeated()
    {
        FirstNonRepeated f = new FirstNonRepeated();

        assertEquals('a', f.getFirstNonRepeatedCharacter("abbcccdg"));
        assertNull(f.getFirstNonRepeatedCharacter("aabbccc"));
        assertEquals('d', f.getFirstNonRepeatedCharacter("aabbcccd"));

    }
}
