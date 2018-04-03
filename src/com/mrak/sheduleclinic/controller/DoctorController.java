package com.mrak.sheduleclinic.controller;

import com.mrak.sheduleclinic.model.Doctor;
import com.mrak.sheduleclinic.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DoctorController {
    private DoctorService doctorService;

    @Autowired(required = true)
    public void setDoctorService(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @RequestMapping(value = "/doctorinfo/{id}", method = RequestMethod.GET)
    public String doctorinfo(@PathVariable("id") int id, Model model) {
        model.addAttribute("doctor", this.doctorService.getDoctorById(id));
        return "doctorinfo";
    }

    @RequestMapping(value = "/listdoctors", method = RequestMethod.GET)
    public String listDoctors(Model model) {
        model.addAttribute("doctor", new Doctor());
        model.addAttribute("listDoctors", this.doctorService.listDoctors());
        return "listdoctors";
    }

    @RequestMapping(value = "/listdoctors/addDoctor", method = RequestMethod.POST)
    public String addDoctorAtAdminPanel(@ModelAttribute("doctor") Doctor doctor) {
        this.doctorService.addDoctor(doctor);
        return "redirect:/listdoctors";
    }
}
