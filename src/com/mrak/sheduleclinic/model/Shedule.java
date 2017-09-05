package com.mrak.sheduleclinic.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Shedule")
public class Shedule implements Serializable {
    //    @Id
//    @ManyToOne(cascade = CascadeType.ALL)
//    private Doctor doctor;
//    @Id
//    @ManyToOne(cascade = CascadeType.ALL)
//    private Patient patient;
    @ManyToOne
    @JoinColumn(name = "doctor_id",
            foreignKey = @ForeignKey(name = "DOCTOR_ID_FK"))
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "patient_id",
            foreignKey = @ForeignKey(name = "PATIENT_ID_FK"))
    private Patient patient;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shedule_id;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column
    private Date date;

    @Temporal(TemporalType.TIME)
    @DateTimeFormat(pattern = "HH:mm")
    //@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    @Column
    private Date time;
    @Temporal(TemporalType.DATE)
    @Column
    private Date start;
    @Temporal(TemporalType.DATE)
    @Column(name = "\"end\"")
    private Date end;
    @Column
    private String duration;
    @Column
    private String title;

    public Shedule() {
    }

    @Override
    public String toString() {
        return "Shedule{" +
                "doctor=" + doctor +
                ", patient=" + patient +
                ", shedule_id=" + shedule_id +
                ", date=" + date +
                ", time=" + time +
                ", start=" + start +
                ", end=" + end +
                ", duration='" + duration + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }


//    @Temporal(TemporalType.DATE)
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    @Column
//    private Date start;

//
//    @Temporal(TemporalType.DATE)
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    @Column
//    private Date end;


    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getShedule_id() {
        return shedule_id;
    }

    public void setShedule_id(int shedule_id) {
        this.shedule_id = shedule_id;
    }

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


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
