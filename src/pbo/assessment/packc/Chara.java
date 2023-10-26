package pbo.assessment.packc;

import java.util.ArrayList;

public class Chara {
    private String name, race, job;
    private ArrayList<Equipment> equipmentList;
    private ArrayList<Skill> skillList;

    public Chara(String name, String race, String job) {
        this.name = name;
        this.race = race;
        this.job = job;
        this.equipmentList = new ArrayList<>();
        this.skillList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public String getJob() {
        return job;
    }

    public void showEquipment() {

    }

    public void showSkill() {

    }
}
