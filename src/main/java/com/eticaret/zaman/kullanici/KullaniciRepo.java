package com.eticaret.zaman.kullanici;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface KullaniciRepo extends JpaRepository<Kullanici, Long> {
    @Query("SELECT u FROM Kullanici u WHERE u.email = ?1")
    public Kullanici findByEmail(String email);

}
