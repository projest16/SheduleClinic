package com.mrak.sheduleclinic.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "FCalendar")
public class FCalendar implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fcalendar_id;
    @Temporal(TemporalType.DATE)
    @Column
    private Date start;

    public Date getEnd1() {
        return end1;
    }

    public void setEnd1(Date end1) {
        this.end1 = end1;
    }

    @Temporal(TemporalType.DATE)
    @Column
    private Date end1;
    @Column
    private String title;

    @Override
    public String toString() {
        return "FCalendar{" +
                "fcalendar_id=" + fcalendar_id +
                ", start=" + start +
                ", end1=" + end1 +
                ", title='" + title + '\'' +
                '}';
    }

    public int getFcalendar_id() {
        return fcalendar_id;
    }

    public void setFcalendar_id(int fcalendar_id) {
        this.fcalendar_id = fcalendar_id;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
