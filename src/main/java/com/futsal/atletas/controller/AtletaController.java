package com.futsal.atletas.controller;

import com.futsal.atletas.model.Atleta;
import com.futsal.atletas.repository.AtletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/atletas")
@CrossOrigin(origins = "*")
public class AtletaController {

    @Autowired
    private AtletaRepository atletaRepository;

    @GetMapping
    public List<Atleta> listarTodos() {
        return atletaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Atleta> buscarPorId(@PathVariable Long id) {
        return atletaRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/posicao/{posicao}")
    public List<Atleta> buscarPorPosicao(@PathVariable String posicao) {
        return atletaRepository.findByPosicao(posicao);
    }

    @GetMapping("/status/{status}")
    public List<Atleta> buscarPorStatus(@PathVariable String status) {
        return atletaRepository.findByStatus(status);
    }

    @PostMapping
    public Atleta criarAtleta(@RequestBody Atleta atleta) {
        return atletaRepository.save(atleta);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Atleta> atualizarAtleta(@PathVariable Long id, @RequestBody Atleta atletaAtualizado) {
        return atletaRepository.findById(id).map(atleta -> {
            atleta.setNome(atletaAtualizado.getNome());
            atleta.setPosicao(atletaAtualizado.getPosicao());
            atleta.setEscalao(atletaAtualizado.getEscalao());
            atleta.setNumeroAtleta(atletaAtualizado.getNumeroAtleta());
            atleta.setIdade(atletaAtualizado.getIdade());
            atleta.setAltura(atletaAtualizado.getAltura());
            atleta.setPeso(atletaAtualizado.getPeso());
            atleta.setTelemovel(atletaAtualizado.getTelemovel());
            atleta.setEmail(atletaAtualizado.getEmail());
            atleta.setStatus(atletaAtualizado.getStatus());
            atleta.setCondicaoFisica(atletaAtualizado.getCondicaoFisica());
            atleta.setEncarregadoEducacao(atletaAtualizado.getEncarregadoEducacao());
            atleta.setTelemovelEE(atletaAtualizado.getTelemovelEE());
            if (atletaAtualizado.getFotoBase64() != null) {
                atleta.setFotoBase64(atletaAtualizado.getFotoBase64());
            }
            Atleta actualizado = atletaRepository.save(atleta);
            return ResponseEntity.ok(actualizado);
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarAtleta(@PathVariable Long id) {
        if (atletaRepository.existsById(id)) {
            atletaRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
