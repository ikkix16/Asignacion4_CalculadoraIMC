package mx.edu.itons.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val estatura : EditText = findViewById(R.id.idEestatura) as EditText
        val peso : EditText = findViewById(R.id.idAltura) as EditText

        val btnOp: Button = findViewById(R.id.btnOperacion) as Button

        //btnOp.setOnClickListener(View.OnClickListener { calcularIMC(estatura,peso) })





    }


    fun calcularIMC(estatura: Int, peso: Int): Int {

        var imc = estatura / (peso * peso);


        if (imc < 18.5) {

        } else if (imc > 18.6 || imc < 24.9) {

        } else if (imc > 25 || imc < 29.9) {

        } else if (imc > 30) {





        }

        return imc
    }

}

