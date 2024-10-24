/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felipe
 */
public class Animal {
    private int id;
    private String nome;
    private String especie;
    private String raca;
    private int idade;
    private String sexo;
    private int tutorId;
    private List<ConsultaGeral> consultas;
    private List<Vacinacao> vacinas;
    private Castracao castracao;
    private List<Exame> exames;

    public Animal(int id, String nome, String especie, String raca, int idade, String sexo, int tutorId) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.sexo = sexo;
        this.tutorId = tutorId;
        consultas = new ArrayList<>();
        vacinas = new ArrayList<>();
        exames = new ArrayList<>();
    }

    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public int getTutorId() {
        return tutorId;
    }

    public List<ConsultaGeral> getConsultas() {
        return consultas;
    }

    public List<Vacinacao> getVacinacoes() {
        return vacinas;
    }

    public Castracao getCastracao() {
        return castracao;
    }

    public List<Exame> getExames() {
        return exames;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setTutorId(int tutorId) {
        this.tutorId = tutorId;
    }

    public void setConsultas(List<ConsultaGeral> consultas) {
        this.consultas = consultas;
    }

    public void setVacinacoes(List<Vacinacao> vacinas) {
        this.vacinas = vacinas;
    }

    public void setCastracao(Castracao castracao) {
        this.castracao = castracao;
    }

    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }
    
    public void adicionarConsulta(ConsultaGeral consulta) {
        this.consultas.add(consulta);
    }
    
    public void adicionarVacina(Vacinacao vacinacao) {
        this.vacinas.add(vacinacao);
    }
    
    public void adicionarCastracao(Castracao castracao) {
        this.castracao = castracao;
    }
    
    public void adicionarExame(Exame exame) {
        this.exames.add(exame);
    }
    
    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + ", especie=" + especie + ", raca=" + raca + ", idade=" + idade + ", sexo=" + sexo + ", tutorId=" + tutorId + '}';
    }
    
    
}
