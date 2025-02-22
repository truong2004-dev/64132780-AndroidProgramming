package truong.edu.ex2_linearlayout;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Đảm bảo tệp XML được liên kết đúng

        // Xử lý hiển thị toàn màn hình
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Khai báo và ánh xạ Button từ XML
        Button btn1 = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);

        // Xử lý sự kiện click
        btn1.setOnClickListener(v ->
                Toast.makeText(this, "Nút 1 được nhấn", Toast.LENGTH_SHORT).show()
        );

        btn2.setOnClickListener(v ->
                Toast.makeText(this, "Nút 2 được nhấn", Toast.LENGTH_SHORT).show()
        );
    }
}
