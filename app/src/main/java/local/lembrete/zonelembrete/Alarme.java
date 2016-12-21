package local.lembrete.zonelembrete;

import java.util.Date;

/**
 * Alarme é o objecto usado para guardar a informação do Alarme.
 */

class Alarme {
    private String nome;
    private Date dataInicio;
    private Date dataFim;

    //Para testes.
    Alarme(String nome){
        this.nome=nome;
    }
    Alarme(String nome, Date dataInicio, Date dataFim){
        this.nome=nome;
        this.dataInicio=dataInicio;
        this.dataFim=dataFim;
    }
    @Override
    public String toString() {
        return nome;
    }
}
