package com.mrak.sheduleclinic.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Shedule")
public class Shedule {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private Date time;
    @Column
    private int duration;

    @Override
    public String toString() {
        return "Shedule{" +
                "id=" + id +
                ", time=" + time +
                ", duration=" + duration +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
