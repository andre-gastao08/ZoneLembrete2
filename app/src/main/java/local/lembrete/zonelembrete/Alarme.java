package local.lembrete.zonelembrete;

/**
 * Created by Rui on 09-Dec-16.
 */

class Alarme {
    private String nome;

    //Para testes.
     Alarme(String nome){
        this.nome=nome;
    }
    @Override
    public String toString() {
        return nome;
    }
}
