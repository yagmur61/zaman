package com.eticaret.zaman.sepet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SepetRepo extends JpaRepository<Sepet, Long> {
}
