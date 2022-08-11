package com.eticaret.zaman.sepet;

import com.eticaret.zaman.kullanici.Kullanici;
import com.eticaret.zaman.urun.Urun;

import javax.persistence.*;

@Entity
public class Sepet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  int urun_adet;
    private double toplam_fiyat;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "urun_id")
    private Urun urun;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "kullanici_id")
    private Kullanici kullanici;

    public Sepet() {
    }

    public Sepet(Long id, int urun_adet, double toplam_fiyat, Urun urun, Kullanici kullanici) {
        this.id = id;
        this.urun_adet = urun_adet;
        this.toplam_fiyat = toplam_fiyat;
        this.urun = urun;
        this.kullanici = kullanici;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getUrun_adet() {
        return urun_adet;
    }

    public void setUrun_adet(int urun_adet) {
        this.urun_adet = urun_adet;
    }

    public double getToplam_fiyat() {
        return toplam_fiyat;
    }

    public void setToplam_fiyat(double toplam_fiyat) {
        this.toplam_fiyat = toplam_fiyat;
    }

    public Urun getUrun() {
        return urun;
    }

    public void setUrun(Urun urun) {
        this.urun = urun;
    }

    public Kullanici getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }
}
