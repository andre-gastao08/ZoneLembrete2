package local.lembrete.zonelembrete;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class CriarAlarme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_alarme);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final EditText nome = (EditText) findViewById(R.id.nome);
        final EditText datainicio = (EditText) findViewById(R.id.dataInicio);
        EditText datafim = (EditText) findViewById(R.id.datafim);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO criar um check para não criar um alarme sem parametros.
                //TODO Adicionar datas ao input.
                Alarme novo =new Alarme(nome.getText().toString());
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                finish();
            }
        });
    }

}
