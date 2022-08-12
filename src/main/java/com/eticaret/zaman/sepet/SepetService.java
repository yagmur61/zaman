package com.eticaret.zaman.sepet;

import com.eticaret.zaman.kullanici.Kullanici;
import com.eticaret.zaman.sepetOgesi.SepetOgesi;
import com.eticaret.zaman.sepetOgesi.SepetOgesiRepo;
import com.eticaret.zaman.urun.Urun;
import com.eticaret.zaman.urun.UrunRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Service
public class SepetService  {

    @Autowired
    private SepetOgesiRepo sepetOgesiRepo;


    public List<SepetOgesi> listSepetOgesis(Kullanici kullanici){
        return sepetOgesiRepo.findByKullanici(kullanici);
    }
   public  void save(SepetOgesi sepetOgesi){
        sepetOgesiRepo.save(sepetOgesi);
}

}