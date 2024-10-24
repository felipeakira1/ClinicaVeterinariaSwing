/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author felipe
 */
public class Exame extends Servico {
    private String tipoExame;
    private String resultados;

    public Exame(int id, LocalDate data, LocalTime hora, double valor, double gasto, int animal_id, int veterinario_id, int tipo, String tipoExame, String resultados) {
        super(id, data, hora, valor, gasto, animal_id, veterinario_id, tipo);
        this.tipoExame = tipoExame;
        this.resultados = resultados;
    }

    public String getTipoExame() {
        return tipoExame;
    }

    public String getResultados() {
        return resultados;
    }

    public void setTipoExame(String tipoExame) {
        this.tipoExame = tipoExame;
    }

    public void setResultados(String resultados) {
        this.resultados = resultados;
    }
    
    
}
