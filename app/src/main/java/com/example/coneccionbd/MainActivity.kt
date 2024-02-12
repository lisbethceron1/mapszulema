/*package com.example.coneccionbd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.example.coneccionbd.Modem.BdHelper
import com.example.coneccionbd.Modem.ManangerDb
import com.example.coneccionbd.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainBinding.inflate(LayoutInflater.from(this
        ))
        setContentView(binding.root)

        binding.btnInsertar.setOnClickListener { val code=binding.editTextCodigo.text.toString()

            val ciudad=binding.editTextCiudad.text.toString()

            val codep=binding.editTextCodep.text.toString()

            val manager = ManangerDb(this)
            manager.inserData(code.toInt(),ciudad,codep.toInt())
        }



        //val bdHelper = BdHelper(this)
        // val db = bdHelper.writableDatabase// abro mi bd en mode escritura
        //Toast.makeText(this, "base de datos creada", Toast.LENGTH_SHORT).show()
        //  db.close()//cierro la base de datos


    }
}*/

/*package com.example.coneccionbd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.example.coneccionbd.Modem.ManangerDb
import com.example.coneccionbd.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.btnInsertar.setOnClickListener {
            val code = binding.editTextCodigo.text.toString()
            val ciudad = binding.editTextCiudad.text.toString()
            val codep = binding.editTextCodep.text.toString()

            // Suponiendo que ManangerDb tiene una función insertData definida como se mostró arriba
            val manager = ManangerDb(this)
            manager.inserData(code.toInt(), ciudad, 0, 0, "", "")
        }
    }
}*/

package com.example.coneccionbd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.example.coneccionbd.Modem.ManangerDb
import com.example.coneccionbd.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.btnInsertar.setOnClickListener {
            // Aquí solo obtenemos el título y las coordenadas
            val titulo = "Título del marcador" // Reemplaza esto con el título real del marcador
            val latitud = 0.0 // Reemplaza esto con la latitud real del marcador
            val longitud = 0.0 // Reemplaza esto con la longitud real del marcador

            // Suponiendo que ManangerDb tiene una función insertData definida como se mostró arriba
            val manager = ManangerDb(this)
            manager.inserData(titulo, latitud, longitud)

            Toast.makeText(this, "Datos guardados con éxito", Toast.LENGTH_SHORT).show()
        }
    }
}