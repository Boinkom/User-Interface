package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.gridLayout), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

//            // Создаем FrameLayout программно
//            FrameLayout frameLayout = new FrameLayout(this);
//            FrameLayout.LayoutParams frameParams = new FrameLayout.LayoutParams(
//                    FrameLayout.LayoutParams.WRAP_CONTENT,
//                    FrameLayout.LayoutParams.WRAP_CONTENT
//            );
//            frameParams.width = convertDpToPx(155);  // Конвертация dp в пиксели
//            frameParams.height = convertDpToPx(223); // Конвертация dp в пиксели
//            frameParams.setMargins(convertDpToPx(-330), convertDpToPx(750), convertDpToPx(5), 0);  // Задаем отступы в dp
//            frameLayout.setLayoutParams(frameParams);
//
//            // Создаем ImageView программно
//            ImageView imageView = new ImageView(this);
//            FrameLayout.LayoutParams imageParams = new FrameLayout.LayoutParams(
//                    convertDpToPx(153), convertDpToPx(222)  // Конвертация dp в пиксели
//            );
//            imageView.setLayoutParams(imageParams);
//            imageView.setImageResource(R.drawable.imagedrive); // Устанавливаем изображение
//
//            // Создаем первый TextView (название фильма)
//            TextView textView1 = new TextView(this);
//            FrameLayout.LayoutParams textParams1 = new FrameLayout.LayoutParams(
//                    FrameLayout.LayoutParams.WRAP_CONTENT,
//                    FrameLayout.LayoutParams.WRAP_CONTENT
//            );
//            textParams1.setMargins(convertDpToPx(15), convertDpToPx(195), convertDpToPx(15), 0);  // Отступы в dp
//            textView1.setLayoutParams(textParams1);
//            textView1.setText("Drive");
//            textView1.setTextColor(getResources().getColor(R.color.white));
//            textView1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);  // Размер текста в sp
//
//            // Создаем второй TextView (описание жанра)
//            TextView textView2 = new TextView(this);
//            FrameLayout.LayoutParams textParams2 = new FrameLayout.LayoutParams(
//                    FrameLayout.LayoutParams.WRAP_CONTENT,
//                    FrameLayout.LayoutParams.WRAP_CONTENT
//            );
//            textParams2.setMargins(convertDpToPx(15), convertDpToPx(185), convertDpToPx(15), 0);  // Отступы в dp
//            textView2.setLayoutParams(textParams2);
//            textView2.setText("Action, Drama, Adventure");
//            textView2.setTextColor(getResources().getColor(R.color.white));
//            textView2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 10);  // Размер текста в sp
//
//            // Добавляем ImageView и TextView в FrameLayout
//            frameLayout.addView(imageView);
//            frameLayout.addView(textView1);
//            frameLayout.addView(textView2);
//
//            // Устанавливаем FrameLayout как основное содержимое активности
//            setContentView(frameLayout);
        });
    }
}