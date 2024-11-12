package com.example.week10_homework;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton rbDog, rbCat, rbRabbit;
    Button btnShowImage;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("동물 그림 보기");

        // XML에서 뷰 참조
        radioGroup = findViewById(R.id.radioGroup);
        rbDog = findViewById(R.id.rbDog);
        rbCat = findViewById(R.id.rbCat);
        rbRabbit = findViewById(R.id.rbRabbit);
        btnShowImage = findViewById(R.id.btnShowImage);
        imageView = findViewById(R.id.imageView);

        // "그림보기" 버튼 클릭 이벤트 처리
        btnShowImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 선택된 라디오 버튼 확인
                int selectedId = radioGroup.getCheckedRadioButtonId();

                if (selectedId == R.id.rbDog) {
                    imageView.setImageResource(R.drawable.rb_dog);
                } else if (selectedId == R.id.rbCat) {
                    imageView.setImageResource(R.drawable.rb_cat);
                } else if (selectedId == R.id.rbRabbit) {
                    imageView.setImageResource(R.drawable.rb_rabbit);
                }
            }
        });
    }
}