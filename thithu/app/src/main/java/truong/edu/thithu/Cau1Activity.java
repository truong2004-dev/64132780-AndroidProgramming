package truong.edu.thithu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Cau1Activity extends AppCompatActivity {
    EditText editTextSoa;
    EditText editTextSob;
    EditText editTextKQ;
    Button btnTinhTong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau1);
        TimView();
    }

    void TimView() {
        editTextSoa = findViewById(R.id.edtSoa);
        editTextSob = findViewById(R.id.edtSob);
        editTextKQ = findViewById(R.id.edtKq);
        btnTinhTong = findViewById(R.id.btnTinhTong);
    }

    public void XuLyCong(View v) {
        String soThu1 = editTextSoa.getText().toString();
        String soThu2 = editTextSob.getText().toString();

        if (!soThu1.isEmpty() && !soThu2.isEmpty()) {
            try {
                float soA = Float.parseFloat(soThu1);
                float soB = Float.parseFloat(soThu2);
                float Tong = soA + soB;

                editTextKQ.setText(String.valueOf(Tong));
            } catch (NumberFormatException e) {
                editTextKQ.setText("Lỗi nhập số!");
            }
        } else {
            editTextKQ.setText("Vui lòng nhập đủ số!");
        }
    }
}
