package kr.co.company.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout layoutContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editName = findViewById(R.id.editName);
        EditText editAddress = findViewById(R.id.editAddress);
        EditText editPhone = findViewById(R.id.editPhone);
        Button btnAdd = findViewById(R.id.btnAdd);
        layoutContainer = findViewById(R.id.layoutContainer);

        btnAdd.setOnClickListener(v -> {
            String name = editName.getText().toString();
            String address = editAddress.getText().toString();
            String phone = editPhone.getText().toString();

            // 카드 XML 레이아웃 불러오기
            LayoutInflater inflater = LayoutInflater.from(this);
            View cardView = inflater.inflate(R.layout.friend_card, layoutContainer, false);

            // 안의 텍스트뷰에 데이터 설정
            TextView tvName = cardView.findViewById(R.id.tvName);
            TextView tvAddress = cardView.findViewById(R.id.tvAddress);
            TextView tvPhone = cardView.findViewById(R.id.tvPhone);

            tvName.setText("👤 " + name);
            tvAddress.setText("🏠 " + address);
            tvPhone.setText("📞 " + phone);

            // 카드 삭제
            Button btnDelete = cardView.findViewById(R.id.btnDelete);
            btnDelete.setOnClickListener(deleteView -> {
                layoutContainer.removeView(cardView); // 이 카드만 삭제
            });

            // 카드 추가
            layoutContainer.addView(cardView);

            // 입력창 초기화
            editName.setText("");
            editAddress.setText("");
            editPhone.setText("");
        });
    }
}
