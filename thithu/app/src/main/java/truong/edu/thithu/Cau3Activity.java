package truong.edu.thithu;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class Cau3Activity extends AppCompatActivity {

    RecyclerView recyclerView;
    ItemAdapter adapter;
    List<ItemModel> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau3);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Tạo danh sách môn học
        itemList = new ArrayList<>();
        itemList.add(new ItemModel("Toán", "Môn học về số và công thức"));
        itemList.add(new ItemModel("Vật Lý", "Nghiên cứu các hiện tượng tự nhiên"));
        itemList.add(new ItemModel("Hóa Học", "Khám phá phản ứng và chất"));
        itemList.add(new ItemModel("Sinh Học", "Nghiên cứu về sự sống"));
        itemList.add(new ItemModel("Lịch Sử", "Tìm hiểu về quá khứ của nhân loại"));
        itemList.add(new ItemModel("Địa Lý", "Khám phá các vùng đất và môi trường"));
        itemList.add(new ItemModel("Ngữ Văn", "Học về ngôn ngữ và văn chương"));
        itemList.add(new ItemModel("Tiếng Anh", "Ngoại ngữ phổ biến nhất thế giới"));
        itemList.add(new ItemModel("Tin Học", "Lập trình và công nghệ máy tính"));
        itemList.add(new ItemModel("Giáo Dục Công Dân", "Học về quyền và trách nhiệm xã hội"));

        // Set adapter
        adapter = new ItemAdapter(itemList, this);
        recyclerView.setAdapter(adapter);
    }
}