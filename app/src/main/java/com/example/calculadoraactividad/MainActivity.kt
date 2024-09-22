package com.example.calculadoraactividad

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() extends AppCompactActivity implements View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

            //Boton
           Button btn =  (Button) findViewById(@+id/button); //Busca vista

            //Listener para cuando le de click
            View.OnClickListener listener = new View.OnClickListener(){
                @override
                public void onClick(View v){
                    //Acciones de cuando de clic
                }
            };

            //Ejecuta el listener cuando se de el click
//           btn.setOnClickListener(listener);

            //Con mainActivity
            btn.setOnClickListener(this);


    }

        @Override
        public void onClick(view e){

        }
}