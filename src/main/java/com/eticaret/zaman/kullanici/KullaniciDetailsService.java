package com.eticaret.zaman.kullanici;

import com.eticaret.zaman.kullanici.Kullanici;
import com.eticaret.zaman.kullanici.KullaniciDetails;
import com.eticaret.zaman.kullanici.KullaniciRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class KullaniciDetailsService implements UserDetailsService {

    @Autowired
    private   KullaniciRepo kullaniciRepo;

    @Override
    public KullaniciDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Kullanici kullanici = kullaniciRepo.findByEmail(email);
        if (kullanici == null) {
            throw new UsernameNotFoundException("Kullanıcı Bulunamadı");
        }
        return new KullaniciDetails(kullanici);
    }


}
