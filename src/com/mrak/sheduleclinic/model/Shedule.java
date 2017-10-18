package com.mrak.sheduleclinic.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
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

//    @Temporal(TemporalType.DATE)
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    @Column
//    private Date date;

//    @Temporal(TemporalType.TIME)
//    @DateTimeFormat(pattern = "HH:mm")
//    @Column
//    private Date time;
    //    @Temporal(TemporalType.TIMESTAMP)
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")

    //@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    //@Temporal(TemporalType.TIMESTAMP)
    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date start;

    //@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    //@Temporal(TemporalType.TIMESTAMP)
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "\"end\"")
    private Date end;

    @Column
    private String title;

    public Shedule() {
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Timestamp start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Timestamp end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Shedule{" +
                "doctor=" + doctor +
                ", patient=" + patient +
                ", shedule_id=" + shedule_id +
                ", start=" + start +
                ", end=" + end +
                ", title='" + title + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
}
