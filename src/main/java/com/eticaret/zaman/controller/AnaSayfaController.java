package com.eticaret.zaman.controller;


import com.eticaret.zaman.kullanici.Kullanici;

import com.eticaret.zaman.kullanici.KullaniciRepo;
import com.eticaret.zaman.kullanici.KullaniciService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class AnaSayfaController {

    @Autowired
    private KullaniciRepo kullaniciRepo;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @GetMapping("")
    public String hosgeldiniz() {
        return "index";

    }


    @Autowired
    private KullaniciService service;

    @GetMapping("/kayit")
    public String kayit(Model model) {
        model.addAttribute("kullanici", new Kullanici());
        return "kayit";

    }

    @PostMapping("/kayit")
    public String kayitForm(Kullanici kullanici) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(kullanici.getSifre());
        kullanici.setSifre(encodedPassword);

        kullaniciRepo.save(kullanici);
        return "redirect:/login";
    }


}