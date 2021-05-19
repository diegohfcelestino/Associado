package Desafio.Desafio.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Pauta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPauta;
    private String nome;

    public Pauta() {
    }

    public Pauta(Long idPauta, String nome) {
        this.idPauta = idPauta;
        this.nome = nome;

    }

    @JsonIgnore
    @OneToMany (mappedBy = "pauta")
    private List<Voto> votos = new ArrayList<>();

    public Long getidPauta() {
        return idPauta;
    }

    public void setidPauta(Long id) {
        this.idPauta = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
