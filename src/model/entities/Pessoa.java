package model.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Pessoa {
    protected Integer idPessoa;
    protected String Nome;
    protected LocalDate dataNascimento;
    protected String nacionalidade;

    public Pessoa(){
    }

    public Pessoa(Integer idPessoa, String nome, LocalDate dataNascimento, String nacionalidade) {
        this.idPessoa = idPessoa;
        Nome = nome;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
    }

    public Integer getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int calcularIdade(LocalDate dataNascimento){
        if(this.dataNascimento == null) return 0; //caso a data nao esteja definida ainda
        LocalDate agora = LocalDate.now();

        //data mais antiga, dps a mais recente
        Period periodo = Period.between(this.dataNascimento, agora);
        return periodo.getYears(); //retorna um num inteiro, somente os anos da pessoa
    }
}
