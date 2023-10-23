package pbo.responsi46;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.joinTeam("Agent Alpha-01", "M4 CQBR", "AR", "MTF Alpha-1");
        game.joinTeam("Agent Delta-44", "AS VAL", "AR", "MTF Zeta-4");
        game.showAllTeam();
    }
}

class Game {
    private GameSession session = new GameSession();

    public void joinTeam(String username, String weaponModel, String weaponType, String teamName) {
        Squad squad = new Squad(teamName);

        // bentuk Asosiasi
        ArrayList<Weapon> weapons = new ArrayList<>();
        Weapon weapon = new Weapon();
        weapon.setName(weaponModel);
        weapon.setType(weaponType);
        weapons.add(weapon);

        squad.addPlayer(new Player(username, weapons)); // bentuk Komposisi
        session.addSquad(squad); // bentuk Agregasi
    }

    public void showAllTeam() {
        System.out.println("List team yang bergabung dalam match:");
        for (Squad team : session.getSquadList()) {
            System.out.println(team);
        }
    }
}
