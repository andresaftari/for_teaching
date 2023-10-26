package pbo.unused;

import java.util.ArrayList;

public class Squad {
    private String teamName;
    private ArrayList<Player> playerlist;

    public Squad(String teamName) {
        this.teamName = teamName;
        this.playerlist = new ArrayList<>();
    }

    public String getTeamName() {
        return teamName;
    }

    public ArrayList<Player> getPlayerlist() {
        return playerlist;
    }

    public void addPlayer(Player player) {
        playerlist.add(player);
    }

    @Override
    public String toString() {
        return "Squad{" +
                "teamName='" + teamName + '\'' +
                ", playerlist=" + playerlist +
                '}';
    }
}
