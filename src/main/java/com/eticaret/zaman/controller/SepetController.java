package com.eticaret.zaman.controller;

import com.eticaret.zaman.sepet.Sepet;
import com.eticaret.zaman.sepet.SepetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;



import java.util.List;

@Controller
public class SepetController {


    @Autowired
    private SepetService sepetService;

    @GetMapping("/sepet")
    public String SepetPage(Model model){
        List<Sepet> sepetList =sepetService.listAll();
        model.addAttribute("sepetList",sepetList);
        return "sepet";

    }

}
