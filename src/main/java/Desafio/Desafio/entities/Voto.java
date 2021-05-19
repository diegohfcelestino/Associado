package Desafio.Desafio.entities;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Voto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Associado associado;
    @ManyToOne
    private Pauta pauta;

    private String voto;

    public Voto(){}

    public Voto(Long id, Associado associado, Pauta pauta, String voto) {
        this.id = id;
        this.associado = associado;
        this.pauta = pauta;
        this.voto = voto;
    }

    public Associado getAssociado() {
        return associado;
    }

    public void setAssociado(Associado associado) {
        this.associado = associado;
    }

    public Pauta getPauta() {
        return pauta;
    }

    public void setPauta(Pauta pauta) {
        this.pauta = pauta;
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
}
