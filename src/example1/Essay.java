package example1;

public class Essay extends GradedActivity{
    private double grammar;
    private double spelling;
    private double length;
    private double content;

    public Essay(int grammar, int spelling, int length, int content) {
        this.spelling = spelling;
        int totalScore = grammar + spelling + length + content;

        super.setScore(totalScore);
    }

    public double getGrammar() {
        return grammar;
    }

    public void setGrammar(double grammar) {
        this.grammar = grammar;
    }

    public double getSpellingScore() {
        return spelling;
    }

    public void setSpelling(double spelling) {
        this.spelling = spelling;
    }


}
