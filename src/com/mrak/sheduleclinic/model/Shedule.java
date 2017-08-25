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
    //@DateTimeFormat(pattern = "dd--MM-yyyy")
    //@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    @Column
    private Date date;
    @Temporal(TemporalType.TIME)
    @DateTimeFormat(pattern = "HH:mm")
    //@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    @Column
    private Date time;
    @Column
    private String duration;

    public Date getTime() {
        return time;
    }

    public Shedule() {
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

    @Override
    public String toString() {
        return "Shedule{" +
                "doctor=" + doctor +
                ", patient=" + patient +
                ", time=" + date +
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


    public Date getDate() {
        return date;
    }

    public void setDate(Date time) {
        this.date = time;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
