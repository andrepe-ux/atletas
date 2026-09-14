package com.futsal.atletas.controller;

import com.futsal.atletas.model.Atleta;
import com.futsal.atletas.repository.AtletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public ResponseEntity<Atleta> buscarPorId(@PathVariable("id") Long id) {
        Optional<Atleta> atleta = atletaRepository.findById(id);
        if (atleta.isPresent()) {
            return ResponseEntity.ok(atleta.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public Atleta criarAtleta(@RequestBody Atleta atleta) {
        return atletaRepository.save(atleta);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Atleta> atualizarAtleta(@PathVariable("id") Long id, @RequestBody Atleta atletaDetalhes) {
        Optional<Atleta> atletaOptional = atletaRepository.findById(id);
        
        if (atletaOptional.isPresent()) {
            Atleta atleta = atletaOptional.get();
            atleta.setNome(atletaDetalhes.getNome());
            atleta.setPosicao(atletaDetalhes.getPosicao());
            atleta.setEscaloes(atletaDetalhes.getEscaloes());
            atleta.setNumeroAtleta(atletaDetalhes.getNumeroAtleta());
            atleta.setIdade(atletaDetalhes.getIdade());
            atleta.setDataNascimento(atletaDetalhes.getDataNascimento());
            atleta.setAltura(atletaDetalhes.getAltura());
            atleta.setPeso(atletaDetalhes.getPeso());
            atleta.setTelemovel(atletaDetalhes.getTelemovel());
            atleta.setEmail(atletaDetalhes.getEmail());
            atleta.setStatus(atletaDetalhes.getStatus());
            atleta.setCondicaoFisica(atletaDetalhes.getCondicaoFisica());
            atleta.setEncarregadoEducacao(atletaDetalhes.getEncarregadoEducacao());
            atleta.setTelemovelEE(atletaDetalhes.getTelemovelEE());
            atleta.setAvaliacao(atletaDetalhes.getAvaliacao());
            atleta.setNivelCansaco(atletaDetalhes.getNivelCansaco());
            atleta.setDescanso(atletaDetalhes.getDescanso());
            atleta.setAlimentacao(atletaDetalhes.getAlimentacao());
            atleta.setAproveitamentoEscolar(atletaDetalhes.getAproveitamentoEscolar());
            atleta.setObservacoes(atletaDetalhes.getObservacoes());
            
            if (atletaDetalhes.getFotoBase64() != null) {
                atleta.setFotoBase64(atletaDetalhes.getFotoBase64());
            }

            Atleta atualizado = atletaRepository.save(atleta);
            return ResponseEntity.ok(atualizado);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarAtleta(@PathVariable("id") Long id) {
        if (atletaRepository.existsById(id)) {
            atletaRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}