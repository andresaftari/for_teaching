package pbo.assessment.packc;

public class Skill {
    private String skillType, skillName, skillEffect;
    private int impact;

    public Skill(String skillType, String skillName, String skillEffect, int impact) {
        this.skillType = skillType;
        this.skillName = skillName;
        this.skillEffect = skillEffect;
        this.impact = impact;
    }

    public String getSkillType() {
        return skillType;
    }

    public String getSkillName() {
        return skillName;
    }

    public String getSkillEffect() {
        return skillEffect;
    }

    public int getImpact() {
        return impact;
    }
}
