package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Ator extends Pessoa{
    private Integer idAtor;
    list<Filmes> filmesAtuados;

    public Ator(Integer idPessoa, String nome, LocalDate dataNascimento, String nacionalidade, Integer idAtor) {
        super(idPessoa, nome, dataNascimento, nacionalidade);
        this.idAtor = idAtor;
        this.filmesAtuados = new ArrayList<>();
    }

    public Ator(Integer idAtor) {
        this.idAtor = idAtor;
    }

    public Integer getIdAtor() {
        return idAtor;
    }

    public void setIdAtor(Integer idAtor) {
        this.idAtor = idAtor;
    }
}
