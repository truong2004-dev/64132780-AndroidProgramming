package truong.edu.ex5_addsubmuldiv_anynomous;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText edtSoA, edtSoB;
    Button btnCong, btnTru, btnNhan, btnChia;
    TextView tvKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tìm view
        edtSoA = findViewById(R.id.editTextA);
        edtSoB = findViewById(R.id.editTextB);
        btnCong = findViewById(R.id.buttonCong);
        btnTru = findViewById(R.id.buttonTru);
        btnNhan = findViewById(R.id.buttonNhan);
        btnChia = findViewById(R.id.buttonChia);
        tvKetQua = findViewById(R.id.textViewKetQua);

        // Đăng ký bộ lắng nghe ẩn danh cho các nút
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhToan("+");
            }
        });

        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhToan("-");
            }
        });

        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhToan("*");
            }
        });

        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhToan("/");
            }
        });
    }

    // Hàm tính toán chung
    private void tinhToan(String phepToan) {
        String strA = edtSoA.getText().toString();
        String strB = edtSoB.getText().toString();

        if (strA.isEmpty() || strB.isEmpty()) {
            tvKetQua.setText("Vui lòng nhập số!");
            return;
        }

        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);
        double ketQua = 0;

        switch (phepToan) {
            case "+":
                ketQua = a + b;
                break;
            case "-":
                ketQua = a - b;
                break;
            case "*":
                ketQua = a * b;
                break;
            case "/":
                if (b == 0) {
                    tvKetQua.setText("Không thể chia cho 0!");
                    return;
                }
                ketQua = a / b;
                break;
        }

        tvKetQua.setText("Kết quả: " + ketQua);
    }
}
