package com.mrak.sheduleclinic.controller;

import com.mrak.sheduleclinic.model.Doctor;
import com.mrak.sheduleclinic.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClinicController {
    private DoctorService doctorService;

    @Autowired(required = true)
    //@Qualifier(value = "doctorService")
    public void setDoctorService(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @RequestMapping(value = "/1", method = RequestMethod.GET)
    public String listDoctors(Model model){
        model.addAttribute("doctor", new Doctor());
        model.addAttribute("listDoctors", this.doctorService.listDoctors());
        return "listdoctors";
    }
}
