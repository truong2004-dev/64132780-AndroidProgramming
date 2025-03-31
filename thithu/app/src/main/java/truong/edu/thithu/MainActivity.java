package truong.edu.thithu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnCau1, btnCau2, btnCau3, btnCau4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCau1 = findViewById(R.id.btnCau1);
        btnCau2 = findViewById(R.id.btnCau2);
        btnCau3 = findViewById(R.id.btnCau3);
        btnCau4 = findViewById(R.id.btnCau4);

        btnCau1.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Cau1Activity.class)));
        btnCau2.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Cau2Activity.class)));
        btnCau3.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Cau3Activity.class)));
        btnCau4.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Cau4Activity.class)));
    }
}
