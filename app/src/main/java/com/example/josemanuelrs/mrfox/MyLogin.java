package com.example.josemanuelrs.mrfox;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by JoseManuelRS on 07/03/2017.
 */

public class MyLogin extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginactivity);
        Button entrar= (Button) findViewById(R.id.entrar);
        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MyLogin.this, "Éxito en la autenticación!!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MyLogin.this, MyMain.class);
                startActivity(intent);

            }
        });
    }
}
