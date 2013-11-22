package de.collectionGame;
public class Score {
    // Attributes
    private String playerName;
    private int score;

    // Constructors
    public Score(String playerName, int score) {
        setPlayerName(playerName);
        setScore(score);
    }

    // Methods
    public String getPlayerName() {
        return this.playerName;
    }

    private void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getScore() {
        return this.score;
    }

    private void setScore(int score) {
        this.score = score;
    }
}
