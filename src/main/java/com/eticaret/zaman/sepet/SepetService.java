package com.eticaret.zaman.sepet;

import com.eticaret.zaman.kullanici.Kullanici;
import com.eticaret.zaman.urun.Urun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SepetService  {

    @Autowired
    private SepetRepo sepetRepo;


    public List<Sepet> listAll(){
        return sepetRepo.findAll();
    }

    public void save(Sepet sepet){
        sepetRepo.save(sepet);

    }
    public Sepet get(long id){
        return sepetRepo.findById(id).get();
    }

    public void delete(long id) {
        sepetRepo.deleteById(id);
    }

}