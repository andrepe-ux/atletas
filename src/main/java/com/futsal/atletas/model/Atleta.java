package com.futsal.atletas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "atletas")
public class Atleta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Integer idade;
    private Double altura;
    private Double peso;
    private Integer numeroAtleta;
    private String telemovel;
    private String escalao; // <--- NOVO CAMPO ADICIONADO
    private String status; // 'Disponivel', 'Lesionado', 'Ausente'
    private String condicaoFisica;
    
    private String email;
    private String encarregadoEducacao;
    private String telemovelEE;
    private String posicao;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String fotoBase64; // Guarda a foto em Base64

    public Atleta() {}

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getEscalao() {
        return escalao;
    }

    public void setEscalao(String escalao) {
        this.escalao = escalao;
    }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Integer getIdade() { return idade; }
    public void setIdade(Integer idade) { this.idade = idade; }

    public Double getAltura() { return altura; }
    public void setAltura(Double altura) { this.altura = altura; }

    public Double getPeso() { return peso; }
    public void setPeso(Double peso) { this.peso = peso; }

    public Integer getNumeroAtleta() { return numeroAtleta; }
    public void setNumeroAtleta(Integer numeroAtleta) { this.numeroAtleta = numeroAtleta; }

    public String getTelemovel() { return telemovel; }
    public void setTelemovel(String telemovel) { this.telemovel = telemovel; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getCondicaoFisica() { return condicaoFisica; }
    public void setCondicaoFisica(String condicaoFisica) { this.condicaoFisica = condicaoFisica; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getEncarregadoEducacao() { return encarregadoEducacao; }
    public void setEncarregadoEducacao(String encarregadoEducacao) { this.encarregadoEducacao = encarregadoEducacao; }

    public String getTelemovelEE() { return telemovelEE; }
    public void setTelemovelEE(String telemovelEE) { this.telemovelEE = telemovelEE; }

    public String getPosicao() { return posicao; }
    public void setPosicao(String posicao) { this.posicao = posicao; }

    public String getFotoBase64() { return fotoBase64; }
    public void setFotoBase64(String fotoBase64) { this.fotoBase64 = fotoBase64; }
}
