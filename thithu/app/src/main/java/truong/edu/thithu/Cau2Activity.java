package truong.edu.thithu;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Cau2Activity extends AppCompatActivity {

    ListView listView;
    String[] items = {"Toán", "Vật Lý", "Hóa Học", "Sinh Học", "Lịch Sử", "Địa Lý", "Ngữ Văn", "Tiếng Anh", "Tin Học", "Giáo Dục Công Dân"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau2);  // Phải đặt trước findViewById()

        listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) ->
                Toast.makeText(Cau2Activity.this, "Bạn chọn: " + items[position], Toast.LENGTH_SHORT).show());
    }
}

