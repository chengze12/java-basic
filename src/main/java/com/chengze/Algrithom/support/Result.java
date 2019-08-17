package com.chengze.Algrithom.support;

import java.util.List;

public class Result {
    public int attendeeCount;
    public List<String> attendees;
    public String name;
    public Integer startDate;

    public Result(int cnt, String name, Integer startDate, List<String> attendee) {
        this.attendeeCount = cnt;
        this.attendees = attendee;
        this.name = name;
        this.startDate = startDate;
    }

    public void addAttendee(String email) {
        this.attendees.add(email);
    }
}
