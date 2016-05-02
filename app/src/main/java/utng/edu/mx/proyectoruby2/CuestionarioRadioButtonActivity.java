package utng.edu.mx.proyectoruby2;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import utng.edu.mx.proyectoruby2.util.DBAdapter;
/**
 * Created by Juan Ramon Delgado Mendoza on 07/03/2016.
 * @author Juan Ramon Delgado Mendoza
 * @email mon-ra16@hotmail.com
 *
 */
public class CuestionarioRadioButtonActivity extends AppCompatActivity implements View.OnClickListener{
    private RadioGroup rbgOpciones;
    private RadioButton rbtRespuestaUno,rbtRespuestaDos;
    private Button btnComprobarRes;
    private Bundle valoresResividos;
    private TextView txvPregunta;
    private String pregunta="",opcionUno="",opcionDos="";
    private DBAdapter dbAdapter;
    private Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cuestionario_radio_button_layout);
        initComponents();
    }

    private void initComponents() {
        dbAdapter=new DBAdapter(this);
        dbAdapter.open();
        vibrator=(Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        rbgOpciones = (RadioGroup) findViewById(R.id.rbg_opciones);
        rbtRespuestaUno = (RadioButton) findViewById(R.id.rbt_repuesta_uno);
        rbtRespuestaDos = (RadioButton) findViewById(R.id.rbt_repuesta_dos);
        btnComprobarRes = (Button) findViewById(R.id.btn_comprobar_res);
        txvPregunta=(TextView)findViewById(R.id.txv_pregunta);



        valoresResividos=getIntent().getExtras();

        switch (valoresResividos.getInt("moduloS")){
            case 0://Modulo 1
                switch (valoresResividos.getInt("posicionTemaS")){
                    case 1://Medio ambiente de configuración
                        pregunta=getResources().getString(R.string.cuestionario_radio_button_pregunta_uno);
                        opcionUno=getResources().getString(R.string.cuestionario_radio_button_pregunta_uno_respuesta_a);
                        opcionDos=getResources().getString(R.string.cuestionario_radio_button_pregunta_uno_respuesta_b);
                        break;
                    case 3://Palabras reservadas
                        pregunta=getResources().getString(R.string.cuestionario_radio_button_pregunta_dos);
                        opcionUno=getResources().getString(R.string.cuestionario_radio_button_pregunta_dos_respuesta_a);
                        opcionDos=getResources().getString(R.string.cuestionario_radio_button_pregunta_dos_respuesta_b);
                        break;
                    default:
                        break;
                }
                break;
            case 1://Modulo 2
                switch (valoresResividos.getInt("posicionTemaS")) {
                    case 1://Método
                        pregunta=getResources().getString(R.string.cuestionario_radio_button_pregunta_tres);
                        opcionUno=getResources().getString(R.string.cuestionario_radio_button_pregunta_tres_respuesta_a);
                        opcionDos=getResources().getString(R.string.cuestionario_radio_button_pregunta_tres_respuesta_b);
                        break;
                    case 3://Modulo
                        pregunta=getResources().getString(R.string.cuestionario_radio_button_pregunta_cuatro);
                        opcionUno=getResources().getString(R.string.cuestionario_radio_button_pregunta_cuatro_respuesta_a);
                        opcionDos=getResources().getString(R.string.cuestionario_radio_button_pregunta_cuatro_respuesta_b);
                        break;
                    default:
                        break;
                }
                break;
            case 2://Modulo 3
                switch (valoresResividos.getInt("posicionTemaS")) {
                    case 1://Arreglos
                        pregunta=getResources().getString(R.string.cuestionario_radio_button_pregunta_cinco);
                        opcionUno=getResources().getString(R.string.cuestionario_radio_button_pregunta_cinco_respuesta_a);
                        opcionDos=getResources().getString(R.string.cuestionario_radio_button_pregunta_cinco_respuesta_b);
                        break;
                    case 3://Fecha y hora
                        pregunta=getResources().getString(R.string.cuestionario_radio_button_pregunta_seis);
                        opcionUno=getResources().getString(R.string.cuestionario_radio_button_pregunta_seis_respuesta_a);
                        opcionDos=getResources().getString(R.string.cuestionario_radio_button_pregunta_seis_respuesta_b);
                        break;
                    default:
                        break;
                }
                break;
            case 3://Modulo 4
                switch (valoresResividos.getInt("posicionTemaS")) {
                    case 1://Iterators
                        pregunta=getResources().getString(R.string.cuestionario_radio_button_pregunta_siete);
                        opcionUno=getResources().getString(R.string.cuestionario_radio_button_pregunta_siete_respuesta_a);
                        opcionDos=getResources().getString(R.string.cuestionario_radio_button_pregunta_siete_respuesta_b);
                        break;
                    case 3://Excepciones
                        pregunta=getResources().getString(R.string.cuestionario_radio_button_pregunta_ocho);
                        opcionUno=getResources().getString(R.string.cuestionario_radio_button_pregunta_ocho_respuesta_a);
                        opcionDos=getResources().getString(R.string.cuestionario_radio_button_pregunta_ocho_respuesta_b);
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }

        txvPregunta.setText(pregunta);
        rbtRespuestaUno.setText(opcionUno);
        rbtRespuestaDos.setText(opcionDos);

        btnComprobarRes.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String respuesta = getResources().getString(R.string.mensage_cuestionario_incorrecto_out_logeo);
        //String espacios="\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020";
        int idModul=dbAdapter.idPrimerModuloIns(FormLoginActivity.ID_USU_LOGEADO,"Modulo 1");
        int resCorrectas=0;
        switch (valoresResividos.getInt("moduloS")){
            case 0://Modulo 1
                switch (valoresResividos.getInt("posicionTemaS")){
                    case 1://Medio ambiente de configuración
                        if (rbtRespuestaUno.isChecked()) {
                            resCorrectas++;
                            dbAdapter.activarTema(idModul, 1, 2);
                        } else if (rbtRespuestaDos.isChecked()) {vibrator.vibrate(1000);}
                        break;
                    case 3://Palabras reservadas
                        if (rbtRespuestaUno.isChecked()) {vibrator.vibrate(1000);}
                        else if (rbtRespuestaDos.isChecked()) {
                            resCorrectas++;
                            dbAdapter.activarTema(idModul, 1, 4);
                        }
                        break;
                    default:
                        break;
                }
                break;
            case 1://Modulo 2
                switch (valoresResividos.getInt("posicionTemaS")) {
                    case 1://Método
                        if (rbtRespuestaUno.isChecked()) {vibrator.vibrate(1000);}
                        else if (rbtRespuestaDos.isChecked()) {
                            resCorrectas++;
                            dbAdapter.activarTema(idModul, 2, 2);
                        }
                        break;
                    case 3://Modulo
                        if (rbtRespuestaUno.isChecked()) {vibrator.vibrate(1000);}
                        else if (rbtRespuestaDos.isChecked()) {
                            resCorrectas++;
                            dbAdapter.activarTema(idModul, 2, 4);
                        }
                        break;
                    default:
                        break;
                }
                break;
            case 2://Modulo 3
                switch (valoresResividos.getInt("posicionTemaS")) {
                    case 1://Arreglos
                        if (rbtRespuestaUno.isChecked()) {
                            resCorrectas++;
                            dbAdapter.activarTema(idModul, 3, 2);
                        } else if (rbtRespuestaDos.isChecked()) {vibrator.vibrate(1000);}
                        break;
                    case 3://Fecha y hora
                        if (rbtRespuestaUno.isChecked()) {vibrator.vibrate(1000);}
                        else if (rbtRespuestaDos.isChecked()) {
                            resCorrectas++;
                            dbAdapter.activarTema(idModul, 3, 4);
                        }
                        break;
                    default:
                        break;
                }
                break;
            case 3://Modulo 4
                switch (valoresResividos.getInt("posicionTemaS")) {
                    case 1://Iterators
                        if (rbtRespuestaDos.isChecked()) {vibrator.vibrate(1000);}
                        else if (rbtRespuestaUno.isChecked()) {
                            resCorrectas++;
                            dbAdapter.activarTema(idModul, 4, 2);
                        }
                        break;
                    case 3://Excepciones
                        if (rbtRespuestaDos.isChecked()) {vibrator.vibrate(1000);}
                        else if (rbtRespuestaUno.isChecked()) {
                            resCorrectas++;
                            dbAdapter.activarTema(idModul, 4, 4);
                        }
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
        if (resCorrectas>0){
            respuesta =getResources().getString(R.string.mensage_cuestionario_correcto);
        }
        Toast.makeText(CuestionarioRadioButtonActivity.this, respuesta, Toast.LENGTH_SHORT).show();
        finish();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        dbAdapter.close();
    }
}
