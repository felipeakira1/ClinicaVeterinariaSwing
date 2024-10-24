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
public class Veterinario extends Pessoa {
    private String crmv;
    
    private List<ConsultaGeral> consultas;
    private List<Vacinacao> vacinas;
    private Castracao castracao;
    private List<Exame> exames;

    public Veterinario(int id, String nome, String endereco, String cpf, String crmv) {
        super(id, nome, endereco, cpf);
        this.crmv = crmv;
        consultas = new ArrayList<>();
        vacinas = new ArrayList<>();
        exames = new ArrayList<>();
    }

    public String getCrmv() {
        return crmv;
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
    
}
