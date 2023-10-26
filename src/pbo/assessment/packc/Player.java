package pbo.assessment.packc;

public class Player {
    private String playerName, location;
    private String[] charaName = new String[3];
    private int jumChara;

    public Player(String playerName, String location) {
        this.playerName = playerName;
        this.location = location;
    }

    public void setCharaName(String charaName) {
        if (jumChara < charaName.length()) {
            this.charaName[jumChara] = charaName;
            jumChara++;
        }
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getCharaName(int i) {
        return charaName[i];
    }

    public int getJumChara() {
        return jumChara;
    }
}
