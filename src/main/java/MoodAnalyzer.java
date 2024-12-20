public class MoodAnalyzer {
    private String mood;

    public MoodAnalyzer() {
        mood = "Happy";
    }

    public MoodAnalyzer(String mood) {
        this.mood = mood;
    }

    public String analyzeMood() {
        try {
            if (mood == null || mood.isEmpty()) {
                throw new IllegalArgumentException("Invalid mood: Mood cannot be null or empty");
            }

            if (mood.toLowerCase().contains("happy")) {
                return "Happy";
            } else if (mood.toLowerCase().contains("sad")) {
                return "Sad";
            } else if (mood.toLowerCase().contains("any")) {
                return "Happy";
            } else {
                return "Neutral";
            }
        } catch (IllegalArgumentException e) {
            return "Neutral";
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyzer Problem");

        MoodAnalyzer moodAnalyze1 = new MoodAnalyzer("Happy Mood");
        System.out.println("Mood: " + moodAnalyze1.analyzeMood());

        MoodAnalyzer moodAnalyzer2 = new MoodAnalyzer("Sad Mood");
        System.out.println("Mood: " + moodAnalyzer2.analyzeMood());

        MoodAnalyzer moodAnalyzer3 = new MoodAnalyzer("");
        System.out.println("Mood: " + moodAnalyzer3.analyzeMood());

        MoodAnalyzer moodAnalyzer4 = new MoodAnalyzer(null);
        System.out.println("Mood: " + moodAnalyzer4.analyzeMood());
    }
}
