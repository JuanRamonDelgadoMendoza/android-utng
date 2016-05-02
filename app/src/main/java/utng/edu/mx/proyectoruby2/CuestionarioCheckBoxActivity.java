package utng.edu.mx.proyectoruby2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import utng.edu.mx.proyectoruby2.util.DBAdapter;

/**
 * Created by Juan Ramon Delgado Mendoza on 07/03/2016.
 * @author Juan Ramon Delgado Mendoza
 * @email mon-ra16@hotmail.com
 *
 */
public class CuestionarioCheckBoxActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView txvPreguntaCheckBox;
    private CheckBox chkCajaUno,chkCajaDos,chkCajaTres;
    private Bundle valoresResividos;
    private Button btnComprobarCheckBox;
    private DBAdapter dbAdapter;
    private Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cuestionario_check_box_layout);

        initComponents();
    }

    private void initComponents() {
        dbAdapter=new DBAdapter(this);
        dbAdapter.open();
        vibrator=(Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        txvPreguntaCheckBox=(TextView)findViewById(R.id.txv_pregunta_ckech_box);
        chkCajaUno=(CheckBox)findViewById(R.id.chk_caja_uno);
        chkCajaDos=(CheckBox)findViewById(R.id.chk_caja_dos);
        chkCajaTres=(CheckBox)findViewById(R.id.chk_caja_tres);
        btnComprobarCheckBox=(Button)findViewById(R.id.btn_comprobar_check_box);

        valoresResividos=getIntent().getExtras();

        switch (valoresResividos.getInt("moduloS")){
            case 0://Modulo 1
                switch (valoresResividos.getInt("posicionTemaS")){
                    case 0: //Sobre ruby
                        txvPreguntaCheckBox.setText(getResources().getString(R.string.cuestionario_check_box_pregunta_uno));
                        chkCajaUno.setText(getResources().getString(R.string.cuestionario_check_box_pregunta_uno_respuesta_a));
                        chkCajaDos.setText(getResources().getString(R.string.cuestionario_check_box_pregunta_uno_respuesta_b));
                        chkCajaTres.setText(getResources().getString(R.string.cuestionario_check_box_pregunta_uno_respuesta_c));
                        break;
                    case 4://Variables
                        txvPreguntaCheckBox.setText(getResources().getString(R.string.cuestionario_check_box_pregunta_dos));
                        chkCajaUno.setText(getResources().getString(R.string.cuestionario_check_box_pregunta_dos_respuesta_a));
                        chkCajaDos.setText(getResources().getString(R.string.cuestionario_check_box_pregunta_dos_respuesta_b));
                        chkCajaTres.setText(getResources().getString(R.string.cuestionario_check_box_pregunta_dos_respuesta_c));
                        break;
                    case 6://Comentarios
                        txvPreguntaCheckBox.setText(getResources().getString(R.string.cuestionario_check_box_pregunta_tres));
                        chkCajaUno.setText(getResources().getString(R.string.cuestionario_check_box_pregunta_tres_respuesta_a));
                        chkCajaDos.setText(getResources().getString(R.string.cuestionario_check_box_pregunta_tres_respuesta_b));
                        chkCajaTres.setText(getResources().getString(R.string.cuestionario_check_box_pregunta_tres_respuesta_c));
                        break;
                    default:
                        break;

                }
                break;
            case 1://Modulo 2
                switch (valoresResividos.getInt("posicionTemaS")) {
                    case 0://Ciclos
                        txvPreguntaCheckBox.setText(getResources().getString(R.string.cuestionario_check_box_pregunta_cuatro));
                        chkCajaUno.setText(getResources().getString(R.string.cuestionario_check_box_pregunta_cuatro_respuesta_a));
                        chkCajaDos.setText(getResources().getString(R.string.cuestionario_check_box_pregunta_cuatro_respuesta_b));
                        chkCajaTres.setText(getResources().getString(R.string.cuestionario_check_box_pregunta_cuatro_respuesta_c));
                        break;
                    case 4://Mixins
                        txvPreguntaCheckBox.setText(getResources().getString(R.string.cuestionario_check_box_pregunta_cinco));
                        chkCajaUno.setText(getResources().getString(R.string.cuestionario_check_box_pregunta_cinco_respuesta_a));
                        chkCajaDos.setText(getResources().getString(R.string.cuestionario_check_box_pregunta_cinco_respuesta_b));
                        chkCajaTres.setText(getResources().getString(R.string.cuestionario_check_box_pregunta_cinco_respuesta_c));
                        break;
                    default:
                        break;
                }
                break;
            case 2://Modulo 3
                switch (valoresResividos.getInt("posicionTemaS")) {
                    case 0://Strings
                        txvPreguntaCheckBox.setText(getResources().getString(R.string.cuestionario_check_box_pregunta_seis));
                        chkCajaUno.setText(getResources().getString(R.string.cuestionario_check_box_pregunta_seis_respuesta_a));
                        chkCajaDos.setText(getResources().getString(R.string.cuestionario_check_box_pregunta_seis_respuesta_b));
                        chkCajaTres.setText(getResources().getString(R.string.cuestionario_check_box_pregunta_seis_respuesta_c));
                        break;
                    default:
                        break;
                }
                break;
            case 3://Modulo 4
                switch (valoresResividos.getInt("posicionTemaS")) {
                    case 0://Rangos
                        txvPreguntaCheckBox.setText(getResources().getString(R.string.cuestionario_check_box_pregunta_siete));
                        chkCajaUno.setText(getResources().getString(R.string.cuestionario_check_box_pregunta_siete_respuesta_a));
                        chkCajaDos.setText(getResources().getString(R.string.cuestionario_check_box_pregunta_siete_respuesta_b));
                        chkCajaTres.setText(getResources().getString(R.string.cuestionario_check_box_pregunta_siete_respuesta_c));
                        break;
                    case 4://Orientado a objetos
                        txvPreguntaCheckBox.setText(getResources().getString(R.string.cuestionario_check_box_pregunta_ocho));
                        chkCajaUno.setText(getResources().getString(R.string.cuestionario_check_box_pregunta_ocho_respuesta_a));
                        chkCajaDos.setText(getResources().getString(R.string.cuestionario_check_box_pregunta_ocho_respuesta_b));
                        chkCajaTres.setText(getResources().getString(R.string.cuestionario_check_box_pregunta_ocho_respuesta_c));
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }

        btnComprobarCheckBox.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String respuesta = getResources().getString(R.string.mensage_cuestionario_incorrecto_out_logeo);
        if (valoresResividos.getBoolean("logeo")){
            ///////////////////////////////////////////////////////////////////////////////////////////
            int idModul = dbAdapter.idPrimerModuloIns(FormLoginActivity.ID_USU_LOGEADO, "Modulo 1");
            int respCorrecta=0;

            switch (valoresResividos.getInt("moduloS")){
                case 0://Modulo 1
                    switch (valoresResividos.getInt("posicionTemaS")){
                        case 0: //Sobre ruby
                            if (chkCajaUno.isChecked()&&chkCajaTres.isChecked()){
                                respCorrecta++;
                                dbAdapter.activarTema(idModul, 1, 1);
                            }else {vibrator.vibrate(1000);}
                            break;
                        case 4://Variables
                            if (chkCajaUno.isChecked()&&chkCajaDos.isChecked()){
                                respCorrecta++;
                                dbAdapter.activarTema(idModul, 1, 5);
                            }else {vibrator.vibrate(1000);}
                            break;
                        case 6://Comentarios
                            if (chkCajaDos.isChecked()){
                                respCorrecta++;
                                dbAdapter.activarTema(idModul, 1, 7);
                            }else {vibrator.vibrate(1000);}
                            break;
                        default:
                            break;
                    }
                    break;
                case 1://Modulo 2
                    switch (valoresResividos.getInt("posicionTemaS")) {
                        case 0://Ciclos
                            ///////////////////////////////////////
                            if (chkCajaUno.isChecked()&&chkCajaTres.isChecked()&&chkCajaDos.isChecked()){
                                respCorrecta++;
                                dbAdapter.activarTema(idModul, 2, 1);
                            }else {vibrator.vibrate(1000);}
                            ///////////////////////////////////////
                            break;
                        case 4://Mixins
                            if (chkCajaDos.isChecked()){
                                respCorrecta++;
                                dbAdapter.activarTema(idModul, 2, 5);
                            }else {vibrator.vibrate(1000);}
                            ///////////////////////////////////////
                            break;
                        default:
                            break;
                    }
                    break;
                case 2://Modulo 3
                    switch (valoresResividos.getInt("posicionTemaS")) {
                        case 0://Strings
                            if (chkCajaUno.isChecked()||chkCajaTres.isChecked()){
                                respCorrecta++;
                                dbAdapter.activarTema(idModul, 3, 1);
                            }else {vibrator.vibrate(1000);}
                            break;
                        default:
                            break;
                    }
                    break;
                case 3://Modulo 4
                    switch (valoresResividos.getInt("posicionTemaS")) {
                        case 0://Rangos
                            if (chkCajaUno.isChecked()||chkCajaDos.isChecked()||chkCajaTres.isChecked()){
                                respCorrecta++;
                                dbAdapter.activarTema(idModul, 4, 1);
                            }else {vibrator.vibrate(1000);}
                            break;
                        case 4://Orientado a objetos
                            if (chkCajaUno.isChecked()||chkCajaDos.isChecked()||chkCajaTres.isChecked()){
                                respCorrecta++;
                                dbAdapter.activarTema(idModul, 4, 5);
                            }else {vibrator.vibrate(1000);}
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    break;
            }
            if (respCorrecta>0){
                respuesta =getResources().getString(R.string.mensage_cuestionario_correcto);
            }
            Toast.makeText(this, respuesta, Toast.LENGTH_SHORT).show();
            limpiar();
            finish();
            ///////////////////////////////////////////////////////////////////////////////////////////
        }else {
            ///////////////////////////////////////////////////////////////////////////////////////
            if (chkCajaUno.isChecked()&&chkCajaTres.isChecked()){
                    respuesta =getResources().getString(R.string.mensage_cuestionario_correcto_out_logeo);
                    startActivity(new Intent(CuestionarioCheckBoxActivity.this,TerminoTemaOffActivity.class));
                    finish();
            }else {
                vibrator.vibrate(1000);
            }
            Toast.makeText(this, respuesta, Toast.LENGTH_SHORT).show();
            limpiar();
            finish();
            ///////////////////////////////////////////////////////////////////////////////////////
        }
    }

    private void limpiar(){
        chkCajaUno.setChecked(false);
        chkCajaDos.setChecked(false);
        chkCajaTres.setChecked(false);
    }

    @Override
    protected void onPause() {
        super.onPause();
        limpiar();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        dbAdapter.close();
    }
}