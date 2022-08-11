package com.eticaret.zaman.kullanici;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class KullaniciDetails implements UserDetails {


    private Kullanici kullanici;
    public KullaniciDetails(Kullanici kullanici) {
        this.kullanici = kullanici;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }


    @Override
    public String getPassword() {
        return kullanici.getSifre();
    }

    @Override
    public String getUsername() {
        return kullanici.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
    public String getAdSoyad() {
        return kullanici.getAdi() + " " + kullanici.getSoyadi();
    }
}



