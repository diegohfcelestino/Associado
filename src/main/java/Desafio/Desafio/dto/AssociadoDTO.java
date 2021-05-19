package Desafio.Desafio.dto;

import Desafio.Desafio.entities.Associado;

import java.io.Serializable;

public class AssociadoDTO  implements Serializable {

    private Long idAssociado;
    private String nome;
    private String cpf;

    public AssociadoDTO(){}

    public AssociadoDTO(Associado associado){
        idAssociado = associado.getidAssociado();
        nome = associado.getNome();
        cpf = associado.getCpf();
    }

    public Long getId() {
        return idAssociado;
    }

    public void setidAssociado(Long id) {
        this.idAssociado = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

