package com.mrak.sheduleclinic.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Shedule")
public class Shedule implements Serializable {
    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    private Doctor doctor;
    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    private Patient patient;
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    //@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    @Column
    private Date time;
    @Column
    private int duration;

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "id")
//    private Set<Doctor> doctors = new HashSet<Doctor>(0);

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "patient_id")
//    private Patient patient;

    @Override
    public String toString() {
        return "Shedule{" +
                "doctor=" + doctor +
                ", patient=" + patient +
                ", time=" + time +
                ", duration=" + duration +
                '}';
    }


//    public Patient getPatient() {
//        return patient;
//    }
//
//    public void setPatient(Patient patient) {
//        this.patient = patient;
//    }

//    public Doctor getDoctor() {
//        return this.doctor;
//    }
//
//    public void setDoctor(Doctor doctor) {
//        this.doctor = doctor;
//    }


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
