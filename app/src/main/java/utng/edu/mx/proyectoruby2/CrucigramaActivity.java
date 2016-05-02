package utng.edu.mx.proyectoruby2;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Juan Ramon Delgado Mendoza on 07/03/2016.
 * @author Juan Ramon Delgado Mendoza
 * @email mon-ra16@hotmail.com
 *
 */
public class CrucigramaActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnComprobarJuego;
    private EditText edtA1P1,edtA1P2,edtA1P3,edtA1P4,edtA1P5,edtA1P6,edtA1P7,edtA1P8,edtA1P9,edtA1P10,edtA1P11;
    private EditText edtA2P1,edtA2P2,edtA2P3,edtA2P4,edtA2P5,edtA2P6,edtA2P7;
    private EditText edtA3P1,edtA3P2,edtA3P3;
    private EditText edtA4P1,edtA4P2,edtA4P3;
    private EditText edtA5P1,edtA5P2,edtA5P3,edtA5P4,edtA5P5;
    private EditText edtA6P1,edtA6P2;
    private EditText edtA7P1,edtA7P2,edtA7P3,edtA7P4,edtA7P5,edtA7P6,edtA7P7,edtA7P8;
    private EditText edtA8P1,edtA8P2;
    private EditText edtA9P1,edtA9P2,edtA9P3,edtA9P4,edtA9P5,edtA9P6,edtA9P7,edtA9P8,edtA9P9,edtA9P10,edtA9P11;
    private EditText edtA10P1,edtA10P2;
    private EditText edtA11P1,edtA11P2,edtA11P3,edtA11P4,edtA11P5;
    private EditText edtA12P1,edtA12P2;
    private EditText edtA13P1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crucigrama_layout);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        initComponents();
    }
    private void initComponents() {
        btnComprobarJuego=(Button)findViewById(R.id.btn_comprobar_juego);
        //Fila 1
        edtA1P1 =(EditText) findViewById(R.id.a1_1);
        edtA1P2 =(EditText) findViewById(R.id.a1_2);
        edtA1P3 =(EditText) findViewById(R.id.a1_3);
        edtA1P4 =(EditText) findViewById(R.id.a1_4);
        edtA1P5 =(EditText) findViewById(R.id.a1_5);
        edtA1P6 =(EditText) findViewById(R.id.a1_6);
        edtA1P7 =(EditText) findViewById(R.id.a1_7);
        edtA1P8 =(EditText) findViewById(R.id.a1_8);
        edtA1P9 =(EditText) findViewById(R.id.a1_9);
        edtA1P10 =(EditText) findViewById(R.id.a1_10);
        edtA1P11 =(EditText) findViewById(R.id.a1_11);
        //Fila 2
        edtA2P1 =(EditText) findViewById(R.id.a2_1);
        edtA2P2 =(EditText) findViewById(R.id.a2_2);
        edtA2P3 =(EditText) findViewById(R.id.a2_3);
        edtA2P4 =(EditText) findViewById(R.id.a2_4);
        edtA2P5 =(EditText) findViewById(R.id.a2_5);
        edtA2P6 =(EditText) findViewById(R.id.a2_6);
        edtA2P7 =(EditText) findViewById(R.id.a2_7);
        //Fila 3
        edtA3P1 =(EditText) findViewById(R.id.a3_1);
        edtA3P2 =(EditText) findViewById(R.id.a3_2);
        edtA3P3 =(EditText) findViewById(R.id.a3_3);
        //Fila 4
        edtA4P1 =(EditText) findViewById(R.id.a4_1);
        edtA4P2 =(EditText) findViewById(R.id.a4_2);
        edtA4P3 =(EditText) findViewById(R.id.a4_3);
        //Fila 5
        edtA5P1 =(EditText) findViewById(R.id.a5_1);
        edtA5P2 =(EditText) findViewById(R.id.a5_2);
        edtA5P3 =(EditText) findViewById(R.id.a5_3);
        edtA5P4 =(EditText) findViewById(R.id.a5_4);
        edtA5P5 =(EditText) findViewById(R.id.a5_5);
        //Fila 6
        edtA6P1 =(EditText) findViewById(R.id.a6_1);
        edtA6P2 =(EditText) findViewById(R.id.a6_2);
        //Fila 7
        edtA7P1 =(EditText) findViewById(R.id.a7_1);
        edtA7P2 =(EditText) findViewById(R.id.a7_2);
        edtA7P3 =(EditText) findViewById(R.id.a7_3);
        edtA7P4 =(EditText) findViewById(R.id.a7_4);
        edtA7P5 =(EditText) findViewById(R.id.a7_5);
        edtA7P6 =(EditText) findViewById(R.id.a7_6);
        edtA7P7 =(EditText) findViewById(R.id.a7_7);
        edtA7P8 =(EditText) findViewById(R.id.a7_8);
        //Fila 8
        edtA8P1 =(EditText) findViewById(R.id.a8_1);
        edtA8P2 =(EditText) findViewById(R.id.a8_2);
        //Fila 9
        edtA9P1 =(EditText) findViewById(R.id.a9_1);
        edtA9P2 =(EditText) findViewById(R.id.a9_2);
        edtA9P3 =(EditText) findViewById(R.id.a9_3);
        edtA9P4 =(EditText) findViewById(R.id.a9_4);
        edtA9P5 =(EditText) findViewById(R.id.a9_5);
        edtA9P6 =(EditText) findViewById(R.id.a9_6);
        edtA9P7 =(EditText) findViewById(R.id.a9_7);
        edtA9P8 =(EditText) findViewById(R.id.a9_8);
        edtA9P9 =(EditText) findViewById(R.id.a9_9);
        edtA9P10 =(EditText) findViewById(R.id.a9_10);
        edtA9P11 =(EditText) findViewById(R.id.a9_11);
        //Fila 10
        edtA10P1 =(EditText) findViewById(R.id.a10_1);
        edtA10P2 =(EditText) findViewById(R.id.a10_2);
        //Fila 11
        edtA11P1 =(EditText) findViewById(R.id.a11_1);
        edtA11P2 =(EditText) findViewById(R.id.a11_2);
        edtA11P3 =(EditText) findViewById(R.id.a11_3);
        edtA11P4 =(EditText) findViewById(R.id.a11_4);
        edtA11P5 =(EditText) findViewById(R.id.a11_5);
        //Fila 12
        edtA12P1 =(EditText) findViewById(R.id.a12_1);
        edtA12P2 =(EditText) findViewById(R.id.a12_2);
        //Fila 13
        edtA13P1 =(EditText) findViewById(R.id.a13_1);


        btnComprobarJuego.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int numErr=0;
        int camposVacios=0;
        //------------------------------------------------------------------------------------------Fila 1
        //A1_1
        if (edtA1P1.getText().toString().toLowerCase().equals("c")){
            edtA1P1.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA1P1.length()==0) {
            edtA1P1.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA1P1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A1_2
        if (edtA1P2.getText().toString().toLowerCase().equals("o")){
            edtA1P2.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA1P2.length()==0) {
            edtA1P2.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA1P2.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A1_3
        if (edtA1P3.getText().toString().toLowerCase().equals("m")){
            edtA1P3.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA1P3.length()==0) {
            edtA1P3.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA1P3.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A1_4
        if (edtA1P4.getText().toString().toLowerCase().equals("e")){
            edtA1P4.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA1P4.length()==0) {
            edtA1P4.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA1P4.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A1_5
        if (edtA1P5.getText().toString().toLowerCase().equals("n")){
            edtA1P5.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA1P5.length()==0) {
            edtA1P5.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA1P5.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A1_6
        if (edtA1P6.getText().toString().toLowerCase().equals("t")){
            edtA1P6.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA1P6.length()==0) {
            edtA1P6.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA1P6.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A1_7
        if (edtA1P7.getText().toString().toLowerCase().equals("a")){
            edtA1P7.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA1P7.length()==0) {
            edtA1P7.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA1P7.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A1_8
        if (edtA1P8.getText().toString().toLowerCase().equals("r")){
            edtA1P8.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA1P8.length()==0) {
            edtA1P8.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA1P8.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A1_9
        if (edtA1P9.getText().toString().toLowerCase().equals("i")){
            edtA1P9.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA1P9.length()==0) {
            edtA1P9.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA1P9.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A1_10
        if (edtA1P10.getText().toString().toLowerCase().equals("o")){
            edtA1P10.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA1P10.length()==0) {
            edtA1P10.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA1P10.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A1_11
        if (edtA1P11.getText().toString().toLowerCase().equals("s")){
            edtA1P11.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA1P11.length()==0) {
            edtA1P11.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA1P11.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //------------------------------------------------------------------------------------------Fila 2
        //A2_1
        if (edtA2P1.getText().toString().toLowerCase().equals("r")){
            edtA2P1.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA2P1.length()==0) {
            edtA2P1.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA2P1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A2_2
        if (edtA2P2.getText().toString().toLowerCase().equals("r")){
            edtA2P2.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA2P2.length()==0) {
            edtA2P2.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA2P2.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A2_3
        if (edtA2P3.getText().toString().toLowerCase().equals("e")){
            edtA2P3.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA2P3.length()==0) {
            edtA2P3.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA2P3.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A2_4
        if (edtA2P4.getText().toString().toLowerCase().equals("t")){
            edtA2P4.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA2P4.length()==0) {
            edtA2P4.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA2P4.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A2_5
        if (edtA2P5.getText().toString().toLowerCase().equals("u")){
            edtA2P5.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA2P5.length()==0) {
            edtA2P5.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA2P5.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A2_6
        if (edtA2P6.getText().toString().toLowerCase().equals("r")){
            edtA2P6.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA2P6.length()==0) {
            edtA2P6.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA2P6.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A2_7
        if (edtA2P7.getText().toString().toLowerCase().equals("n")){
            edtA2P7.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA2P7.length()==0) {
            edtA2P7.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA2P7.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //------------------------------------------------------------------------------------------Fila 3
        //A3_1
        if (edtA3P1.getText().toString().toLowerCase().equals("n")){
            edtA3P1.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA3P1.length()==0) {
            edtA3P1.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA3P1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A3_2
        if (edtA3P2.getText().toString().toLowerCase().equals("i")){
            edtA3P2.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA3P2.length()==0) {
            edtA3P2.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA3P2.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A3_3
        if (edtA3P3.getText().toString().toLowerCase().equals("l")){
            edtA3P3.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA3P3.length()==0) {
            edtA3P3.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA3P3.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //------------------------------------------------------------------------------------------Fila 4
        //A4_1
        if (edtA4P1.getText().toString().toLowerCase().equals("a")){
            edtA4P1.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA4P1.length()==0) {
            edtA4P1.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA4P1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A4_2
        if (edtA4P2.getText().toString().toLowerCase().equals("n")){
            edtA4P2.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA4P2.length()==0) {
            edtA4P2.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA4P2.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A4_3
        if (edtA4P3.getText().toString().toLowerCase().equals("d")){
            edtA4P3.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA4P3.length()==0) {
            edtA4P3.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA4P3.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //------------------------------------------------------------------------------------------Fila 5
        //A5_1
        if (edtA5P1.getText().toString().toLowerCase().equals("c")){
            edtA5P1.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA5P1.length()==0) {
            edtA5P1.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA5P1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A5_2
        if (edtA5P2.getText().toString().toLowerCase().equals("l")){
            edtA5P2.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA5P2.length()==0) {
            edtA5P2.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA5P2.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A5_3
        if (edtA5P3.getText().toString().toLowerCase().equals("a")){
            edtA5P3.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA5P3.length()==0) {
            edtA5P3.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA5P3.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A5_4
        if (edtA5P4.getText().toString().toLowerCase().equals("s")){
            edtA5P4.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA5P4.length()==0) {
            edtA5P4.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA5P4.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A5_5
        if (edtA5P5.getText().toString().toLowerCase().equals("s")){
            edtA5P5.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA5P5.length()==0) {
            edtA5P5.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA5P5.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //------------------------------------------------------------------------------------------Fila 6
        //A6_1
        if (edtA6P1.getText().toString().toLowerCase().equals("i")){
            edtA6P1.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA6P1.length()==0) {
            edtA6P1.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA6P1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A6_2
        if (edtA6P2.getText().toString().toLowerCase().equals("c")){
            edtA6P2.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA6P2.length()==0) {
            edtA6P2.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA6P2.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //------------------------------------------------------------------------------------------Fila 7
        //A7_1
        if (edtA7P1.getText().toString().toLowerCase().equals("l")){
            edtA7P1.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA7P1.length()==0) {
            edtA7P1.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA7P1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A7_2
        if (edtA7P2.getText().toString().toLowerCase().equals("o")){
            edtA7P2.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA7P2.length()==0) {
            edtA7P2.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA7P2.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A7_3
        if (edtA7P3.getText().toString().toLowerCase().equals("g")){
            edtA7P3.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA7P3.length()==0) {
            edtA7P3.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA7P3.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A7_4
        if (edtA7P4.getText().toString().toLowerCase().equals("i")){
            edtA7P4.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA7P4.length()==0) {
            edtA7P4.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA7P4.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A7_5
        if (edtA7P5.getText().toString().toLowerCase().equals("c")){
            edtA7P5.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA7P5.length()==0) {
            edtA7P5.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA7P5.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A7_6
        if (edtA7P6.getText().toString().toLowerCase().equals("o")){
            edtA7P6.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA7P6.length()==0) {
            edtA7P6.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA7P6.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A7_7
        if (edtA7P7.getText().toString().toLowerCase().equals("s")){
            edtA7P7.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA7P7.length()==0) {
            edtA7P7.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA7P7.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A7_8
        if (edtA7P8.getText().toString().toLowerCase().equals("o")){
            edtA7P8.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA7P8.length()==0) {
            edtA7P8.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA7P8.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //------------------------------------------------------------------------------------------Fila 8
        //A8_1
        if (edtA8P1.getText().toString().toLowerCase().equals("n")){
            edtA8P1.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA8P1.length()==0) {
            edtA8P1.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA8P1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A8_2
        if (edtA8P2.getText().toString().toLowerCase().equals("m")){
            edtA8P2.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA8P2.length()==0) {
            edtA8P2.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA8P2.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //------------------------------------------------------------------------------------------Fila 9
        //A9_1
        if (edtA9P1.getText().toString().toLowerCase().equals("a")){
            edtA9P1.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA9P1.length()==0) {
            edtA9P1.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA9P1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A9_2
        if (edtA9P2.getText().toString().toLowerCase().equals("r")){
            edtA9P2.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA9P2.length()==0) {
            edtA9P2.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA9P2.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A9_3
        if (edtA9P3.getText().toString().toLowerCase().equals("i")){
            edtA9P3.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA9P3.length()==0) {
            edtA9P3.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA9P3.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A9_4
        if (edtA9P4.getText().toString().toLowerCase().equals("t")){
            edtA9P4.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA9P4.length()==0) {
            edtA9P4.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA9P4.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A9_5
        if (edtA9P5.getText().toString().toLowerCase().equals("m")){
            edtA9P5.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA9P5.length()==0) {
            edtA9P5.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA9P5.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A9_6
        if (edtA9P6.getText().toString().toLowerCase().equals("é")){
            edtA9P6.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA9P6.length()==0) {
            edtA9P6.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA9P6.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A9_7
        if (edtA9P7.getText().toString().toLowerCase().equals("t")){
            edtA9P7.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA9P7.length()==0) {
            edtA9P7.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA9P7.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A9_8
        if (edtA9P8.getText().toString().toLowerCase().equals("i")){
            edtA9P8.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA9P8.length()==0) {
            edtA9P8.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA9P8.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A9_9
        if (edtA9P9.getText().toString().toLowerCase().equals("c")){
            edtA9P9.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA9P9.length()==0) {
            edtA9P9.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA9P9.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A9_10
        if (edtA9P10.getText().toString().toLowerCase().equals("o")){
            edtA9P10.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA9P10.length()==0) {
            edtA9P10.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA9P10.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A9_11
        if (edtA9P11.getText().toString().toLowerCase().equals("s")){
            edtA9P11.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA9P11.length()==0) {
            edtA9P11.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA9P11.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //------------------------------------------------------------------------------------------Fila 10
        //A10_1
        if (edtA10P1.getText().toString().toLowerCase().equals("l")){
            edtA10P1.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA10P1.length()==0) {
            edtA10P1.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA10P1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A10_2
        if (edtA10P2.getText().toString().toLowerCase().equals("l")){
            edtA10P2.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA10P2.length()==0) {
            edtA10P2.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA10P2.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //------------------------------------------------------------------------------------------Fila 11
        //A11_1
        if (edtA11P1.getText().toString().toLowerCase().equals("n")){
            edtA11P1.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA11P1.length()==0) {
            edtA11P1.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA11P1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A11_2
        if (edtA11P2.getText().toString().toLowerCase().equals("e")){
            edtA11P2.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA11P2.length()==0) {
            edtA11P2.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA11P2.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A11_3
        if (edtA11P3.getText().toString().toLowerCase().equals("x")){
            edtA11P3.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA11P3.length()==0) {
            edtA11P3.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA11P3.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A11_4
        if (edtA11P4.getText().toString().toLowerCase().equals("t")){
            edtA11P4.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA11P4.length()==0) {
            edtA11P4.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA11P4.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A11_5
        if (edtA11P5.getText().toString().toLowerCase().equals("l")){
            edtA11P5.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA11P5.length()==0) {
            edtA11P5.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA11P5.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //------------------------------------------------------------------------------------------Fila 12
        //A12_1
        if (edtA12P1.getText().toString().toLowerCase().equals("s")){
            edtA12P1.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA12P1.length()==0) {
            edtA12P1.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA12P1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //A12_2
        if (edtA12P2.getText().toString().toLowerCase().equals("a")){
            edtA12P2.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA12P2.length()==0) {
            edtA12P2.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA12P2.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }
        //------------------------------------------------------------------------------------------Fila 12
        //A13_1
        if (edtA13P1.getText().toString().toLowerCase().equals("s")){
            edtA13P1.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(edtA13P1.length()==0) {
            edtA13P1.setBackgroundColor(getResources().getColor(R.color.blanco));
            numErr++;
            camposVacios++;
        }else {
            edtA13P1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            numErr++;
        }










        //------------------------------------------------------------------------------------------Resultado
        if (camposVacios>0){
            Toast.makeText(CrucigramaActivity.this, "Necesita terminarlo para comprobarlo", Toast.LENGTH_SHORT).show();
        }else  if (numErr==0){
            Toast.makeText(CrucigramaActivity.this, "Ganaste", Toast.LENGTH_SHORT).show();
        }
    }
}
