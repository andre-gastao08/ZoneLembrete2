package local.lembrete.zonelembrete;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class CriarAlarme extends AppCompatActivity {

    static final int REQUEST_IMAGE_CAPTURE = 1;
    ImageView cameraView;
    EditText nome;
    EditText datainicio;
    EditText datafim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_alarme);

        nome = (EditText) findViewById(R.id.nome);
        datainicio = (EditText) findViewById(R.id.dataInicio);
        datafim = (EditText) findViewById(R.id.dataFim);
        cameraView = (ImageView) findViewById(R.id.imageCamera);
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

    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            cameraView.setImageBitmap(imageBitmap);
        }

    }
}
