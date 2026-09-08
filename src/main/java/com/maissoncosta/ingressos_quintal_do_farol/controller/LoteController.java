package com.maissoncosta.ingressos_quintal_do_farol.controller;


import com.maissoncosta.ingressos_quintal_do_farol.model.Lote;
import com.maissoncosta.ingressos_quintal_do_farol.repository.LoteRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lotes")
public class LoteController {

    private final LoteRepository loteRepository;
    public LoteController(LoteRepository loteRepository) {
        this.loteRepository = loteRepository;
    }

    @PostMapping
    public Lote criar(@RequestBody Lote lote) {
        return loteRepository.save(lote);
    }

}
