package com.example.nomesdasonia

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var nome: TextView
    lateinit var foto: ImageView
    val nomes = arrayOf("Marisa", "Marisete", "Tonia", "Antonia", "Méuri", "Cleide", "Jane",
        "Carcumida", "Lindilaura", "Zete", "Nete", "Francineide", "Barriga", "Barriguda",
        "Florzinha da primavera", "Marineide", "Antonele", "Jussara", "Francinete"
    )
    val fotos = arrayOf(R.drawable.sonia1, R.drawable.sonia2, R.drawable.sonia3, R.drawable.sonia4,
        R.drawable.sonia5, R.drawable.sonia6, R.drawable.sonia7, R.drawable.sonia8,
        R.drawable.sonia9

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nome = findViewById<TextView>(R.id.nome)
        foto = findViewById<ImageView>(R.id.sonia)



    }

    fun gerarNome(view: View){

        val totalItensArray = nomes.size
        val numeroAleatorio = Random.nextInt(totalItensArray)
        nome.setText(nomes[numeroAleatorio])
        nome.setTextSize(32F)
        val totalItensArray2 = fotos.size
        val numeroAleatorio2 = Random.nextInt(totalItensArray2)
        foto.setImageResource(fotos[numeroAleatorio2])



    }
}