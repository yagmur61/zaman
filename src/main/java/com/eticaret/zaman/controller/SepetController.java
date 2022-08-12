package com.eticaret.zaman.controller;

import com.eticaret.zaman.kullanici.Kullanici;
import com.eticaret.zaman.kullanici.KullaniciService;
import com.eticaret.zaman.sepet.SepetService;

import com.eticaret.zaman.sepetOgesi.SepetOgesi;
import com.eticaret.zaman.sepetOgesi.SepetOgesiRepo;
import com.eticaret.zaman.urun.Urun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class SepetController {


    @Autowired
    private SepetService sepetService;
    @Autowired
    private KullaniciService kullaniciService;


    @GetMapping(value = "sepet")
    public String SepetPage(Model model,
         @AuthenticationPrincipal long authentication){

        Kullanici kullanici = kullaniciService.get(authentication);
        List<SepetOgesi> sepetOgesis = sepetService.listSepetOgesis(kullanici);
         model.addAttribute("sepetOgesis",sepetOgesis);

        return "sepet";

    }


    @RequestMapping(value = "/kaydetSepet", method = RequestMethod.POST)
    public String kaydetSepet(@ModelAttribute("sepet") SepetOgesi sepetOgesi){
        sepetService.save(sepetOgesi);
        return "sepet";
    }


}
