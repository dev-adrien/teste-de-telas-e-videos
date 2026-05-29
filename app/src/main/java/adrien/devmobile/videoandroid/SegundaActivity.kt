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
import android.content.Intent
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.VideoView
import kotlin.math.pow

class SegundaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.segunda_activity)

        val btnReturn = findViewById<ImageButton>(R.id.btnVoltarSuperior)
        val btnReturnInferior = findViewById<Button>(R.id.btnVoltarInferior)

        val ivImg = findViewById<ImageView>(R.id.imgPerfilSobre)
        ivImg.setImageResource(R.drawable.foto_sobre)

        btnReturn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }

        btnReturnInferior.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }
    }
}