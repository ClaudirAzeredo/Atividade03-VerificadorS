package br.unipar.atividade03_verificadors

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Definindo a senha fixa
    private val senhaCorreta = "1234"

    // Declarando as Views
    private lateinit var editTextSenha: EditText
    private lateinit var buttonVerificar: Button
    private lateinit var textViewResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializando as Views
        editTextSenha = findViewById(R.id.editTextSenha)
        buttonVerificar = findViewById(R.id.buttonVerificar)
        textViewResultado = findViewById(R.id.textViewResultado)

        // Ação do botão "Verificar"
        buttonVerificar.setOnClickListener {
            val senhaInserida = editTextSenha.text.toString()

            // Verificando se a senha inserida é correta
            if (senhaInserida == senhaCorreta) {
                textViewResultado.text = "Senha correta!"
                textViewResultado.setTextColor(getColor(R.color.green)) // opcional: mudar a cor do texto
            } else {
                textViewResultado.text = "Senha incorreta!"
                textViewResultado.setTextColor(getColor(R.color.red)) // opcional: mudar a cor do texto
            }
        }
    }
}
