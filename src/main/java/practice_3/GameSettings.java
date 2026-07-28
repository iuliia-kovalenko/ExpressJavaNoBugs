package practice_3;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    GameSettings(String gameName) {
        this.gameName = gameName;
    }

    static void setMaxPlayers(int newMaxPlayers) {
        maxPlayers = newMaxPlayers;
    }

    void addPlayer() {
        currentPlayers ++;
    }

    void printGameStatus() {
        System.out.println("Game name: " + this.gameName + ", current players: " + this.currentPlayers + ", max players: "
        + maxPlayers);
    }
}
