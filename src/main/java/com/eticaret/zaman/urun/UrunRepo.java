package com.eticaret.zaman.urun;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrunRepo  extends JpaRepository<Urun, Long> {

}
