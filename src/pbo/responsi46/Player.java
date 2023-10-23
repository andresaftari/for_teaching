package pbo.responsi46;

import java.util.ArrayList;

public class Player {
    private String username;
    private int health;
    private ArrayList<Weapon> weaponlist;

    public Player(String username, ArrayList<Weapon> weaponlist) {
        this.username = username;
        this.health = 100; // Secara default HP adalah 100
        this.weaponlist = weaponlist;
    }

    public String getUsername() {
        return username;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public ArrayList<Weapon> getWeaponlist() {
        return weaponlist;
    }

    @Override
    public String toString() {
        return "Player{" +
                "username='" + username + '\'' +
                ", health=" + health +
                ", weaponlist=" + weaponlist +
                '}';
    }
}
