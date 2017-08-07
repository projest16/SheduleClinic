package com.mrak.sheduleclinic.controller;

import com.mrak.sheduleclinic.model.Doctor;
import com.mrak.sheduleclinic.service.DoctorService;
import com.mrak.sheduleclinic.service.SheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ClinicController {
    private DoctorService doctorService;
    private SheduleService sheduleService;

    @Autowired(required = true)
    //@Qualifier(value = "doctorService")
    public void setDoctorService(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @Autowired(required = true)
    public void setSheduleService(SheduleService sheduleService) {
        this.sheduleService = sheduleService;
    }

    @RequestMapping(value = "/listdoctors", method = RequestMethod.GET)
    public String listDoctors(Model model){
        model.addAttribute("doctor", new Doctor());
        model.addAttribute("listDoctors", this.doctorService.listDoctors());
        return "listdoctors";
    }

    @RequestMapping(value = "shedule/{id}")
    public String shedulelist(@PathVariable("id") int doctor_id, Model model){
        //model.addAttribute("doctor", new Doctor());
        model.addAttribute("listShedule", this.sheduleService.listShedule(doctor_id));
        model.addAttribute("doctor", this.doctorService.getDoctorById(doctor_id));
        return "shedule";
    }

    @RequestMapping(value = "/listdoctors/add", method = RequestMethod.POST)
    public String addBook(@ModelAttribute("doctor") Doctor doctor) {
            this.doctorService.addBook(doctor);
        return "redirect:/listdoctors";
    }
}
