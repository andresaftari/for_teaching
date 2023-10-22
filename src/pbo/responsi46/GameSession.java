package pbo.responsi46;

import java.util.ArrayList;

public class GameSession {
    private ArrayList<Squad> squadList = new ArrayList<>();

    public ArrayList<Squad> getSquadList() {
        return squadList;
    }

    public void addSquad(Squad squad) {
        squadList.add(squad);
    }
}
