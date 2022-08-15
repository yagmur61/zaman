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
    private  Long kullanici_id;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "urun_id")
     private List<Urun> uruns;

    public Sepet() {
    }

    public Sepet(Long id, Long kullanici_id, List<Urun> uruns) {
        this.id = id;
        this.kullanici_id = kullanici_id;
        this.uruns = uruns;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getKullanici_id() {
        return kullanici_id;
    }

    public void setKullanici_id(Long kullanici_id) {
        this.kullanici_id = kullanici_id;
    }

    public List<Urun> getUruns() {
        return uruns;
    }

    public void setUruns(List<Urun> uruns) {
        this.uruns = uruns;
    }
}
