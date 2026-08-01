package practice_3;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    public GameSettings(String gameName) {
        this.gameName = gameName;
    }

    public static void setMaxPlayers(int newMaxPlayers) {
        maxPlayers = newMaxPlayers;
    }

    public void addPlayer() {
        if(maxPlayers == currentPlayers) {
            System.out.println("You can not add another player, max limit reached");
            return;
        }
        currentPlayers ++;
    }

    public void printGameStatus() {
        System.out.println("Game name: " + this.gameName + ", current players: " + this.currentPlayers + ", max players: "
        + maxPlayers);
    }
}
