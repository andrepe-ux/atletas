package com.futsal.atletas.repository;

import com.futsal.atletas.model.Atleta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AtletaRepository extends JpaRepository<Atleta, Long> {
    List<Atleta> findByPosicao(String posicao);
    List<Atleta> findByStatus(String status);
}
