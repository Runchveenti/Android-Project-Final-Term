package vn.edu.nguyenngocanhthu.quizatapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.graphics.Color;
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
     private String  selectedOptionByUser = "";

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

        // Set cho phần câu hỏi
        final String getSelectedTopicName = getIntent().getStringExtra("selectedTopic");
        selectedTopicName.setText(getSelectedTopicName);
        questionsLists = QuestionsBank.getQuestions(getSelectedTopicName);

        startTime(timer);
        questions.setText((currentQuestionPosition+1) +"/"+ questionsLists.size());
        question.setText(questionsLists.get(0).getQuestion());

        // Set cho phần option 1,2,3,4
        option1.setText(questionsLists.get(0).getOption1());
        option2.setText(questionsLists.get(0).getOption2());
        option3.setText(questionsLists.get(0).getOption3());
        option4.setText(questionsLists.get(0).getOption4());
        option1.setOnClickListener(new View.OnClickListener() {     // set chọn đáp án 1
            @Override
            public void onClick(View v) {
                if (selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = option1.getText().toString();
                    option1.setBackgroundResource(R.drawable.round_back_red_option);
                    option1.setTextColor(Color.WHITE);

                    //  Hiện đáp án sau khi người dùng chọn câu trả lời
                    revealAnswer();
                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });
        option2.setOnClickListener(new View.OnClickListener() {     // set chọn đáp án 2
            @Override
            public void onClick(View v) {
                if (selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = option2.getText().toString();
                    option2.setBackgroundResource(R.drawable.round_back_red_option);
                    option2.setTextColor(Color.WHITE);

                    //  Hiện đáp án sau khi người dùng chọn câu trả lời
                    revealAnswer();
                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });
        option3.setOnClickListener(new View.OnClickListener() {     // set chọn đáp án 3
            @Override
            public void onClick(View v) {
                if (selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = option3.getText().toString();
                    option3.setBackgroundResource(R.drawable.round_back_red_option);
                    option3.setTextColor(Color.WHITE);

                    //  Hiện đáp án sau khi người dùng chọn câu trả lời
                    revealAnswer();
                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });
        option4.setOnClickListener(new View.OnClickListener() {     // set chọn đáp án 4
            @Override
            public void onClick(View v) {
                if (selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = option4.getText().toString();
                    option4.setBackgroundResource(R.drawable.round_back_red_option);
                    option4.setTextColor(Color.WHITE);

                    //  Hiện đáp án sau khi người dùng chọn câu trả lời
                    revealAnswer();
                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });
        nextBtn.setOnClickListener(new View.OnClickListener() {    // set event cho nút Next
            @Override
            public void onClick(View v) {
                if (selectedOptionByUser.isEmpty()){
                    Toast.makeText(QuizActivity.this,"Please select an option",Toast.LENGTH_SHORT).show();
                }
                else{
                    changeNextQuestion();
                }
            }
        });
        backBtn.setOnClickListener(new View.OnClickListener() {    // set event cho nút Back
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

       // Đổi câu hỏi tiếp theo và khi hết câu hỏi thì sẽ hiện submit
    private void changeNextQuestion(){
        currentQuestionPosition++;
        if ((currentQuestionPosition+1) == questionsLists.size()){      //   set submit khi người dùng tới câu hỏi cuối cùng
            nextBtn.setText("Submit Quiz");
        }
        if (currentQuestionPosition < questionsLists.size()){
            selectedOptionByUser = "";

            option1.setBackgroundResource(R.drawable.round_back_white_stroke);   // option1
            option1.setTextColor(Color.parseColor("#1F6BB8"));

            option2.setBackgroundResource(R.drawable.round_back_white_stroke);   // option2
            option2.setTextColor(Color.parseColor("#1F6BB8"));

            option3.setBackgroundResource(R.drawable.round_back_white_stroke);   // option3
            option3.setTextColor(Color.parseColor("#1F6BB8"));

            option4.setBackgroundResource(R.drawable.round_back_white_stroke);   // option4
            option4.setTextColor(Color.parseColor("#1F6BB8"));

            // Chuyển sang câu hỏi tiếp theo khi người dùng bấm nút Next
            questions.setText((currentQuestionPosition+1) +"/"+ questionsLists.size());
            question.setText(questionsLists.get(currentQuestionPosition).getQuestion());

            // Set cho phần option 1,2,3,4
            option1.setText(questionsLists.get(currentQuestionPosition).getOption1());
            option2.setText(questionsLists.get(currentQuestionPosition).getOption2());
            option3.setText(questionsLists.get(currentQuestionPosition).getOption3());
            option4.setText(questionsLists.get(currentQuestionPosition).getOption4());

        }
        else {
            Intent intent = new Intent(QuizActivity.this, QuizResults.class);
            intent.putExtra("correct", getCorrectAnswers());
            intent.putExtra("incorrect", getInCorrectAnswers());
            startActivity(intent);

            finish();
        }
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

    //====== Set Back button


    // Hiện câu trả lời đúng, sai
    private void revealAnswer(){
        final String getAnswer = questionsLists.get(currentQuestionPosition).getAnswer();
        // Option1
        if (option1.getText().toString().equals(getAnswer)){
            option1.setBackgroundResource(R.drawable.round_back_green);
            option1.setTextColor(Color.WHITE);
        }
        else if (option2.getText().toString().equals(getAnswer)) {        // Option2
            option2.setBackgroundResource(R.drawable.round_back_green);
            option2.setTextColor(Color.WHITE);
        }
        else if (option3.getText().toString().equals(getAnswer)) {        // Option3
            option3.setBackgroundResource(R.drawable.round_back_green);
            option3.setTextColor(Color.WHITE);
        }
        else if (option4.getText().toString().equals(getAnswer)) {        // Option4
            option4.setBackgroundResource(R.drawable.round_back_green);
            option4.setTextColor(Color.WHITE);
        }
    }
}