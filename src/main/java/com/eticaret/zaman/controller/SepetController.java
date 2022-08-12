package com.eticaret.zaman.controller;

import com.eticaret.zaman.sepet.Sepet;
import com.eticaret.zaman.sepet.SepetService;
import com.eticaret.zaman.urun.Urun;
import com.eticaret.zaman.urun.UrunService;
import org.springframework.beans.factory.annotation.Autowired;
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
    private UrunService urunService;

    @GetMapping("/sepet")
    public String SepetPage(Model model){
        List<Sepet> sepetList =sepetService.listAll();
        model.addAttribute("sepetList",sepetList);
        return "sepet";

    }

    @RequestMapping(value = "/kaydet", method = RequestMethod.POST)
    public String kaydetSepet(@ModelAttribute("sepet") Sepet sepet){
        sepetService.save(sepet);
        return "sepet";
    }

}
