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

    public Sepet() {
    }

    public Sepet(Long id, List<Urun> urun) {
        this.id = id;
        this.urun = urun;
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

}
