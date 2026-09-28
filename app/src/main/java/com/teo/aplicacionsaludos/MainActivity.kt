package com.teo.aplicacionsaludos

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Ajuste de márgenes para las barras del sistema (Edge to Edge)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // ==========================================
        // 1. VISTAS -> findViewById
        // ==========================================
        val etNombre: EditText = findViewById(R.id.etNombre)
        val btnSaludar: Button = findViewById(R.id.btnSaludar)
        val tvSaludo: TextView = findViewById(R.id.tvSaludo)
        val btnLimpiar: Button = findViewById(R.id.btnLimpiar)

        // ==========================================
        // 2. EVENTO -> Botón SALUDAR
        // ==========================================
        btnSaludar.setOnClickListener {
            val nombre = etNombre.text.toString().trim()

            if (nombre.isEmpty()) {
                // ACCIÓN 1: Si no se introduce nombre, mostrar Toast de aviso
                Toast.makeText(this, getString(R.string.toast_vacio), Toast.LENGTH_SHORT).show()
            } else {
                // ACCIÓN 2: Mostrar saludo personalizado en el TextView y Toast de bienvenida
                tvSaludo.text = getString(R.string.saludo_formato, nombre)
                Toast.makeText(this, getString(R.string.toast_bienvenida), Toast.LENGTH_SHORT).show()
            }
        }

        // ==========================================
        // 3. EVENTO -> Botón LIMPIAR
        // ==========================================
        btnLimpiar.setOnClickListener {
            // ACCIÓN 3: Limpiar el campo de texto y el saludo
            etNombre.text.clear()
            tvSaludo.text = ""
        }
    }
}