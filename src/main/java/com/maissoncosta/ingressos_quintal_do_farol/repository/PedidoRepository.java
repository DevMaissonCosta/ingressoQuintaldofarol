package com.maissoncosta.ingressos_quintal_do_farol.repository;

import com.maissoncosta.ingressos_quintal_do_farol.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}