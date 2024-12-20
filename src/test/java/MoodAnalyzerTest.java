import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class MoodAnalyzerTest {
    @Test
    public void HappyOrSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        String result = moodAnalyzer.analyzeMood();
        assertEquals("SAD",result);

    }

    @Test
    public void Mood() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any Mood");
        String result = moodAnalyzer.analyzeMood();
        assertEquals("HAPPY", result);

    }

    @Test
    public void HappyMood() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
        String result = moodAnalyzer.analyzeMood();
        assertEquals("SAD", result);
    }

}
