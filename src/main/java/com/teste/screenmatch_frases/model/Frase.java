package com.teste.screenmatch_frases.model;

import jakarta.persistence.*;

@Entity
@Table(name = "frases")
public class Frase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String titulo;

    private String frase;

    private String personagem;

    private String poster;

    public Frase() {
    }

    public Frase(String titulo, String frase, String personagem, String poster) {
        this.titulo = titulo;
        this.frase = frase;
        this.personagem = personagem;
        this.poster = poster;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getPersonagem() {
        return personagem;
    }

    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    @Override
    public String toString() {
        return "Frase{" +
                "frase='" + frase + '\'' +
                ", personagem='" + personagem + '\'' +
                ", titulo='" + titulo + '\'' +
                ", id=" + id +
                ", poster='" + poster + '\'' +
                '}';
    }
}
