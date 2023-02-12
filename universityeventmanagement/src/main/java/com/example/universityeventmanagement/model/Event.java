package com.example.universityeventmanagement.model;


public class Event {
    private int EventId;
    private String eventName;
    private String location;
    private String date;
    private String starttime;
    private String endtime;


    public int getEventId() {
        return EventId;
    }
    public void setEventId(int eventId) {
        this.EventId = eventId;
    }
    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getStarttime() {
        return starttime;
    }
    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }
    public String getEndtime() {
        return endtime;
    }
    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }


    public Event(int EventId, String eventName, String location, String date, String starttime, String endtime) {
        this.EventId = EventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.starttime = starttime;
        this.endtime = endtime;
    }


    @Override
    public String toString() {
        return "Event [eventId=" + EventId + ", eventName=" + eventName + ", location=" + location + ", date=" + date
                + ", starttime=" + starttime + ", endtime=" + endtime + "]";
    }
}
