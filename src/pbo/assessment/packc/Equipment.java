package pbo.assessment.packc;

public class Equipment {
    private String type, equipmentName, state;

    public Equipment(String type, String equipmentName, String state) {
        this.type = type;
        this.equipmentName = equipmentName;
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public String getState() {
        return state;
    }
}
