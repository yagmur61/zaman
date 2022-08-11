package com.eticaret.zaman.urun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrunService  {

    @Autowired
    private UrunRepo urunRepo;

    public List<Urun> listAll(){
        return urunRepo.findAll();
    }

     public void save(Urun urun){
        urunRepo.save(urun);

     }
     public Urun get(long id){
        return urunRepo.findById(id).get();
     }

     public void delete(long id) {
        urunRepo.deleteById(id);
     }


}
