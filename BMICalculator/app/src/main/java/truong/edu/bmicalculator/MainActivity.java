package truong.edu.bmicalculator;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText edtHeight, edtWeight;
    private RadioGroup radioGroup;
    private RadioButton radioMale, radioFemale;
    private Button btnCalculate;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ các View từ XML
        edtHeight = findViewById(R.id.edt_height);
        edtWeight = findViewById(R.id.edt_weight);
        radioGroup = findViewById(R.id.radioGroup);
        radioMale = findViewById(R.id.radioMale);
        radioFemale = findViewById(R.id.radioFemale);
        btnCalculate = findViewById(R.id.btnCalculate);
        txtResult = findViewById(R.id.txt_result);

        // Xử lý sự kiện khi bấm nút "Đánh Giá"
        btnCalculate.setOnClickListener(view -> calculateBMI());
    }

    private void calculateBMI() {
        // Kiểm tra nhập liệu
        if (edtHeight.getText().toString().isEmpty() || edtWeight.getText().toString().isEmpty()) {
            txtResult.setText("Vui lòng nhập chiều cao và cân nặng!");
            txtResult.setTextColor(Color.RED);
            return;
        }

        // Lấy dữ liệu từ EditText
        float height = Float.parseFloat(edtHeight.getText().toString()) / 100; // Chuyển cm -> mét
        float weight = Float.parseFloat(edtWeight.getText().toString());

        if (height <= 0 || weight <= 0) {
            txtResult.setText("Chiều cao và cân nặng phải lớn hơn 0!");
            txtResult.setTextColor(Color.RED);
            return;
        }

        // Tính chỉ số BMI
        float bmi = weight / (height * height);

        // Xác định giới tính
        String gender = radioMale.isChecked() ? "Nam" : "Nữ";

        // Đánh giá BMI
        String result;
        int color;
        if (bmi < 18.5) {
            result = "Gầy";
            color = Color.BLUE;
        } else if (bmi < 24.9) {
            result = "Bình thường";
            color = Color.GREEN;
        } else if (bmi < 29.9) {
            result = "Hơi béo";
            color = Color.parseColor("#FFA500"); // Orange
        } else {
            result = "Béo phì";
            color = Color.RED;
        }

        // Hiển thị kết quả
        txtResult.setText("Giới tính: " + gender + "\nBMI: " + String.format("%.1f", bmi) + "\nĐánh giá: " + result);
        txtResult.setTextColor(color);
    }
}
