package com.maissoncosta.ingressos_quintal_do_farol.repository;

import com.maissoncosta.ingressos_quintal_do_farol.model.Lote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoteRepository extends JpaRepository<Lote, Long> {
}
