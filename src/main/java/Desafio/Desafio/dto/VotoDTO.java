package Desafio.Desafio.dto;

import Desafio.Desafio.entities.Associado;
import Desafio.Desafio.entities.Pauta;

public class VotoDTO {


    private Long id;
    private Long idPauta;
    private Long idAssociado;
    private String voto;

    public VotoDTO(){}

    public VotoDTO(Long id, Pauta pauta, Associado associado, String voto) {
        this.id = id;
        this.idPauta = pauta.getidPauta();
        this.idAssociado = associado.getidAssociado();
        this.voto = voto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getVoto() {
        return voto;
    }

    public void setVoto(String voto) {
        this.voto = voto;
    }

    public Long getIdPauta() {
        return idPauta;
    }

    public void setIdPauta(Long idPauta) {
        this.idPauta = idPauta;
    }

    public Long getIdAssociado() {
        return idAssociado;
    }

    public void setIdAssociado(Long idAssociado) {
        this.idAssociado = idAssociado;
    }

}

