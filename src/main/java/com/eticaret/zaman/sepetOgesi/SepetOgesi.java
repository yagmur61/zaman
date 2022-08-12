package com.eticaret.zaman.sepetOgesi;


import com.eticaret.zaman.kullanici.Kullanici;
import com.eticaret.zaman.urun.Urun;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "sepetOgesi")
public class SepetOgesi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "urun_id")
    private List<Urun> urun;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "kullanici_id")
    private Kullanici kullanici;


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
