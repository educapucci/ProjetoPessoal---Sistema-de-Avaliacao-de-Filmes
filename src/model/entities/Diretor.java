package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Diretor extends Pessoa{
    private Integer idDiretor;
    list<Filmes> filmesDirigidos;

    Diretor(){
    }
    public Diretor(Integer idDiretor) {
        this.idDiretor = idDiretor;
    }
    public Diretor(Integer idPessoa, String nome, LocalDate dataNascimento, String nacionalidade, Integer idDiretor) {
        super(idPessoa, nome, dataNascimento, nacionalidade);
        this.idDiretor = idDiretor;
        this.filmesDirigidos=new ArrayList<>();
    }

    public Integer getIdDiretor() {
        return idDiretor;
    }

    public void setIdDiretor(Integer idDiretor) {
        this.idDiretor = idDiretor;
    }
}
