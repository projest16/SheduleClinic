package com.mrak.sheduleclinic.controller;

import com.mrak.sheduleclinic.model.Doctor;
import com.mrak.sheduleclinic.model.Patient;
import com.mrak.sheduleclinic.model.Shedule;
import com.mrak.sheduleclinic.service.DoctorService;
import com.mrak.sheduleclinic.service.PatientService;
import com.mrak.sheduleclinic.service.SheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ClinicController {
    private DoctorService doctorService;
    private SheduleService sheduleService;
    private PatientService patientService;

    @Autowired(required = true)
    public void setPatientService(PatientService patientService) {
        this.patientService = patientService;
    }

    @Autowired(required = true)
    public void setDoctorService(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @Autowired(required = true)
    public void setSheduleService(SheduleService sheduleService) {
        this.sheduleService = sheduleService;
    }

    @RequestMapping(value = "/")
    public String showHomePage(Model model) {
        return "redirect:/shedule";
    }

    @RequestMapping(value = "/test1")
    public String test1(Model model) {
        return "shedule";
    }

    @RequestMapping(value = "/shedule")
    public String test2(@ModelAttribute("choosedDoctor") Doctor doctor, Model model) {
        model.addAttribute("listDoctors", this.doctorService.listDoctors());
        model.addAttribute("listPatients", this.patientService.listPatients());
        model.addAttribute("shedule", new Shedule());
        //model.addAttribute("doctor", new Doctor());
        model.addAttribute("choosedDoctorOut", this.doctorService.getDoctorById(doctor.getDoctor_id()));

        //model.addAttribute("events1", sheduleService.listShedules());
        return "shedule";
    }

    @RequestMapping(value = "/listpatients", method = RequestMethod.GET)
    public String listPatients(Model model) {
        model.addAttribute("patient", new Patient());
        model.addAttribute("listPatients", this.patientService.listPatients());
        return "listpatients";
    }

    @RequestMapping(value = "/listshedules", method = RequestMethod.GET)
    public String listShedules(Model model) {
        model.addAttribute("shedule", new Shedule());
        model.addAttribute("listShedules", this.sheduleService.listShedules());
        return "listshedules";
    }

    @RequestMapping(value = "/1", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Shedule> getListShedule(@RequestParam("doctor_id") int doctor_id) {
        return sheduleService.listShedule(doctor_id);
    }

    @RequestMapping(value = "/2", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody
    void setShedule(@RequestBody Shedule shedule) {
        sheduleService.addShedule(shedule);
    }

    //
//    @RequestMapping(value = "/shedule/{id}")
//    public String shedulelist(@PathVariable("id") int doctor_id, Model model) {
//        model.addAttribute("shedule", new Shedule());
//        model.addAttribute("listShedule", this.sheduleService.listShedule(doctor_id));
//        model.addAttribute("doctor", this.doctorService.getDoctorById(doctor_id));
//        return "shedule";
//    }
//
//    @RequestMapping(value = "/shedule/{id}/add", method = RequestMethod.POST)
//    public String addShedule(@PathVariable("id") int doctor_id, @ModelAttribute("shedule") Shedule shedule) {
//        //shedule.setDoctor(this.doctorService.getDoctorById(doctor_id));
//        this.sheduleService.addShedule(shedule);
//        return "redirect:/";
//    }
//
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String adminPanel(Model model) {
        model.addAttribute("listDoctors", this.doctorService.listDoctors());
        model.addAttribute("listPatients", this.patientService.listPatients());
        model.addAttribute("listShedules", this.sheduleService.listShedules());
        model.addAttribute("doctor", new Doctor());
        model.addAttribute("paient", new Patient());
        model.addAttribute("shedule", new Shedule());
        return "admin";
    }

    //
//    @RequestMapping(value = "/admin/add", method = RequestMethod.POST)
//    private ModelAndView addShedule(@ModelAttribute Shedule shedule){
//        ModelAndView mav = new ModelAndView("admin");
//        mav.addObject("shedule", shedule);
//        return mav;
//

    @RequestMapping(value = "/admin/addShedule", method = RequestMethod.POST)
    public String addSheduleAtAdminPanel(@ModelAttribute("shedule") Shedule shedule) {
        //shedule.setTitle(shedule.getPatient().getSurname());
        this.sheduleService.addShedule(shedule);
        return "redirect:/shedule";
    }

    @RequestMapping(value = "/admin/deleteShedule", method = RequestMethod.POST)
    public String deleteSheduleAtAdminPanel(@RequestParam("sheduleID") int sheduleId) {
        //shedule.setTitle(shedule.getPatient().getSurname());
        this.sheduleService.deleteSheduleById(sheduleId);
        return "redirect:/shedule";
    }

    @RequestMapping(value = "/admin/addDoctor", method = RequestMethod.POST)
    public String addDoctorAtAdminPanel(@ModelAttribute("doctor") Doctor doctor) {
        this.doctorService.addDoctor(doctor);
        return "redirect:/admin";
    }

    @RequestMapping(value = "/admin/addPatient", method = RequestMethod.POST)
    public String addDoctorAtAdminPanel(@ModelAttribute("patient") Patient patient) {
        this.patientService.addPatient(patient);
        return "redirect:/admin";
    }
}
