package com.eticaret.zaman.sepetOgesi;


import com.eticaret.zaman.kullanici.Kullanici;
import com.eticaret.zaman.urun.Urun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SepetOgesiRepo extends JpaRepository<SepetOgesi, Long> {


    public List<SepetOgesi> findByKullanici(Kullanici kullanici);



}
