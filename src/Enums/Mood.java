package Enums;

public enum Mood {
    GOOD("Хорошее"),
    BAD("Плохое"),
    SAD("Грустное"),
    HAPPY("Радостное"),
    ANGRY("Злое")

    ;
    private final String mood;
    Mood(String mood) {
        this.mood = mood;
    }

    @Override
    public String toString() {
        return "Настроение: "+ mood;
    }
}
