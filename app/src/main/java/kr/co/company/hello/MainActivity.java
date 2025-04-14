package kr.co.company.hello;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

// 📱 메인 액티비티 클래스 (앱 실행 시 가장 먼저 실행되는 화면)
public class MainActivity extends AppCompatActivity {

    // 앱 실행 시 자동으로 호출되는 메서드
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // activity_main.xml 레이아웃 파일을 이 액티비티에 연결
        setContentView(R.layout.activity_main);
    }
}
