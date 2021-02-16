package mx.edu.itons.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var peso: Double=0.00;
    var estatura: Double=0.00;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**
         *

        val estatura : EditText = findViewById(R.id.idEestatura) as EditText
        val peso : EditText = findViewById(R.id.idAltura) as EditText

        val btnOp: Button = findViewById(R.id.btnOperacion) as Button
        */
        //btnOp.setOnClickListener(View.OnClickListener { calcularIMC(estatura,peso) })


        this.btnOperacion.setOnClickListener(){
            idResultado.setText((calcularIMC().toString()))
        }





    }


    fun calcularIMC(): Double {
        estatura=(this.idEestatura.text.toString().toDouble())
        peso=(this.idPeso.text.toString().toDouble())

        var imc = peso / (estatura * estatura)  ;

        /**
         * if (imc < 18.5) {

        } else if (imc > 18.6 || imc < 24.9) {

        } else if (imc > 25 || imc < 29.9) {

        } else if (imc > 30) {





        }
         *
         */


        return imc
    }

}

