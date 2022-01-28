package com.example.quegeneracioneres

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.quegeneracioneres.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

      /*  val edadEdit = findViewById<EditText>(R.id.edad_edit)
        val resultText = findViewById<TextView>(R.id.result_text)
        val button = findViewById<Button>(R.id.btn_calcular)
        */



        /*    Log.v("MainActivity", "Activity log")
        Log.d("MainActivity", "Activity log")
        Log.i("MainActivity", "Activity log")
        Log.w("MainActivity", "Activity log")
        Log.e("MainActivity", "Activity log")
      */
        binding.btnCalcular.setOnClickListener {
            val ageString = binding.edadEdit.text.toString()
            if (ageString.isNotEmpty()) {
                val ageInt = ageString.toInt()

                when (ageInt) {
                    in 5..25 -> binding.resultText.text = getString(R.string.GenZ)
                    in 26..40 -> binding.resultText.text = "Perteneces a la generación: Millennial"
                    in 41..55 -> binding.resultText.text = "Perteneces a la generación: Gen X"
                    in 56..75 -> binding.resultText.text = "Perteneces a la generación: Baby Boomers"
                    in 76..100 -> binding.resultText.text = "Perteneces a la generación: Silent Gen"
                    else -> { // Note the block
                        binding.resultText.text = "Ingresa una edad valida"
                    }
                }
            } else { // isNotEmpty
                Toast.makeText(this,"Debes insertar una edad",Toast.LENGTH_LONG).show()
                Log.d("MainActivity", "el campo edad esta vacio")
            }
        }
    }
}