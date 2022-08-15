package com.eticaret.zaman.kullanici;

import com.eticaret.zaman.kullanici.Kullanici;
import com.eticaret.zaman.kullanici.KullaniciDetails;
import com.eticaret.zaman.kullanici.KullaniciRepo;
import com.eticaret.zaman.sepet.Sepet;
import com.eticaret.zaman.sepet.SepetService;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.servlet.http.HttpSession;

public class KullaniciDetailsService implements UserDetailsService {

    @Autowired
    private KullaniciRepo kullaniciRepo;

    @Autowired
    private SepetService sepetService;

    @Autowired
    private HttpSession session;

    @Override
    public KullaniciDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Kullanici kullanici = kullaniciRepo.findByEmail(email);
        if (kullanici == null) {
            throw new UsernameNotFoundException("Kullanıcı Bulunamadı");

        } else  {
            Sepet kullanicisepet = new Sepet();
            kullanicisepet.setId(1L);
            kullanicisepet.setKullanici_id(kullanici.getId());
            sepetService.save(kullanicisepet);
            session.setAttribute("yagmur", kullanicisepet.getId());

        }
        return new KullaniciDetails(kullanici);
    }
}