package truong.edu.ex2_linearlayout;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
    }
    public void XuLyCong(View view){
      EditText editTextSoA  = findViewById(R.id.edta);
      EditText editTextSoB  = findViewById(R.id.edtb);
      EditText editTextKetQua = findViewById(R.id.edtKQ);

        String strA= editTextSoA.getText().toString();

        String strB= editTextSoB.getText().toString();

        int so_A= Integer.parseInt(strA);
        int so_B= Integer.parseInt(strB);
        int tong  =  so_A +so_B;
        String strTong = String.valueOf(tong);
        editTextKetQua.setText(strTong);
    }
}