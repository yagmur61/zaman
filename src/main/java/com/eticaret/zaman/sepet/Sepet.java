package com.eticaret.zaman.sepet;

import com.eticaret.zaman.kullanici.Kullanici;
import com.eticaret.zaman.urun.Urun;

import javax.persistence.*;
import java.util.List;

@Entity
public class Sepet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "urun_id")
    private List<Urun> urun;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "kullanici_id")
    private Kullanici kullanici;

    public Sepet() {
    }

    public Sepet(Long id, List<Urun> urun, Kullanici kullanici) {
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

    public List<Urun> getUrun() {
        return urun;
    }

    public void setUrun(List<Urun> urun) {
        this.urun = urun;
    }

    public Kullanici getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }
}
