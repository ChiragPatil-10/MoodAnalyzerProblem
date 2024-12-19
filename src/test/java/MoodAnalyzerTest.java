import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class MoodAnalyzerTest {
    @Test
    public void HappyOrSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        String result = moodAnalyzer.analyzeMood();
        assertEquals("Sad",result);

    }

    @Test
    public void Mood() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any Mood");
        String result = moodAnalyzer.analyzeMood();
        assertEquals("Happy", result);

    }


}