package com.eticaret.zaman.sepet;

import com.eticaret.zaman.kullanici.Kullanici;
import com.eticaret.zaman.urun.Urun;

import javax.persistence.*;

@Entity
public class Sepet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "urun_id")
    private Urun urun;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "kullanici_id")
    private Kullanici kullanici;

    public Sepet() {
    }

    public Sepet(Long id, Urun urun, Kullanici kullanici) {
        this.id = id;
        this.urun = urun;
        this.kullanici = kullanici;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
