package me.camilo.maquetacionbasica

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.camilo.maquetacionbasica.ui.theme.MaquetacionBasicaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Primero()
            Segundo()




        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun Primero() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .shadow(
                    elevation = 8.dp,
                    shape = RoundedCornerShape(16.dp)
                )
                .clip(RoundedCornerShape(16.dp))
                .background(Color.White)
                .padding(16.dp)
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.pc_numero_uno),
                    contentDescription = "PC",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(250.dp)
                )

                Image(
                    painter = painterResource(id = R.drawable.corazon),
                    contentDescription = "Favorito",
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(16.dp)
                        .size(28.dp)
                )
            }

            Text(
                text = "Pc para oficina",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "$99.99",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Green
            )

            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                thickness = 2.dp,
                color = Color.LightGray
            )

            Text(
                text = "Descripción del producto con detalles importantes, características y beneficios."
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Button(
                onClick = { },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF6A4FB3)
                ),
                shape = RoundedCornerShape(50)
            ) {
                Text("Editar")
            }

            Spacer(modifier = Modifier.width(16.dp))

            Button(
                onClick = { },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red
                ),
                shape = RoundedCornerShape(50)
            ) {
                Text("Eliminar")
            }
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun Segundo() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.cicla),
            contentDescription = "Perfil",
            modifier = Modifier
                .size(120.dp)
                .clip(RoundedCornerShape(100.dp))
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Juan Pérez",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Desarrollador Android apasionado por la tecnología y el diseño.",
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("150", fontWeight = FontWeight.Bold)
                Text("Posts", color = Color.Gray)
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("2.3K", fontWeight = FontWeight.Bold)
                Text("Seguidores", color = Color.Gray)
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("980", fontWeight = FontWeight.Bold)
                Text("Likes", color = Color.Gray)
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(RoundedCornerShape(50))
                    .background(Color(0xFF6A4FB3))
                    .padding(vertical = 12.dp),
                contentAlignment = Alignment.Center
            ) {
                Text("Seguir", color = Color.White)
            }

            Spacer(modifier = Modifier.width(16.dp))

            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(RoundedCornerShape(50))
                    .background(Color.White)
                    .border(
                        width = 1.dp,
                        color = Color.Gray,
                        shape = RoundedCornerShape(50)
                    )
                    .padding(vertical = 12.dp),
                contentAlignment = Alignment.Center
            ) {
                Text("Mensaje", color = Color(0xFF6A4FB3))
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Intereses",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            modifier = Modifier.align(Alignment.Start)
        )

        Spacer(modifier = Modifier.height(12.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(50))
                    .background(Color.LightGray)
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                Text("Ciclismo")
            }

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(50))
                    .background(Color.LightGray)
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                Text("Programación")
            }

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(50))
                    .background(Color.LightGray)
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                Text("UI/UX")
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(50))
                    .background(Color.LightGray)
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                Text("Música")
            }

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(50))
                    .background(Color.LightGray)
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                Text("Viajes")
            }

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(50))
                    .background(Color.LightGray)
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                Text("Gaming")
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Proyectos Recientes",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            modifier = Modifier.align(Alignment.Start)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFBDBDBD))
        ) {

            Image(
                painter = painterResource(id = R.drawable.cicla),
                contentDescription = "Proyecto",
                modifier = Modifier.size(120.dp)
            )

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(16.dp)
            ) {

                Text(
                    text = "App de Ciclismo",
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Aplicación para rastrear rutas de ciclismo con mapas y estadísticas."
                )

                Spacer(modifier = Modifier.height(12.dp))

                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(50))
                        .background(Color(0xFF6A4FB3))
                        .padding(horizontal = 20.dp, vertical = 8.dp)
                ) {
                    Text("Ver más", color = Color.White)
                }
            }
        }
    }
}




