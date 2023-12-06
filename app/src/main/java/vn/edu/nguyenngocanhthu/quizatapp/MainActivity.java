package vn.edu.nguyenngocanhthu.quizatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String selectedTopicName = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout cplus = findViewById(R.id.cplusLayout);
        final LinearLayout android = findViewById(R.id.androidLayout);
        final LinearLayout css = findViewById(R.id.cssLayout);
        final LinearLayout html = findViewById(R.id.htmlLayout);

        final Button startBtn = findViewById(R.id.startQuizBtn);

        cplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "C++";
                cplus.setBackgroundResource(R.drawable.round_back_stroke);
                android.setBackgroundResource(R.drawable.round_back_white);
                css.setBackgroundResource(R.drawable.round_back_white);
                html.setBackgroundResource(R.drawable.round_back_white);
            }
        });

        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "Android";
                android.setBackgroundResource(R.drawable.round_back_stroke);
                cplus.setBackgroundResource(R.drawable.round_back_white);
                css.setBackgroundResource(R.drawable.round_back_white);
                html.setBackgroundResource(R.drawable.round_back_white);
            }
        });

        css.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "CSS";
                css.setBackgroundResource(R.drawable.round_back_stroke);
                cplus.setBackgroundResource(R.drawable.round_back_white);
                android.setBackgroundResource(R.drawable.round_back_white);
                html.setBackgroundResource(R.drawable.round_back_white);
            }
        });

        html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "HTML";
                html.setBackgroundResource(R.drawable.round_back_stroke);
                cplus.setBackgroundResource(R.drawable.round_back_white);
                css.setBackgroundResource(R.drawable.round_back_white);
                android.setBackgroundResource(R.drawable.round_back_white);
            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedTopicName.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please select the Topic", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                    intent.putExtra("selectedTopic", selectedTopicName);   // Đặt dữ liệu vào
                    startActivity(intent);
                }
            }
        });
    }
}