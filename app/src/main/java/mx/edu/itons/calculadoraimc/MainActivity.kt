package mx.edu.itons.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


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