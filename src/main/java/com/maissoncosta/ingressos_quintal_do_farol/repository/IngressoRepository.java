package com.maissoncosta.ingressos_quintal_do_farol.repository;

import com.maissoncosta.ingressos_quintal_do_farol.model.Ingresso;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IngressoRepository extends JpaRepository<Ingresso, Long> {
}
