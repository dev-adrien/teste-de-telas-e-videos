package adrien.devmobile.videoandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import adrien.devmobile.videoandroid.ui.theme.VideoandroidTheme
import android.annotation.SuppressLint
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.VideoView

class MainActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val videoView = findViewById<VideoView>(R.id.videoView)
        val btnPlay = findViewById<Button>(R.id.btnPlay)
        val btnPause = findViewById<Button>(R.id.btnPause)
        val btnTela2 = findViewById<Button>(R.id.btnTela2)
        val btnBuscar = findViewById<Button>(R.id.btnBuscarVideo)
        val tvVideoSelecionado = findViewById<TextView>(R.id.tvVideoSelecionado)
        val etPesquisa = findViewById<EditText>(R.id.etBuscaVideo)



        btnPlay.setOnClickListener {
            videoView.start()
        }

        btnPause.setOnClickListener {
            videoView.pause()
        }

        btnTela2.setOnClickListener {
            val intent = Intent(this, SegundaActivity::class.java)

            startActivity(intent)
        }

        btnBuscar.setOnClickListener {
            try {
                val txtPesquisa = etPesquisa.text.toString().lowercase()
                if (txtPesquisa == "tecnologia") {
                    videoView.setVideoPath("android.resource://$packageName/${R.raw.tecnologia}")
                    tvVideoSelecionado.text = " Tecnologia"
                } else if (txtPesquisa == "animais") {
                    videoView.setVideoPath("android.resource://$packageName/${R.raw.animais}")
                    tvVideoSelecionado.text = " Animais"
                } else if (txtPesquisa == "cozinha") {
                    videoView.setVideoPath("android.resource://$packageName/${R.raw.cozinha}")
                    tvVideoSelecionado.text = " Cozinha"
                }
            } catch (e: NullPointerException) {
                tvVideoSelecionado.text = "Pesquise um vídeo para que ele possa aparecer acima!"
            }

        }

    }
}