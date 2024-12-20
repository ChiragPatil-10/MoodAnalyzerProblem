import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class MoodAnalyzerTest {
    @Test
    public void HappyOrSad() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        String result = moodAnalyzer.analyzeMood();
        assertEquals("SAD",result);
    }

    @Test
    public void Mood() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any Mood");
        String result = moodAnalyzer.analyzeMood();
        assertEquals("HAPPY", result);
    }

    @Test
    public void HappyMood() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
        String result = moodAnalyzer.analyzeMood();
        assertEquals("SAD", result);
    }

    @Test
    public void NullScenario() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        try {
            assertEquals("Happy",moodAnalyzer.analyzeMood());
        } catch (MoodAnalyzerException e) {
            System.out.println("Mood: " + e.getMessage());
        }
    }

    @Test
    public void InvalidMood() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Angry Mood");
        try {
            assertEquals("Invalid Mood", moodAnalyzer.analyzeMood());
        } catch(MoodAnalyzerException e){
            System.out.println("Mood: "+e.getMessage());
        }
    }
}