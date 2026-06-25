package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Filme {
    private Integer idFilme;
    private String tituloFilme;
    private Integer AnoLancamento;
    private String sinopse;
    private Integer duracao;
    private Integer classificacaoIndicativa;

    private List<Elenco> elencoFilme = new ArrayList<>();
    //une ator + personagem

    private List<Genero> generos;
    private List<Diretor> diretores;
    private List<Avaliacao> avaliacoes;


    private List<Double> notas;

    public Filme(){
    }

    public Filme(Integer idFilme, String tituloFilme, Integer anoLancamento, String sinopse, Integer duracao, Integer classificacaoIndicativa) {
        this.idFilme = idFilme;
        this.tituloFilme = tituloFilme;
        AnoLancamento = anoLancamento;
        this.sinopse = sinopse;
        this.duracao = duracao;
        this.classificacaoIndicativa = classificacaoIndicativa;
        this.notas = new ArrayList<>();
        this.generos = new ArrayList<>();
        this.diretores = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
        this.elencoFilme = new ArrayList<>();
    }


    public Integer getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(Integer idFilme) {
        this.idFilme = idFilme;
    }

    public String getTituloFilme() {
        return tituloFilme;
    }

    public void setTituloFilme(String tituloFilme) {
        this.tituloFilme = tituloFilme;
    }

    public Integer getAnoLancamento() {
        return AnoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        //ate pensei em colocar uma restricao aqui, falando que a data de lancamento nao poderia ser depois da data de agora, mas poderia, caso o filme nao tenha sido lancado, o que e comum em plataformas desse tipo
        AnoLancamento = anoLancamento;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public Integer getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public void setClassificacaoIndicativa(Integer classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    public void adicionarAoElenco(Elenco elenco){
        this.elencoFilme.add(elenco);
    }

    public void adicionarGenero(Genero genero) {
        this.generos.add(genero);
    }

    public void adicionarDiretor(Diretor diretor) {
        this.diretores.add(diretor);
    }

    public void adicionarAvaliacao(Avaliacao avaliacao) {
        this.avaliacoes.add(avaliacao);
    }

    public void fichaFilme(){
        System.out.println("Filme: " + this.tituloFilme);

        System.out.print("Direcao: ");
        for(Diretor d : diretores){
            System.out.print(d.getNome() + " ");
        }
        System.out.println();
        System.out.print("Genero(s): ");
        for(Genero g : generos){
            System.out.print(g.getNome() + " ");
        }
        System.out.println();
    }



    public void verElenco(){
        System.out.println("----ELENCO DO FILME: " + this.tituloFilme.toUpperCase() + "----");

        if(this.elencoFilme.isEmpty()){
            System.out.println("Nao ha dados de atores escalados para esse filme!");
            return;
        }

        for(Elenco e : this.elencoFilme){
            System.out.println("Ator/Atriz: " + e.getAtor().getNome() +
                    " | Personagem: " + e.getPersonagem());
        }

        System.out.println("--- ---- ---- ---- -----");
    }


    public Double mediaFilme(){
        if(avaliacoes.isEmpty()) return 0.0;

        double soma = 0.0;
        for(Avaliacao a : avaliacoes){
            soma += a.getNota();
        }
        return soma / avaliacoes.size();
    }

    /* talvez -provavel- eu coloque isso dentro de Avaliacao
    public void adicionarNota(double nota){
        //se a nota for invalida, lanca o erro e para a execucao
        if (nota< 0 || nota >10)
            throw new IllegalArgumentException
                    ("A nota deve estar entre 0.0 e 10.0. Valor digitado: " + nota);

        this.notas.add(nota);

    }

    public Double mediaFilme(){
        if(notas.isEmpty()){
            return 0.0;
        }
        double soma = 0.0;
        for(Double n : notas){
            soma+=n;
        }
        return soma / notas.size();
    }*/


}
