package pbo.assessment.packc;

import java.util.ArrayList;

public class Event {
    private String eventName, time, location;
    private ArrayList<Chara> charas;

    public Event(String eventName, String time, String location) {
        this.eventName = eventName;
        this.time = time;
        this.location = location;
    }

    public void showChara() {

    }

    public String getEventName() {
        return eventName;
    }

    public String getEventTime() {
        return time;
    }

    public String getEventLocation() {
        return location;
    }
}
