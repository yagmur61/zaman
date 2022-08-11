package com.eticaret.zaman.controller;

import com.eticaret.zaman.urun.Urun;
import com.eticaret.zaman.urun.UrunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UrunController {

    @Autowired
    private UrunService urunService;


    @GetMapping("/urun")
    public String UrunPage(Model model){
        List<Urun> listurun =urunService.listAll();
        model.addAttribute("listurun",listurun);
        return "urun";

    }

    @GetMapping("/yeni")
    public String ekle(Model model){
        model.addAttribute("urun",new Urun());
        return "yeni";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String kaydetUrun(@ModelAttribute("urun") Urun urun){
        urunService.save(urun);
        return "redirect:/urun";
    }

    @RequestMapping("/duzenle/{id}")
    public ModelAndView duzenleUrun(@PathVariable(name = "id") int id){
        ModelAndView modelAndView = new ModelAndView("yeni");
        Urun urun = urunService.get(id);
        modelAndView.addObject("urun", urun);
        return modelAndView;
    }

    @RequestMapping("/sil/{id}")
    public String silUrun(@PathVariable(name = "id") int id){
        urunService.delete(id);
        return "redirect:/urun";
    }


}
