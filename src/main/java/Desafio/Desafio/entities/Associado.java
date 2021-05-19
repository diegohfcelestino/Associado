package Desafio.Desafio.entities;



import javax.persistence.*;


@Entity
public class Associado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAssociado;
    private String nome;
    private String cpf;


    public Associado() {
    }


    public Associado(Long idAssociado, String nome, String cpf) {
        this.idAssociado = idAssociado;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Long getidAssociado() {
        return idAssociado;
    }

    public void setidAssociado(Long idAssociado) {
        this.idAssociado = idAssociado;
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

