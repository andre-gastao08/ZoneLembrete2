package local.lembrete.zonelembrete;

/**
 * Created by Rui on 09-Dec-16.
 */

public class Alarme {
    public String nome;




    public Alarme( String nome){
        this.nome= nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    public long getId(){
    // return 0 por enquanto
        return 0;
    }
}
