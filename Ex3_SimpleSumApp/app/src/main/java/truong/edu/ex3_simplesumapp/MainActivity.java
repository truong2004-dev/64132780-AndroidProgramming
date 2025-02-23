package truong.edu.ex3_simplesumapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private EditText edtNumber1, edtNumber2;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ view
        edtNumber1 = findViewById(R.id.edtNumber1);
        edtNumber2 = findViewById(R.id.edtNumber2);
        tvResult = findViewById(R.id.tvResult);
    }

    // Xử lý sự kiện khi nhấn nút "Tính tổng"
    public void calculateSum(View view) {
        try {
            // Lấy giá trị từ EditText
            double num1 = Double.parseDouble(edtNumber1.getText().toString());
            double num2 = Double.parseDouble(edtNumber2.getText().toString());

            // Tính tổng
            double sum = num1 + num2;

            // Hiển thị kết quả
            tvResult.setText("Kết quả: " + sum);
        } catch (NumberFormatException e) {
            // Báo lỗi nếu nhập sai định dạng
            Toast.makeText(this, "Vui lòng nhập số hợp lệ!", Toast.LENGTH_SHORT).show();
        }
    }
}