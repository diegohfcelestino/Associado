package Desafio.Desafio.dto;

import Desafio.Desafio.entities.Pauta;

import java.io.Serializable;

public class PautaDTO implements Serializable {

    private Long idPauta;
    private String nome;

    public PautaDTO(){ }

    public PautaDTO (Pauta pauta){
        idPauta = pauta.getidPauta();
        nome = pauta.getNome();
    }

    public Long getId() {
        return idPauta;
    }

    public void setId(Long id) {
        this.idPauta = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
