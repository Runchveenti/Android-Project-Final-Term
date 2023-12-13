package vn.edu.nguyenngocanhthu.quizatapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class QuizActivity extends AppCompatActivity {
     private TextView questions;
     private TextView question;
     private AppCompatButton option1, option2, option3, option4;
     private AppCompatButton nextBtn;
     private Timer quizTimer;
     private int timeInMins = 1;
     private int seconds = 0;
     private List<QuestionsList>  questionsLists ;
     private int currentQuestionPosition = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        final ImageView backBtn = findViewById(R.id.backBtn);
        final TextView timer = findViewById(R.id.timer);
        final TextView selectedTopicName = findViewById(R.id.topicName);

        question = findViewById(R.id.question);
        questions = findViewById(R.id.questions);

        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);
        nextBtn = findViewById(R.id.nextBtn);

        final String getSelectedTopicName = getIntent().getStringExtra("selectedTopic");
        selectedTopicName.setText(getSelectedTopicName);
        questionsLists = QuestionsBank.getQuestions(getSelectedTopicName);

        startTime(timer);
        questions.setText(currentQuestionPosition+1);
        question.setText(currentQuestionPosition);

        option1.setOnClickListener(new View.OnClickListener() {     // set chọn đáp án 1
            @Override
            public void onClick(View v) {

            }
        });
        option2.setOnClickListener(new View.OnClickListener() {     // set chọn đáp án 2
            @Override
            public void onClick(View v) {

            }
        });
        option3.setOnClickListener(new View.OnClickListener() {     // set chọn đáp án 3
            @Override
            public void onClick(View v) {

            }
        });
        option4.setOnClickListener(new View.OnClickListener() {     // set chọn đáp án 4
            @Override
            public void onClick(View v) {

            }
        });
        nextBtn.setOnClickListener(new View.OnClickListener() {    // set event cho nút Next
            @Override
            public void onClick(View v) {

            }
        });
    }

// Set thời gian đếm ngược cho người dùng thực hiện bài trắc nghiệm
    private void startTime(TextView timerTextView){
        quizTimer = new Timer();
        quizTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (seconds == 0){
                    timeInMins--;
                    seconds = 59;
                }
                else if (seconds == 0 && timeInMins == 0){
                    quizTimer.purge();  // xoá dữ liệu khi hết giờ
                    quizTimer.cancel();

                    Toast.makeText(QuizActivity.this, "Time is over!", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(QuizActivity.this, QuizResults.class);
                    intent.putExtra("That's A Correct Answer", getCorrectAnswers());
                    intent.putExtra("Sorry, That's Not A Correct Answer!", getInCorrectAnswers());
                    startActivity(intent);
                    finish();
                }
                else {
                    seconds--;
                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        String finalMinutes = String.valueOf(timeInMins);
                        String finaleSeconds = String.valueOf(seconds);

                        if (finalMinutes.length() == 1){
                            finalMinutes = "0" + finalMinutes;
                        }
                        if (finaleSeconds.length() == 1){
                            finaleSeconds = "0" + finaleSeconds;
                        }
                        timerTextView.setText(finalMinutes + ":" + finaleSeconds);
                    }
                });
            }

        }, 1000, 1000);
    }

    // Nếu người dùng chọn là đáp án đúng
    private int getCorrectAnswers(){
        int correctAnswers = 0;
        for (int i=0; i<questionsLists.size(); i++ ){
            final String getUserSelectedAnswer = questionsLists.get(i).getUserSelectedAnswer();
            final String getAnswer = questionsLists.get(i).getAnswer();

            if (getUserSelectedAnswer.equals(getAnswer)){
                correctAnswers++;
            }
        }
        return correctAnswers;
    }

    // Nếu người dùng chọn là đáp án không đúng
    private int getInCorrectAnswers(){
        int correctAnswers = 0;
        for (int i=0; i<questionsLists.size(); i++ ){
            final String getUserSelectedAnswer = questionsLists.get(i).getUserSelectedAnswer();
            final String getAnswer = questionsLists.get(i).getAnswer();

            if (!getUserSelectedAnswer.equals(getAnswer)){
                correctAnswers++;
            }
        }
        return correctAnswers;
    }


}