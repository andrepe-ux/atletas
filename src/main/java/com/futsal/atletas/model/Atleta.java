package com.futsal.atletas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "atletas")
public class Atleta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String posicao;
    private String escalao;
    private Integer numeroAtleta;
    private Integer idade;
    private Double altura;
    private Double peso;
    private String telemovel;
    private String email;
    private String status;
    private String condicaoFisica;
    private String encarregadoEducacao;
    private String telemovelEE;

    @Column(columnDefinition = "TEXT")
    private String fotoBase64;

    // Novos campos adicionados (Valores por escolha)
    private String avaliacao;
    private String nivelCansaco;
    private String descanso;
    private String alimentacao;
    private String aproveitamentoEscolar;

    @Column(columnDefinition = "TEXT")
    private String observacoes;

    public Atleta() {}

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getPosicao() { return posicao; }
    public void setPosicao(String posicao) { this.posicao = posicao; }

    public String getEscalao() { return escalao; }
    public void setEscalao(String escalao) { this.escalao = escalao; }

    public Integer getNumeroAtleta() { return numeroAtleta; }
    public void setNumeroAtleta(Integer numeroAtleta) { this.numeroAtleta = numeroAtleta; }

    public Integer getIdade() { return idade; }
    public void setIdade(Integer idade) { this.idade = idade; }

    public Double getAltura() { return altura; }
    public void setAltura(Double altura) { this.altura = altura; }

    public Double getPeso() { return peso; }
    public void setPeso(Double peso) { this.peso = peso; }

    public String getTelemovel() { return telemovel; }
    public void setTelemovel(String telemovel) { this.telemovel = telemovel; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getCondicaoFisica() { return condicaoFisica; }
    public void setCondicaoFisica(String condicaoFisica) { this.condicaoFisica = condicaoFisica; }

    public String getEncarregadoEducacao() { return encarregadoEducacao; }
    public void setEncarregadoEducacao(String encarregadoEducacao) { this.encarregadoEducacao = encarregadoEducacao; }

    public String getTelemovelEE() { return telemovelEE; }
    public void setTelemovelEE(String telemovelEE) { this.telemovelEE = telemovelEE; }

    public String getFotoBase64() { return fotoBase64; }
    public void setFotoBase64(String fotoBase64) { this.fotoBase64 = fotoBase64; }

    public String getAvaliacao() { return avaliacao; }
    public void setAvaliacao(String avaliacao) { this.avaliacao = avaliacao; }

    public String getNivelCansaco() { return nivelCansaco; }
    public void setNivelCansaco(String nivelCansaco) { this.nivelCansaco = nivelCansaco; }

    public String getDescanso() { return descanso; }
    public void setDescanso(String descanso) { this.descanso = descanso; }

    public String getAlimentacao() { return alimentacao; }
    public void setAlimentacao(String alimentacao) { this.alimentacao = alimentacao; }

    public String getAproveitamentoEscolar() { return aproveitamentoEscolar; }
    public void setAproveitamentoEscolar(String aproveitamentoEscolar) { this.aproveitamentoEscolar = aproveitamentoEscolar; }

    public String getObservacoes() { return observacoes; }
    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }
}