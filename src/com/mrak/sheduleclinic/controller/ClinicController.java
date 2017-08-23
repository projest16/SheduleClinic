package com.mrak.sheduleclinic.controller;

import com.mrak.sheduleclinic.model.Doctor;
import com.mrak.sheduleclinic.model.Shedule;
import com.mrak.sheduleclinic.service.DoctorService;
import com.mrak.sheduleclinic.service.SheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/")
    public String showHomePage(Model model) {
        return "index";
    }

    @RequestMapping(value = "/listdoctors", method = RequestMethod.GET)
    public String listDoctors(Model model) {
        model.addAttribute("doctor", new Doctor());
        model.addAttribute("listDoctors", this.doctorService.listDoctors());
        return "listdoctors";
    }

    @RequestMapping(value = "/listdoctors/add", method = RequestMethod.POST)
    public String addDoctor(@ModelAttribute("doctor") Doctor doctor) {
        this.doctorService.addDoctor(doctor);
        return "redirect:/listdoctors";
    }

    @RequestMapping(value = "/shedule/{id}")
    public String shedulelist(@PathVariable("id") int doctor_id, Model model) {
        model.addAttribute("shedule", new Shedule());
        model.addAttribute("listShedule", this.sheduleService.listShedule(doctor_id));
        model.addAttribute("doctor", this.doctorService.getDoctorById(doctor_id));
        return "shedule";
    }

    @RequestMapping(value = "/shedule/{id}/add", method = RequestMethod.POST)
    public String addShedule(@PathVariable("id") int doctor_id, @ModelAttribute("shedule") Shedule shedule) {
        shedule.setDoctor(this.doctorService.getDoctorById(doctor_id));
        this.sheduleService.addShedule(shedule);
        return "redirect:/";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String adminPanel(Model model) {
        model.addAttribute("listDoctors", this.doctorService.listDoctors());
        model.addAttribute("shedule", new Shedule());
        return "admin";
    }

    @RequestMapping(value = "/admin/add", method = RequestMethod.POST)
    public String addSheduleAtAdminPanel(@RequestParam("s") int q) {
        //this.sheduleService.addShedule(shedule);
        return "redirect:/admin";
    }
}
