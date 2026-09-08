package com.maissoncosta.ingressos_quintal_do_farol.controller;

import com.maissoncosta.ingressos_quintal_do_farol.model.Ingresso;
import com.maissoncosta.ingressos_quintal_do_farol.repository.IngressoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingressos")
public class IngressoController {
    private final IngressoRepository ingressoRepository;

    public IngressoController(IngressoRepository ingressoRepository) {
        this.ingressoRepository = ingressoRepository;
    }

    @PostMapping
    public Ingresso criar(@RequestBody Ingresso ingresso) {
        return ingressoRepository.save(ingresso);
    }
}
