package com.eticaret.zaman.sepet;


import com.eticaret.zaman.urun.Urun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SepetService  {

    @Autowired
    private SepetRepo sepetRepo;

   public  void save(Sepet sepet){
        sepetRepo.save(sepet);
}
    public List<Sepet> listAll(){
        return sepetRepo.findAll();
    }
    public Sepet get(long id){
        return sepetRepo.findById(id).get();
    }
}