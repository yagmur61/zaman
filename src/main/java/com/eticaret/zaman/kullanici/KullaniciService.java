package com.eticaret.zaman.kullanici;

import com.eticaret.zaman.kullanici.Kullanici;
import com.eticaret.zaman.kullanici.KullaniciRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KullaniciService   {

    @Autowired
     private KullaniciRepo kullaniciRepo;


    public List<Kullanici> listAll() {
        return kullaniciRepo.findAll();
    }

    public void save(Kullanici kullanici) {
        kullaniciRepo.save(kullanici);
    }

    public Kullanici get(long id) {
        return kullaniciRepo.findById(id).get();
    }

    public void delete(long id) {
        kullaniciRepo.deleteById(id);
    }
}

