package com.eticaret.zaman.urun;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Urun {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String urun_adi;
    private String urun_bilgi;
    private int urun_fiyat;
    private String urun_renk;
   private  int urun_adet;



    public Urun() {
    }

    public Urun(Long id, String urun_adi, String urun_bilgi, int urun_fiyat, String urun_renk,int urun_adet) {
        this.id = id;
        this.urun_adi = urun_adi;
        this.urun_bilgi = urun_bilgi;
        this.urun_fiyat = urun_fiyat;
        this.urun_renk = urun_renk;
       this.urun_adet = urun_adet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrun_adi() {
        return urun_adi;
    }

    public void setUrun_adi(String urun_adi) {
        this.urun_adi = urun_adi;
    }

    public String getUrun_bilgi() {
        return urun_bilgi;
    }

    public void setUrun_bilgi(String urun_bilgi) {
        this.urun_bilgi = urun_bilgi;
    }

    public int getUrun_fiyat() {
        return urun_fiyat;
    }

    public void setUrun_fiyat(int urun_fiyat) {
        this.urun_fiyat = urun_fiyat;
    }

    public String getUrun_renk() {
        return urun_renk;
    }

    public void setUrun_renk(String urun_renk) {
        this.urun_renk = urun_renk;
    }

   public int getUrun_adet() {
     return urun_adet;
    }

    public void setUrun_adet(int urun_adet) {
        this.urun_adet = urun_adet;
    }

}