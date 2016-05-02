package utng.edu.mx.proyectoruby2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Juan Ramon Delgado Mendoza on 07/03/2016.
 * @author Juan Ramon Delgado Mendoza
 * @email mon-ra16@hotmail.com
 *
 */
public class TerminoTemaOffActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView txvMensaje;
    private Button btnRegistrarse,btnDespues;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.termino_tema_off_layout);
        initComponents();
    }

    private void initComponents() {
        txvMensaje=(TextView) findViewById(R.id.txv_mensaje_tema_concluido_off);
        btnRegistrarse=(Button)findViewById(R.id.btn_registrarse);
        btnDespues=(Button)findViewById(R.id.btn_no_interesa);
        CharSequence textoInterpretado = Html.fromHtml(getResources().getString(R.string.html_tema_concluido_off));
        txvMensaje.setText(textoInterpretado);
        btnRegistrarse.setOnClickListener(this);
        btnDespues.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btn_registrarse){
            startActivity(new Intent(TerminoTemaOffActivity.this, FormCreateLoginActivity.class));
            finish();
        }
        finish();
    }
}