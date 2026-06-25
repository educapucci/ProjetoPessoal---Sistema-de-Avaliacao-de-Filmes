package model.entities;

public class Elenco {
    private Integer idElenco;
    private String personagem;

    private Ator ator;
    private Filme filme;

    public Elenco(){}

    public Elenco(Integer idElenco, String personagem, Ator ator, Filme filme) {
        this.idElenco = idElenco;
        this.personagem = personagem;
        this.ator = ator;
        this.filme = filme;
    }

    public Integer getIdElenco() {
        return idElenco;
    }

    public void setIdElenco(Integer idElenco) {
        this.idElenco = idElenco;
    }

    public Ator getAtor() {
        return ator;
    }

    public void setAtor(Ator ator) {
        this.ator = ator;
    }

    public String getPersonagem() {
        return personagem;
    }

    public void setPersonagem(String personagens) {
        this.personagem = personagens;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }


}
